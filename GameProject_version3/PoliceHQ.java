import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PoliceHQ extends Actor
{
    protected int countCops = 0;

    /**
     * Act - do whatever the PoliceHQ wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        createPolice();
        getWorld().showText(" "+Counter.killcount+"/10",500,800);
        
        
        
        
        
    }

    /**
     * 
     */
    public void createPolice()
    {
        if (Greenfoot.getRandomNumber(250) == 1 && countCops < 2) {
            Cop cop1 =  new  Cop();
            getWorld().addObject(cop1, getX(), getY());
            
            Cop cop2 =  new  Cop();
            getWorld().addObject(cop2, getX(), getY());
            
            Cop cop3 =  new  Cop();
            getWorld().addObject(cop3, getX(), getY());
            countCops = countCops + 1;
        }
    }
}
