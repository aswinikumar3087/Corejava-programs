package practice;

public class OverloadingDemo {

    public void doSomething(Float a,Float b){
        System.out.println("Float method");
    }
   public void doSomething(Integer a,Integer b){
        System.out.println("Dosomething wrapper class");
    }
   public void doSomething(int b,float c){
        System.out.println("From 3rd doSomething");
    }

   public void doSomething(int a,int ... b){
        System.out.println("doSomething 4th method var args");
    }

    public static void main(String[] args) {
        OverloadingDemo overloadingDemo = new OverloadingDemo();
       overloadingDemo.doSomething(12,34);
    }
}
