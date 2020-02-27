package polymorphism;

/**
 * Created by 609540082 on 26/11/2019.
 */
public class Child2 extends Child {

    public void testChild2(){
        System.out.println("From Child");
    }

    public void testChild21(){
        System.out.println("From Child");
    }
    public void test(){
        System.out.println("from test");
    }
   /* public void test2(){
        System.out.println("Inside test2 of child2");
    }*/
    public static  void main(String[] args) {
        Parent p = new Child2();
        p.test();
        p.testParent();
        p.test2();

        double tip = (10.25*17)/100;
        double tax = (10.25*5)/100;
        double total_cost = 10.25+tip+tax;
        System.out.println("Total"+Math.round(total_cost));
    }
}
