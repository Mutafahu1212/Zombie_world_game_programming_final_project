// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Civilian1 extends Actor
{
    private int action = 0;
    private int ySpeed = 0;
    private GreenfootImage leftImage =  new  GreenfootImage("CIVILIAN_leftImage.png");
    private GreenfootImage rightImage =  new  GreenfootImage("CIVILIAN_rightImage.png");

    /**
     * Act - do whatever the Civilian1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        RandomAction();
        movingAround();
        if (isTouching(Barrier.class)) {
            action = 2;
            /* push back to prevent crossing*/
        }
    }

    /**
     * 
     */
    public void RandomAction()
    {
        int randomNumber = Greenfoot.getRandomNumber(500);
        if (randomNumber < 4) {
            action = randomNumber;
        }
        /* the  numbers 0 to 3 are responsible for different movement direction*/
    }

    /**
     * 
     */
    public void addCiviliansInRandomSpots()
    {
        int x = Greenfoot.getRandomNumber(1450);
        int y = Greenfoot.getRandomNumber(880);
        int popCivilian = Greenfoot.getRandomNumber(1000);
        if (popCivilian == 1) {
            Civilian1 civilian1 =  new  Civilian1();
            getWorld().addObject(civilian1, x, y);
        }
    }

    /**
     * 
     */
    public void movingAround()
    {
        /* //Move right*/
        if (action == 0) {
            move(2);
            setImage(rightImage);
        }
        /* //move left*/
        if (action == 1) {
            move(-2);
            setImage(leftImage);
        }
        /* //move upward*/
        if (action == 2) {
            setLocation(getX(), getY() - 2);
        }
        /* //move upward*/
        if (action == 3) {
            setLocation(getX(), getY() + 2);
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
}
