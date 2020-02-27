package serializations.serilizationwithmultipleobjects;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by 609540082 on 16/08/2019.
 */
public class Demo {
    public static void main(String[] args) throws Exception{
        Multipleobjects multipleobjects = new Multipleobjects();
        Multi2 multi2 = new Multi2();
        Multi3 multi3 = new Multi3();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("multi.ser"));
        objectOutputStream.writeObject(multipleobjects);
        objectOutputStream.writeObject(multi2);
        objectOutputStream.writeObject(multi3);

        System.out.println("Objects serialized");


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("multi.ser"));
        Object obj = ois.readObject();

        if (obj instanceof Multipleobjects){
            int s= ((Multipleobjects) obj).a;
            System.out.println("value of a"+s);
        }else if (obj instanceof Multi2){
            int v= ((Multi2) obj).c;
            System.out.println("value of c"+v);
        }else if(obj instanceof Multi3){
            int t = ((Multi3) obj).d;
            System.out.println("value of d"+t);
        }

    }
}
