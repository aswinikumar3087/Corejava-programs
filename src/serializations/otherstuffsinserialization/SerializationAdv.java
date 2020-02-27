package serializations.otherstuffsinserialization;

import java.io.*;

class SingleTon implements Serializable
{
   private static SingleTon singleTon= new SingleTon() ;
    private SingleTon(){

    }
    public static SingleTon getInstance(){
        return singleTon;
    }
   public Object readResolve(){
        System.out.println("inside readResolve ::");

        return singleTon;

    }
}
public class SerializationAdv {
    public static void main(String[] args) throws Exception{

        SingleTon singleTon= SingleTon.getInstance();
        System.out.println("Singleton hashCode ::"+singleTon.hashCode());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singletonSer.ser" ));
        oos.writeObject(singleTon);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singletonSer.ser"));
        SingleTon singleTon1 = (SingleTon)ois.readObject();
        System.out.println("Singleton1 hashCode ::"+singleTon1.hashCode());

    }
}
