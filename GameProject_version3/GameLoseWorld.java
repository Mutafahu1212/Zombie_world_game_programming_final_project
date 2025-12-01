import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameLoseWorld extends World
{
    double loseWorldScreenCreation = System.currentTimeMillis();
    /**
     * Constructor for objects of class GameLoseWorld.
     */
    public GameLoseWorld()
    {
        super(624, 520, 1);
        showText("Press 'space' button to return to menu", 290, 500);
        prepare();
    }

    /**
     * 
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(250);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }

    public void act()
    {
        int diff = (int) (System.currentTimeMillis() - loseWorldScreenCreation);
        int timerValue = (int) (System.currentTimeMillis() - loseWorldScreenCreation)/1000;
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new MenuScreen()); 
            Greenfoot.playSound("ClickSplashScreens(high_volume).wav");
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

      
    