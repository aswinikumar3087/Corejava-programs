package serializations.defaultserialization;

import java.io.*;

 public class Person implements Serializable{
     int a;
   /* public Person(){
        System.out.println("Insde Person const :: ");
    }*/
    Person(int c){
        a=c;
    }

    transient int b =30;
    String name="Aswini";


}
