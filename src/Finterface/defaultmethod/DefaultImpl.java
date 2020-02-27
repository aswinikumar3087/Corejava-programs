package Finterface.defaultmethod;

public class DefaultImpl implements DefaultMethodIf,DefaultMethod2 {

    public void test(){
        System.out.println("From DefaultImpl");
        DefaultMethodIf.super.test();
        DefaultMethod2.super.test();
    }

    public static void main(String[] args) {
        DefaultImpl defaultImpl = new DefaultImpl();
        defaultImpl.test();
        DefaultMethodIf.test2();
    }
}
