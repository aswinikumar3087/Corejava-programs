package practice;
class A{

    static String s = "AAA";
    static
    {
        s = s + "BBB";
        System.out.println("Inside sib of FindSumOfElements :: s ::"+s);
    }
    {
        System.out.println("Inside iib of FindSumOfElements :: s ::"+s);
        s = "AAABBB";
    }

}
public class Demo extends A {

    static
    {
        s = s + "BBBAAA";
        System.out.println("Inside sib of DEMO :: s ::"+s);
    }
    {
        System.out.println("inside IIB DEMO .."+s);
    }

    public static void main(String []args) {


        Demo demo = new Demo();
    }
}
