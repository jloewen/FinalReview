
/**
 * Write a description of class Test4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test4
{

    private int num;
    public static int getIt(int num) //prob 6 and 7
    {
        int ans = 0;
        if( num >=2 )
        {
            if( num >= 7)
                ans += 2;
            else
                ans += 3;
        }
        ans += 4;
        return ans;
    }
}
