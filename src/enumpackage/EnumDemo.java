package enumpackage;


enum Enum
{
    MON{
        int a =34;
        void method1(){
        System.out.println("inisde MON overirded method...");
    }},
    TUE{
    void method1(){
        System.out.println("inisde TUE...");
    }},
    WED{
    void method1(){
        System.out.println("inisde WED...");
    }},
    THU {void method1(){
    System.out.println("inisde THU...");
}};

abstract void method1();
}

public class EnumDemo {

    public static void main(String []args)
    {
      /*  Enum enumvar = Enum.MON;

        System.out.println("enumvars..."+Enum.MON.toString());*/
        Enum.MON.method1();

       /* Enum enumvar1 = Enum.TUE;
        Enum.TUE.method1();
        System.out.println("enumvars..."+enumvar1);*/
    }
}
