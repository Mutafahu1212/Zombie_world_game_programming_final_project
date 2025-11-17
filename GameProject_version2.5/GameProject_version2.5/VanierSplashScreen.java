import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VanierSplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VanierSplashScreen extends World
{
    double timeVanierScreenCreation = System.currentTimeMillis();
    /**
     * Constructor for objects of class VanierSplashScreen.
     * 
     */
    public VanierSplashScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(936, 624, 1); 
    }

    public void act()
    
    {
    int diff = (int) (System.currentTimeMillis() - timeVanierScreenCreation);
     int timerValue = (int) (System.currentTimeMillis() - timeVanierScreenCreation)/1000;
     if (Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new MyWorld()); 

        }

        if (System.currentTimeMillis() >= (timeVanierScreenCreation + (4 * 1000)))
        {
            Greenfoot.setWorld(new MyWorld()); 
        }
    }
}
    
 