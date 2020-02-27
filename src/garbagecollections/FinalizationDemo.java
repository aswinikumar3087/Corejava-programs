package garbagecollections;


public class FinalizationDemo {

    static FinalizationDemo finalizationDemo1;
    public static void main(String[] args) {

        FinalizationDemo finalizationDemo = new FinalizationDemo();
        System.out.println("finalize object hashcode"+finalizationDemo.hashCode());
        finalizationDemo = null;
        System.gc();
        System.out.println("main ends...");
    }
    public void finalize()
    {
        System.out.println("finalize called...");
        finalizationDemo1 = this;
    }
}

