// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Cop extends Actor
{
     int action = 0;
    private int ySpeed = 0;
    private GreenfootImage leftImage =  new GreenfootImage("COP_leftImage.png");
    private GreenfootImage rightImage =  new GreenfootImage("COP_rightImage.png");
    private int zombieLivesRemaining = 5;

    /**
     * Act - do whatever the Cop wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        RandomAction();
        movingAround();
        killZombie2();
        killZombie();
        if (isTouching(Barrier.class)) {
            action = 2;
            /* whenever he touches the barrier he move upward*/
        }
        if (isGameLost()) {
            transitionToGameOver();
        }
    }

    /**
     * 
     */
    public void RandomAction()
    {
        int randomNumber = Greenfoot.getRandomNumber(300);
        if (randomNumber < 4) {
            action = randomNumber;
        }
    }

    /**
     * 
     */
    public void movingAround()
    {
        /* //move  right*/
        if (action == 0) {
            move(3);
            setImage(rightImage);
        }
        /* //move  left*/
        if (action == 1) {
            move(-3);
            setImage(leftImage);
        }
        /* //move  upward*/
        if (action == 2) {
            setLocation(getX(), getY() - 3);
        }
        /* //move downward*/
        if (action == 3) {
            setLocation(getX(), getY() + 3);
        }
        if (isAtEdge() && getX() < 200) {
            action = 0;
        }
        if (isAtEdge() && getX() > 600) {
            action = 1;
        }
        if (isAtEdge() && getY() > 550) {
            action = 2;
        }
        if (isAtEdge() && getY() < 200) {
            action = 3;
        }
        if (isAtEdge() && getY() == 500 && getX() > 200) {
            action = 1;
        }
        if (isAtEdge() && getY() == 500 && getX() < 200) {
            action = 0;
        }
        if (isAtEdge() && getX() == 500 && getY() > 200) {
            action = 2;
        }
        if (isAtEdge() && getX() == 500 && getY() < 500) {
            action = 3;
        }
    }

    /**
     * 
     */
    public void killZombie()
    {
        Actor zombie = getOneIntersectingObject(zombie.class);
        if (zombie != null) {
            zombieLivesRemaining = zombieLivesRemaining - 1;
            if (zombieLivesRemaining == 0) {
                World world = getWorld();
                world.removeObject(zombie);
            }
        }
    }

    /**
     * 
     */
    public void killZombie2()
    {
        Actor zombie2 = getOneIntersectingObject(Zombie2.class);
        if (zombie2 != null) {
            World world = getWorld();
            world.removeObject(zombie2);
        }
    }

    /**
     * 
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(zombie.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameOver()
    {
        World gameLoseWorld =  new GameLoseWorld();
        Greenfoot.setWorld(gameLoseWorld);
    }

    /**
     * 
     */
    public void killzombie()
    {
        Actor cop = getOneIntersectingObject(Cop.class);
        if (cop != null) {
            World world = getWorld();
            world.removeObject(cop);
        }
    }
}
