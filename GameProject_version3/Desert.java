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
        super(1090, 850, 1);
        prepare();
        Counter.killcount = 0;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Boss boss =  new  Boss();
        addObject(boss, 576, 238);
        Helicopter helicopter =  new  Helicopter();
        addObject(helicopter, 129, 219);
        Helicopter2 helicopter2 =  new  Helicopter2();
        addObject(helicopter2, 952, 231);
        Mine mine =  new  Mine();
        addObject(mine, 936, 583);
        Mine mine2 =  new  Mine();
        addObject(mine2, 844, 491);
        Mine mine3 =  new  Mine();
        addObject(mine3, 678, 568);
        Mine mine4 =  new  Mine();
        addObject(mine4, 606, 474);
        Mine mine5 =  new  Mine();
        addObject(mine5, 340, 468);
        Mine mine6 =  new  Mine();
        addObject(mine6, 384, 544);
        Mine mine7 =  new  Mine();
        addObject(mine7, 540, 613);
        Mine mine8 =  new  Mine();
        addObject(mine8, 169, 496);
        Mine mine9 =  new  Mine();
        addObject(mine9, 256, 615);
        Mine mine10 =  new  Mine();
        addObject(mine10, 476, 444);
        zombie zombie =  new  zombie();
        addObject(zombie, 108, 708);
        mine3.setLocation(687, 623);
        mine7.setLocation(565, 524);
        mine4.setLocation(656, 447);
        mine7.setLocation(534, 583);
        mine6.setLocation(391, 541);
        mine5.setLocation(309, 433);
        mine6.setLocation(369, 529);
        mine7.setLocation(547, 635);
        mine9.setLocation(267, 633);
        mine6.setLocation(370, 545);
        mine7.setLocation(482, 644);
        mine9.setLocation(266, 645);
        mine8.setLocation(148, 486);
        mine5.setLocation(283, 436);
        mine6.setLocation(353, 542);
        mine9.setLocation(265, 656);
        mine7.setLocation(499, 611);
        mine3.setLocation(683, 666);
        mine7.setLocation(582, 590);
        mine6.setLocation(367, 564);
        mine9.setLocation(261, 668);
        mine3.setLocation(726, 643);
        mine3.setLocation(696, 689);
        mine3.setLocation(694, 671);
        mine7.setLocation(598, 591);
        mine.setLocation(909, 608);
        mine2.setLocation(841, 487);
        mine.setLocation(885, 596);
        mine3.setLocation(725, 675);
        mine8.setLocation(141, 495);
        mine5.setLocation(280, 424);
        Mine mine11 =  new  Mine();
        addObject(mine11, 734, 556);
        mine7.setLocation(563, 625);
        mine11.setLocation(672, 555);
        zombie.setLocation(99, 591);
        mine8.setLocation(125, 429);
        mine6.setLocation(285, 540);
        mine5.setLocation(294, 364);
        mine6.setLocation(291, 499);
        mine9.setLocation(244, 668);
        mine7.setLocation(471, 627);
        mine7.setLocation(487, 687);
        mine9.setLocation(235, 683);
        mine11.setLocation(560, 552);
        mine9.setLocation(223, 694);
        mine7.setLocation(484, 694);
        mine4.setLocation(714, 419);
        mine10.setLocation(466, 410);
        mine8.setLocation(77, 465);
        mine3.setLocation(749, 715);
        mine.setLocation(947, 618);
        mine7.setLocation(465, 697);
        mine11.setLocation(574, 550);
        mine2.setLocation(868, 464);
        mine4.setLocation(735, 406);
        mine11.setLocation(617,511);
        removeObject(mine10);
        mine9.setLocation(149,730);
        mine6.setLocation(324,519);
        removeObject(mine6);
        zombie.setLocation(279,541);
        mine7.setLocation(494,770);
        helicopter.setLocation(111,129);
        helicopter2.setLocation(911,102);
        boss.setLocation(509,122);
        mine5.setLocation(278,256);
        mine8.setLocation(47,404);
        mine9.setLocation(120,776);
        mine3.setLocation(870,777);
        mine11.setLocation(667,665);
        mine.setLocation(957,658);
        mine4.setLocation(560,441);
        mine2.setLocation(792,239);
        mine4.setLocation(554,426);
        mine11.setLocation(782,534);
        mine3.setLocation(721,804);
        mine11.setLocation(909,397);
        mine11.setLocation(768,480);
        mine4.setLocation(466,541);
        mine11.setLocation(793,424);
        mine7.setLocation(391,782);
        mine4.setLocation(426,466);
        mine3.setLocation(691,766);
        mine.setLocation(961,633);
        mine11.setLocation(869,424);
        mine4.setLocation(531,478);
        mine11.setLocation(805,440);
        helicopter.setLocation(181,135);
        helicopter.setLocation(135,112);
        helicopter2.setLocation(980,106);
    }
}
