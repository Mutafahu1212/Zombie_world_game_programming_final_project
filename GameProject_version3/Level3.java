import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Level3 extends Actor
{

    /**
     * Act - do whatever the Level3 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("Level3_Button_Highlighted.png");
        }
        
        if (Greenfoot.mouseMoved(getWorld()))
        {
         setImage("Level3_Button.png");   
        }
        
        if (Greenfoot.mouseClicked(this))
        {
            
            Display display = new Display();
            getWorld().addObject(display , 320, 500);
            display.setImage(new GreenfootImage("You have selected Level 3 ", 35, Color.WHITE, Color.BLACK, Color.RED));
            Greenfoot.playSound("ClickSplashScreens(high_volume).wav");
            Greenfoot.setWorld(new Desert());
        }
    }
}
}