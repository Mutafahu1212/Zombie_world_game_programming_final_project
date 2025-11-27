import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Zombie2_dead extends Actor
{
    private int timer = 0;
    /**
     * Act - do whatever the Zombie2_dead wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        
    }
    public void removeBody()
    {
        if (timer > 300) {
            timer = 0;
            World world = getWorld();
            
        }
    }
}
