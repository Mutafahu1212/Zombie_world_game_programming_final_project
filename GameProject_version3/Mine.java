import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Mine extends Actor
{
    private int timer = 0;
    /**
     * Act - do whatever the Mine wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        killZombie();
        killZombie2();
        
        if (isGameLost()) {
            transitionToGameOver();
        }
    }

    /**
     * 
     */
    public void killZombie()
    {
        Actor zombie = getOneIntersectingObject(zombie.class);
        if (zombie != null) {
            World world = getWorld();
            world.removeObject(zombie);
            Greenfoot.playSound("zombieExploded.wav");
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
            Zombie2_dead zombie2_dead =  new  Zombie2_dead();
            getWorld().addObject(zombie2_dead, getX(), getY());
            Greenfoot.playSound("zombie2Exploded.wav");
            
    
        }
    }
  
   
    /**
     * 
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(ZombieWithKillPower.class).isEmpty() && world.getObjects(zombie.class).isEmpty()) {
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
        World gameLoseWorld =  new  GameLoseWorld();
        Greenfoot.setWorld(gameLoseWorld);
    }

    /**
     * 
     */
    public void removeZombie2()
    {
    }
}
