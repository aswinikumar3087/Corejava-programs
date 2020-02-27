package Finterface.defaultmethod;


public interface DefaultMethodIf {
   // int squareInts(int a);
    default void test(){
        System.out.println("From DefaultMethodIf ");
    }

    public static void test2(){
        System.out.println("Static test2 called...");
    }
}

