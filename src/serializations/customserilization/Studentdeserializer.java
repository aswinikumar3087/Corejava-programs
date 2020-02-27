package serializations.customserilization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Studentdeserializer {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
        Student student = (Student)ois.readObject();

        System.out.println("age ::"+student.age);
        System.out.println("Name ::"+student.name);
        System.out.println("lastname :: "+student.lastName);
        System.out.println("hashCode :: "+student.hashCode());
    }
}
