
/**
 * Write a description of class Test12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test12
{

    public Test12()
    {
        CS test = new CS();
        test.one();
        test.two();
        test.two();
    }

    public class CS{
        public void one(){
            System.out.print("one");
        }

        public void two(){
            System.out.print("two");
            one();
        }
    }
}
