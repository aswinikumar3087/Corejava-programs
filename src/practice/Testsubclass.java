package practice;

/**
 * Created by 609540082 on 04/09/2018.
 */
public class Testsubclass {

    public void test()
    {
        System.out.println("Inside test ");

    }
    public static void test1()
    {
        System.out.println("inside Testsubclass abs");
    }

    public static void main(String []args)
    {
        Testsubclass testsubclass = new Testsubclass();
        testsubclass.test1();
    }
}
