package practice;

/**
 * Created by 609540082 on 29/11/2019.
 */
public class StringOpr {

    public static void main(String[] args) {

        String s1= "abc";
        String s2 = new String("abc");
        String s4 = new String("abc");
        //String s3 = "abc";

        System.out.println(s1==s2);
       // System.out.println(s1.equals(s2));

       // System.out.println(s1==s3);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
       // System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

       // s1=null;
        s2=null;
        //s3=null;
        s4=null;

     /*   System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);*/


    }
}
