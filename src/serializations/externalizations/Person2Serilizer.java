package serializations.externalizations;

import java.io.*;


public class Person2Serilizer {
    public Person2Serilizer(){
        System.out.println("Person2Serilizer :: Const");
    }

    public static void main(String[] args) throws Exception{
        Person2 person2 = new Person2();
        person2.mname="kkm";
        //"aswini","parida","kumar",30,"cuttack",29);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person2.ser"));
        objectOutputStream.writeObject(person2);

        System.out.println("Person2 serialized....");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person2.ser"));
        Person2 person = (Person2) objectInputStream.readObject();

        System.out.println(person);
    }
}
