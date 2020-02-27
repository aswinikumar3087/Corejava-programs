package casting;

/**
 * Created by 609540082 on 29/09/2018.
 */
class A
{
    public void test()
    {
        System.out.println("Inside test FindSumOfElements");
    }
}
class B extends A
{
    public void test()
    {
        System.out.println("Inside test B");
    }
}
class C extends B
{}

public class D  {

    public static void main(String [] args)
    {
        A a = new A();
        //Auti upcasting of derived tyoe. Derived type casting is changing the object of one user defined type to anoather
        B b = new C();
        //C c = new D();

        //Expilcit down casting
     //   FindSumOfElements a1 = new B();
        B b1 = (B)a;
        //b1.test();
    }
}
