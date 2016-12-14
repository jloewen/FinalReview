
/**
 * Write a description of class Test6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test6 // prob 9
{
    public Test6 (){
        int[] list = {2,12,11,45,52,36};
        System.out.println( go(list) );
    }

    public static int go( int[] ray )
    {
        int val = Integer.MIN_VALUE;
        for(int i=0; i < ray.length; i++)
            if( ray[i] > val )
                val = ray[i];
        return val;
    }
}
