// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PoliceStation extends Actor
{

    /**
     * Act - do whatever the PoliceStation wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        createPolice();
    }

    /**
     * 
     */
    public void createPolice()
    {
        if (Greenfoot.getRandomNumber(275) == 1) {
            Cop cop =  new Cop();
            getWorld().addObject(cop, getX(), getY());
        }
    }
}
