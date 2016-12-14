
/**
 * Write a description of class Test10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test10 // prob 11
{

    public Test10()
    {
        int[] list = {3, 6, 9, 2, 4, 5};
        System.out.println( go(list) );
    }

    public static int go( int[] ray )
    {
        int val = 0;
        for(int i=0; i < ray.length; i++)
            val = val + ray[i];
        return val;
    }

}
