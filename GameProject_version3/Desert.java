// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Desert extends World
{

    /**
     * Constructor for objects of class Desert.
     */
    public Desert()
    {
        super(1060, 800, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Boss boss =  new Boss();
        addObject(boss, 726, 473);
        Cop cop =  new Cop();
        addObject(cop, 863, 510);
        boss.setLocation(772, 392);
        boss.setLocation(764, 290);
        boss.setLocation(644, 289);
        boss.setLocation(701, 320);
        TheMine theMine =  new TheMine();
        addObject(theMine, 527, 640);
        TheMine theMine2 =  new TheMine();
        addObject(theMine2, 348, 448);
        TheMine theMine3 =  new TheMine();
        addObject(theMine3, 493, 271);
        TheMine theMine4 =  new TheMine();
        addObject(theMine4, 883, 325);
        TheMine theMine5 =  new TheMine();
        addObject(theMine5, 782, 652);
        TheMine theMine6 =  new TheMine();
        addObject(theMine6, 533, 488);
        theMine2.setLocation(270, 336);
        TheMine theMine7 =  new TheMine();
        addObject(theMine7, 309, 651);
        TheMine theMine8 =  new TheMine();
        addObject(theMine8, 268, 217);
        theMine3.setLocation(602, 198);
        theMine2.setLocation(472, 364);
        theMine2.setLocation(339, 425);
        TheMine theMine9 =  new TheMine();
        addObject(theMine9, 502, 319);
        theMine2.setLocation(247, 467);
        cop.setLocation(872, 506);
        cop.setLocation(903, 560);
        removeObject(cop);
        boss.setLocation(685, 334);
        boss.setLocation(489, 231);
        boss.setLocation(477, 303);
        boss.setLocation(554, 396);
        boss.setLocation(485, 230);
        theMine3.setLocation(700, 298);
        theMine4.setLocation(852, 450);
        theMine3.setLocation(766, 247);
        theMine9.setLocation(680, 336);
        theMine4.setLocation(931, 394);
        theMine8.setLocation(222, 181);
        theMine2.setLocation(108, 312);
        boss.setLocation(557, 243);
        boss.setLocation(588, 198);
        theMine9.setLocation(329, 315);
        theMine3.setLocation(863, 244);
        theMine9.setLocation(366, 380);
        theMine6.setLocation(620, 444);
        theMine.setLocation(622, 603);
        zombie zombie =  new zombie();
        addObject(zombie, 123, 669);
        theMine7.setLocation(369, 538);
        theMine.setLocation(552, 658);
        theMine5.setLocation(831, 561);
        theMine7.setLocation(309, 600);
        TheMine theMine10 =  new TheMine();
        addObject(theMine10, 159, 470);
        TheMine theMine11 =  new TheMine();
        addObject(theMine11, 763, 693);
        TheMine theMine12 =  new TheMine();
        addObject(theMine12, 467, 508);
        TheMine theMine13 =  new TheMine();
        addObject(theMine13, 66, 576);
        theMine10.setLocation(226, 511);
        theMine7.setLocation(348, 628);
    }
}
