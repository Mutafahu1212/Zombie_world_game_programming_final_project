import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class ZombieWithKillPower extends Actor
{
    /* WARNING: This file is auto-generated and any changes to it will be overwritten*/
    private int ySpeed = 4;
    private GreenfootImage leftImage =  new  GreenfootImage("Zombie_leftImage_kill_power.png");
    private GreenfootImage rightImage =  new  GreenfootImage("Zombie_rightImage_kill_power.png");
    private int timer = 0;

    /**
     * Act - do whatever the ZombieWithKillPower wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        infectionByMainZombie();
        /* example movement speed Check for barrier collision*/
        if (isTouching(Barrier.class)) {
            if (Greenfoot.isKeyDown("down")) {
                setLocation(getX(), getY() - ySpeed);
            }
            /* push back to prevent crossing*/
        }
        if (isGameWon()) {
            transitionToGameWorld();
        }
        getWorld().showText(" " + PoliceStation.killcount + "/10", 500, 860);
        addCiviliansInRandomSpots();
        eatKillPowerUp();
        spawnKillPowerUp();
        killCops();
        endKillPower();
        timer = timer + 1;
    }

    /**
     * 
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("left")) {
            move(-4);
            setImage(leftImage);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(4);
            setImage(rightImage);
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - ySpeed);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + ySpeed);
        }
    }

    /**
     * 
     */
    public void infectionByMainZombie()
    {
        Actor civilian1 = getOneIntersectingObject(Civilian1.class);
        if (civilian1 != null) {
            World world = getWorld();
            world.removeObject(civilian1);
            Zombie2 zombie2 =  new  Zombie2();
            getWorld().addObject(zombie2, getX(), getY());
            Greenfoot.playSound("ZombieSpawn(pitched).wav");
            PoliceStation.killcount = PoliceStation.killcount + 1;
        }
    }

    /**
     * 
     */
    public void eatKillPowerUp()
    {
        Actor killPowerUp = getOneIntersectingObject(KillPowerUp.class);
        if (killPowerUp != null) {
            World world = getWorld();
            Greenfoot.playSound("EatKillPowerUp(mixed&pitched).wav");
            world.removeObject(killPowerUp);
        }
    }

    /**
     * 
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (PoliceStation.killcount == 10) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameWorld()
    {
        World gameWinWorld =  new  GameWinWorld();
        Greenfoot.setWorld(gameWinWorld);
    }

    /**
     * 
     */
    public void addCiviliansInRandomSpots()
    {
        int x = Greenfoot.getRandomNumber(1450);
        int y = Greenfoot.getRandomNumber(880);
        int popCivilian = Greenfoot.getRandomNumber(200);
        if (popCivilian == 1) {
            Civilian1 civilian1 =  new  Civilian1();
            getWorld().addObject(civilian1, x, y);
        }
    }

    /**
     * 
     */
    public void spawnKillPowerUp()
    {
        int x = Greenfoot.getRandomNumber(1450);
        int y = Greenfoot.getRandomNumber(880);
        int popKillPowerUp = Greenfoot.getRandomNumber(300);
        if (popKillPowerUp == 1) {
            KillPowerUp KillPowerUp =  new  KillPowerUp();
            getWorld().addObject(KillPowerUp, x, y);
        }
    }

    /**
     * 
     */
    public void killCops()
    {
        Actor cop = getOneIntersectingObject(Cop.class);
        if (cop != null) {
            World world = getWorld();
            world.removeObject(cop);
        }
    }

    /**
     * 
     */
    public void endKillPower()
    {
        if (timer > 600) {
            timer = 0;
            World world = getWorld();
            zombie z =  new  zombie();
            getWorld().addObject(z, getX(), getY());
            world.removeObject(this);
        }
    }
}
