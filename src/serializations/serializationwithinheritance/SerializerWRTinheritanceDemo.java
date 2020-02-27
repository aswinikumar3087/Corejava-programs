package serializations.serializationwithinheritance;

import java.io.*;

/**

 * Child class serializable but parent class not serializable
 *
 * Note-> During Serialization
 * At the time of serilization JVM checks if any variables are coming from Nonserializable class, if it is
 * coming then JVM ignores the original value of Nonserializable class and stores the default value in to the file.
 *
 * During Desrilization- JVM will chck any parent class Nonserilizable or not, if any parent class is non serilizable
 * then JVM executes Instance Control Flow in every Non Serializable member.
 *
 * While executing Instance control flow JVM will call No arg constructor.otherwise RuntimeException will occur
 * as InvalidClassExeption
 */
class A{
    public A(){
        System.out.println("FindSumOfElements");
    }
    {
        System.out.println("FindSumOfElements iib");
    }
    static{
        System.out.println("FindSumOfElements sib");
    }
    int a=34;
    static int c=67;
}
public class SerializerWRTinheritanceDemo extends A implements Serializable {
    public SerializerWRTinheritanceDemo(){
        System.out.println("SerializerWRTinheritanceDemo const...");
    }

    int b=45;
    public static void main(String[] args) throws Exception{
        SerializerWRTinheritanceDemo serializerWRTinheritanceDemo = new SerializerWRTinheritanceDemo();
        serializerWRTinheritanceDemo.a=444;
        serializerWRTinheritanceDemo.b=434;

        System.out.println("SerializerWRTinheritanceDemo :: Serialization starts");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Inherit.ser"));
        objectOutputStream.writeObject(serializerWRTinheritanceDemo);

        System.out.println("Deserilization starts...");
        ObjectInputStream objectInputStream = new ObjectInputStream( new FileInputStream("Inherit.ser"));
        SerializerWRTinheritanceDemo serializerWRTinheritanceDemo1  = (SerializerWRTinheritanceDemo)objectInputStream.readObject();

        System.out.println("a:"+serializerWRTinheritanceDemo1.a);
        System.out.println("b:"+serializerWRTinheritanceDemo1.b);
       // System.out.println("b:"+serializerWRTinheritanceDemo1.c);
    }
}
