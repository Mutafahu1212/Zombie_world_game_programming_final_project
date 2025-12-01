import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snow extends World
{

    /**
     * Constructor for objects of class Snow.
     */
    public Snow()
    {
        super(1250, 820, 1);
        prepare();
        Counter.killcount = 0;
        showText("Civilians Eaten: ", 400, 860);

        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PoliceHQ policeHQ =  new  PoliceHQ();
        addObject(policeHQ, 754, 390);
        policeHQ.setLocation(948, 280);
        policeHQ.setLocation(951, 254);
        zombie zombie =  new  zombie();
        addObject(zombie, 272, 564);
    }
}
