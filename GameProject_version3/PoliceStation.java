import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PoliceStation extends Actor
{
    
    int countCops = 0;
    /**
     * Act - do whatever the PoliceStation wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        createPolice();
        spawnKillPowerUp();
    }

    /**
     * 
     */
    public void createPolice()
    {
        if (Greenfoot.getRandomNumber(200) == 1 && countCops < 10) {
            Cop cop1 =  new  Cop();
            getWorld().addObject(cop1, getX(), getY());
            countCops = countCops + 1;
            Cop cop2 =  new  Cop();
            getWorld().addObject(cop2, getX(), getY());
            countCops = countCops + 1;
            Cop cop3 =  new  Cop();
            getWorld().addObject(cop3, getX(), getY());
            countCops = countCops + 1;
        }
    }
    public void spawnKillPowerUp()
    {
        int x = Greenfoot.getRandomNumber(1450);
        int y = Greenfoot.getRandomNumber(820);
        int popKillPowerUp = Greenfoot.getRandomNumber(300);
        if (popKillPowerUp == 1) {
            KillPowerUp KillPowerUp =  new  KillPowerUp();
            getWorld().addObject(KillPowerUp, x, y);
        }
    }
}
