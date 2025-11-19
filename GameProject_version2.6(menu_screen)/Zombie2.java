// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Zombie2 extends Actor
{
    private int action = 0;
    private int ySpeed = 4;
    private GreenfootImage rightImage =  new  GreenfootImage("ZOMBIE2_rightImage.png");
    private GreenfootImage leftImage =  new  GreenfootImage("ZOMBIE2_leftImage.png");

    /**
     * Act - do whatever the Zombie2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        RandomAction();
        movingAround();
        killCop();
        if (isTouching(Barrier.class)) {
            action = 2;
            /* when he touch the barrier he move upward*/
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
        /* move right*/
        if (action == 0) {
            move(1);
            setImage(rightImage);
        }
        /* move left*/
        if (action == 1) {
            move(-1);
            setImage(leftImage);
        }
        /* move upward*/
        if (action == 2) {
            setLocation(getX(), getY() - 1);
        }
        /* /move downward*/
        if (action == 3) {
            setLocation(getX(), getY() + 1);
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
    public void killCop()
    {
        Actor cop = getOneIntersectingObject(Cop.class);
        if (cop != null) {
            World world = getWorld();
            world.removeObject(cop);
        }
    }
}
