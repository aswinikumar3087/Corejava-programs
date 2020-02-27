package polymorphism;

/**
 * Created by 609540082 on 26/11/2019.
 */
public class Child extends Parent{
    public void testChild(){
        System.out.println("From Child");
    }

    public void test(){
        System.out.println("from test");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.test();

        Child child = new Child();
        child.test();
        child.testParent();
        child.testChild();

        Parent p = new Child();
    }
}
