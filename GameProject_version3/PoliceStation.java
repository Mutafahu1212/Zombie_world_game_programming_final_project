import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PoliceStation extends Actor
{
    protected int countCops = 0;
    

    /**
     * Act - do whatever the PoliceStation wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        createPolice();
        spawnKillPowerUp();
        getWorld().showText(" " + Counter.killcount + "/10", 500, 860);
    }

    /**
     * 
     */
    public void createPolice()
    {
        if (Greenfoot.getRandomNumber(250) == 1 && countCops < 5) {
            Cop cop1 =  new Cop();
            getWorld().addObject(cop1, getX(), getY());
            countCops = countCops + 1;
            Cop cop2 =  new Cop();
            getWorld().addObject(cop2, getX(), getY());
            countCops = countCops + 1;
            Cop cop3 =  new Cop();
            getWorld().addObject(cop3, getX(), getY());
            countCops = countCops + 1;
        }
    }

    /**
     * 
     */
    public void spawnKillPowerUp()
    {
        int x = Greenfoot.getRandomNumber(1450);
        int y = Greenfoot.getRandomNumber(820);
        int popKillPowerUp = Greenfoot.getRandomNumber(500);
        if (popKillPowerUp == 1 & getWorld().getObjects(KillPowerUp.class).isEmpty()) {
            KillPowerUp KillPowerUp =  new KillPowerUp();
            getWorld().addObject(KillPowerUp, x, y);
        }
    }
}
