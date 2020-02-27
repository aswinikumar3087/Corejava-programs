package primenumber;

import java.io.IOException;

public class D{

public static Class getSuper(Object o){
    Class cls = o.getClass().getSuperclass();
    return cls;
}

 static int  err() throws Exception{
    try{
        throw new IOException("..");
    }catch (RuntimeException re){
        throw new RuntimeException(re);
    }finally {
        return -1;
    }
}
public static void badMethod(){}
    public static void main(String[] args) {
        // int a = 1/0;
       /* try{
            badMethod();
            System.out.println("FindSumOfElements");
        }catch (Exception ex)
        {
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
        System.out.println("D");
*/
       /* System.out.println("String []'super class :"+getSuper(args));
        System.out.println("Object's super class :"+getSuper(new Object()));*/
       /*try{
        System.out.println(err());}
        catch (Exception e){
            System.out.println(e.getMessage());
        }*/

        int a = 0x000F;
        int v = 0x2222;
        System.out.println(a & v);
    }
     /* try{
          doStuff(args);
      }catch (Exception ex){
          doStuff(args);
          }
      }*/
    static int doStuff(String []args){
        return Integer.parseInt("x");
    }

}
