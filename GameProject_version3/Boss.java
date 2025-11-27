// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Boss extends Actor
{
    private GreenfootImage leftImage =  new  GreenfootImage("BOSS_leftImage.png");
    private GreenfootImage rightImage =  new  GreenfootImage("BOSS_rightImage.png");
     int action = 0;
    private int ySpeed = 0;

    /**
     * Act - do whatever the Boss wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movingAround();
        RandomAction();
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
        /* //move downward*/
        if (isAtEdge() && getX() < 200) {
            action = 0;
        }
        if (isAtEdge() && getX() > 600) {
            action = 1;
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
