package serializations.defaultserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializePerson {

    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
        Person p2 = (Person)ois.readObject();

        System.out.println("name :: "+p2.name);
        System.out.println("a :: "+p2.a);
        System.out.println("b :: "+p2.b);
    }
}
