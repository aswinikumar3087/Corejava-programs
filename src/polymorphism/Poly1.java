package polymorphism;

/**
 * Created by 609540082 on 26/11/2019.
 */
public class Poly1 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        System.out.println(Poly1.sum(23,4));
        Poly1.sum(23,4,5);
    }
}
