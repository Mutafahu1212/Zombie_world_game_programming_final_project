import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class RemoveMine extends Actor
{

    /**
     * Act - do whatever the RemoveMine wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
     
    }

    /**
     * 
     */
    public void removeMine()
    {
           Mine mine =  new  Mine();
        World world = getWorld();
        world.removeObject(mine);
    }
}
