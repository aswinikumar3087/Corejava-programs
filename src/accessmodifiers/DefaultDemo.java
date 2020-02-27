package accessmodifiers;


import arrayprograms.Modifier;
class A extends Modifier{

}
public class DefaultDemo extends A {

  public static void main(String[] args) {

   DefaultDemo defaultDemo = new DefaultDemo();
   System.out.println(defaultDemo.a);

  }
 }