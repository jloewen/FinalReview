
/**
 * Write a description of class Test5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test5  // Prob 8

{
    public Test5(){
        int[] list = {2,12,11,45,52,36,5,3,1};
        System.out.println( go(list) );
    }

    public static double go( int[] ray )
    {
        int val = 0;
        for(int i=0; i < ray.length; i = i + 2)
            val = val + ray[i];
        return val;
    }
}
