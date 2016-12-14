
/**
 * Write a description of class Test17 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Test17 // prob 22
{

    public Test17()
    {
        ArrayList<Integer> cList = new ArrayList<Integer>();
        cList.add(0,1);
        cList.add(2);
        cList.set(0,3);
        cList.add(1, 4);
        cList.set(1, 5);
        int i = cList.get(0);
        System.out.println( i );
    }

}
