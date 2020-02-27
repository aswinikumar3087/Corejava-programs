package serializations.customserilization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by 609540082 on 16/08/2019.
 */
public class studentSerializer {
    public static void main(String[] args) throws Exception{

        Student student = new Student(23);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
        oos.writeObject(student);

        System.out.println("Student serialized ::hashcode :: "+student.hashCode());
    }
}
