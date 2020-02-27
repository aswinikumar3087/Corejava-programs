/*
Serilization
* Converting object from Java supported form to File supported form is called Seriliazation
*
* Desrilization
* Converting object from network supported form to java supported form is Deserilization.
* */

package serializations.defaultserialization;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) throws Exception {
        Person p = new Person(2);
        System.out.println("Serialization starts");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
        oos.writeObject(p);

        System.out.println("Serialized person class :: ");
    }
}
