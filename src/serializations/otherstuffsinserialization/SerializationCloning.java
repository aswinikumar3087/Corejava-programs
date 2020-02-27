package serializations.otherstuffsinserialization;

import java.io.*;

class DemoCloning implements Cloneable,Serializable{
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class SingleTonDemo extends DemoCloning{
    private static SingleTonDemo singleTonDemo = new SingleTonDemo();

    private SingleTonDemo(){

    }

    public static SingleTonDemo getInstance(){
        return singleTonDemo;
    }

    protected Object clone() throws CloneNotSupportedException{
        return singleTonDemo;
      //  throw new CloneNotSupportedException();
    }
    protected Object readResolve(){
        return singleTonDemo;
    }

}
public class SerializationCloning {

    public static void main(String[] args)  throws Exception{
        SingleTonDemo singleTonDemo = SingleTonDemo.getInstance();
        SingleTonDemo singleTonDemo1 = (SingleTonDemo)singleTonDemo.clone();

        System.out.println("hashcode ::"+singleTonDemo.hashCode());
        System.out.println("hashCode ::"+singleTonDemo1.hashCode());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        oos.writeObject(singleTonDemo);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SingleTonDemo singleTonDemo2 = (SingleTonDemo)ois.readObject();
        System.out.println("hashcode ::"+singleTonDemo.hashCode());
        System.out.println("hashCode after desrializer::"+singleTonDemo2.hashCode());
    }

}
