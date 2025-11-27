import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MenuScreen extends World
{
    double timeMenuScreenCreation = System.currentTimeMillis();
    /**
     * Constructor for objects of class MenuScreen.
     */
    public MenuScreen()
    {
        super(650, 650, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Level1 level1 =  new  Level1();
        addObject(level1, 332, 134);
        level1.setLocation(319, 122);
        level1.setLocation(277, 132);
        level1.setLocation(334, 137);
        level1.setLocation(343, 149);
        level1.setLocation(328, 152);
        level1.setLocation(334, 151);
        level1.setLocation(328, 152);
        Level2 level2 =  new  Level2();
        addObject(level2, 331, 253);
        Level3 level3 =  new  Level3();
        addObject(level3, 330, 355);
        level2.setLocation(410, 234);
        level2.setLocation(329, 234);
        level2.setLocation(438, 211);
        level2.setLocation(338, 246);
        level2.setLocation(326, 245);
        level2.setLocation(335, 244);
        level2.setLocation(328, 244);
        level2.setLocation(431, 230);
        level2.setLocation(328, 253);
        level2.setLocation(428, 232);
        level2.setLocation(427, 229);
        level2.setLocation(329, 255);
        level2.setLocation(421, 245);
        level2.setLocation(310, 273);
        level2.setLocation(333, 226);
        level2.setLocation(328, 230);
        level3.setLocation(316, 318);
        level3.setLocation(333, 312);
        level3.setLocation(331, 310);
        level3.setLocation(328, 307);
        level3.setLocation(369, 290);
        level3.setLocation(329, 318);
        level3.setLocation(366, 318);
        level3.setLocation(328, 318);
        level3.setLocation(364, 309);
        level3.setLocation(328, 308);
    }
}
