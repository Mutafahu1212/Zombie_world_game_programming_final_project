import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWinWorld extends World
{
    double winWorldScreenCreation = System.currentTimeMillis();
    /**
     * Constructor for objects of class GameWinWorld.
     */
    public GameWinWorld()
    {
        super(624, 520, 1);
        showText("Press 'space' button to return to menu", 290, 500);
    }
    public void act()
    {
        int diff = (int) (System.currentTimeMillis() - winWorldScreenCreation);
        int timerValue = (int) (System.currentTimeMillis() - winWorldScreenCreation)/1000;
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new MenuScreen()); 
            Greenfoot.playSound("ClickSplashScreens(high_volume).wav");
        }

    }
}

