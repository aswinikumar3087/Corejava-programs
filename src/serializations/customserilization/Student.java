package serializations.customserilization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{
    int age=15;
    String name ="Rohon";
    transient String lastName ="pandey";

    public Student(int x){
        System.out.println("inside Student const :: ");

    }
    {
        System.out.println("Inside Student::");
    }

    private void writeObject(ObjectOutputStream oos) throws IOException{
        oos.defaultWriteObject();
        String lName = lastName;
        oos.writeObject(lName);
        System.out.println("serilization done for last name "+lName);
    }
    private void readObject(ObjectInputStream ois) throws Exception{
        ois.defaultReadObject();
         lastName = (String)ois.readObject();
        //lastName = lname.substring(3);
        System.out.println("Deserilize done");
    }
}
