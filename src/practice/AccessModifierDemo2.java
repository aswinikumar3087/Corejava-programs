package practice;


import accessmodifiers.DefaultDemo;

class B {

}
class C extends B{
public static void main(String []args)
{
    B b = new B();
    //System.out.println(b.j);
    C c = new C();
    //System.out.println(c.j);

}
}
public class AccessModifierDemo2
{

            public static void main(String[] args) {
                DefaultDemo defaultDemo = new DefaultDemo();
              //  System.out.println(defaultDemo.k);

                //default members canont be accessed outside the package
              //  System.out.println(defaultDemo.i);
              //  System.out.println(defaultDemo.j);

                AccessModifierDemo2 accessModifierDemo2 = new AccessModifierDemo2();
                //System.out.println(accessModifierDemo2.j);
               // System.out.println(accessModifierDemo2.k);


            }
}
