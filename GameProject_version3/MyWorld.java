import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    private int livesRemaining;
    
    

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(1450, 880, 1);
        getBackground().setColor(Color.WHITE);
        getBackground().fillRect(0, 830, 1500, 69);
        showText("Lives Remaining: ", 100, 860);
        getBackground().setColor(Color.BLACK);
        showText("Civilians Eaten: ", 400, 860);
        prepare();
        Counter.killcount = 0;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Barrier barrier =  new  Barrier();
        addObject(barrier, 596, 747);
        barrier.setLocation(724, 873);
        zombie zombie =  new  zombie();
        addObject(zombie, 345, 602);
        PoliceStation policeStation =  new  PoliceStation();
        addObject(policeStation, 1349, 573);
        Civilian1 civilian1 =  new  Civilian1();
        addObject(civilian1, 807, 185);
        Civilian1 civilian12 =  new  Civilian1();
        addObject(civilian12, 1021, 178);
        Civilian1 civilian13 =  new  Civilian1();
        addObject(civilian13, 1288, 170);
        policeStation.setLocation(1389, 751);
        removeObject(policeStation);
        removeObject(civilian13);
        removeObject(civilian12);
        removeObject(civilian1);
        PoliceStation policeStation2 =  new  PoliceStation();
        addObject(policeStation2, 732, 344);
        
    }
}
