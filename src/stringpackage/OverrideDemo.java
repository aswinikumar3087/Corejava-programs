package stringpackage;


class DemoMethod{

    protected Integer test1(){
        System.out.println("1");
        return 1;
    }
   /* public short test2(){
        System.out.println("1");
        return 1;
    }
    public int test2(){
        System.out.println("1");
        return 21;
    }*/
}
public class OverrideDemo extends DemoMethod{

    public Integer test1(){
        System.out.println("2");
        return 2;
    }

    public static void main(String[] args) {
        OverrideDemo overrideDemo = new OverrideDemo();
        overrideDemo.test1();

        DemoMethod demoMethod = new OverrideDemo();
        demoMethod.test1();
    }
}
