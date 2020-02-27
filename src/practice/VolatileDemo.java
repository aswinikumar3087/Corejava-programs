package practice;


public class VolatileDemo {

   static int a=1;

    public static void main(String[] args) {
        VolatileDemo volatileDemo = new VolatileDemo();
        volatileDemo.a = 5;
        System.out.println(volatileDemo.a);

        VolatileDemo volatileDemo1 = new VolatileDemo();
        System.out.println(volatileDemo1.a);
    }
}
