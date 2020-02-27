package practice;

import stringpackage.DemoProtected;

public class ProtectedDemo extends DemoProtected{

    public void test(){
        System.out.println("from ProtectedDemo");
    }

    public static void main(String[] args) {
        ProtectedDemo protectedDemo = new ProtectedDemo();
        protectedDemo.test();
    }


}
