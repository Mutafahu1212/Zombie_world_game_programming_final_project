import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PoliceStation extends Actor
{
    public static int killcount = 0; 
    int countCops = 0;
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
        if (Greenfoot.getRandomNumber(20) == 1 && countCops < 10) {
            Cop cop =  new  Cop();
            getWorld().addObject(cop, getX(), getY());
            countCops = countCops + 1;
        }
    }
}
