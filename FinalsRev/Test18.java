
/**
 * Write a description of class Test18 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Test18 //prob 24
{
    private int x = 78;
    public Test18(){
        ArrayList<Test18> itList = new ArrayList<Test18>();
        itList.add(new Test18());
        itList.add(new Test18(8));
        System.out.println(itList);
        x = 99;
    }


    public Test18( int y ) {
        x = y;
    }

    public String toString(){
        return "" + x;
    }

}
