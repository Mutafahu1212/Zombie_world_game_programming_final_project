import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Level1 extends Actor
{

    /**
     * Act - do whatever the Level1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    {
        if (Greenfoot.mouseMoved(this))
        {
         setImage("Level1_Button_Highlighted.png");
        }
        
        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Level1_Button.png");
        }
        
        if (Greenfoot.mouseClicked(this))
        {
            
            Display display = new Display();
            getWorld().addObject(display , 320, 500);
            Greenfoot.playSound("ClickSplashScreens(high_volume).wav");
             
            
        }
    }
}
}