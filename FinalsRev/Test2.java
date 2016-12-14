
/**
 * Write a description of class Test2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test2
{

   

    public static void main(){
        int put = 0;
        int ni = 0;
        for(int out=1; out<4; out++)
        {
            for(int in=1; in<3; in++)
            {
                ni++;
                put--;
            }
        }
        System.out.println("29. " + put*ni);
    }
}
