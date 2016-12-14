
/**
 * Write a description of class Test16 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Test16 // prob 21
{

    public Test16()
    {
        ArrayList<String> bList = new ArrayList();
        bList.add(0,"one");
        bList.add("two");
        bList.set(0,"three");
        bList.add(1,"four");
        bList.set(1,"five");
        System.out.println(bList.get(0).substring(0,1));
    }

}
