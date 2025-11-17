import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends World
{
    double timeSplashScreenCreation = System.currentTimeMillis();
    /**
     * Constructor for objects of class SplashScreen.
     * 
     */
    public SplashScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(624, 624, 1); 
        prepare();
    }

    public void act()
    {
        int diff = (int) (System.currentTimeMillis() - timeSplashScreenCreation);
        int timerValue = (int) (System.currentTimeMillis() - timeSplashScreenCreation)/1000;
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new VanierSplashScreen()); 

        }

        if (System.currentTimeMillis() >= (timeSplashScreenCreation + (7 * 1000)))
        {
            Greenfoot.setWorld(new VanierSplashScreen()); 
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}