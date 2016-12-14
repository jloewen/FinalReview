
/**
 * Write a description of class Test14 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test14
{

    public Test14()
    {
        String a="abcdefsdfg";
        String b="ems";
        for(int i=0; i < b.length(); i++)
        {
            System.out.print(a.indexOf(b.substring(i, i+1)));
            System.out.print(" ");
        }
    }

}
