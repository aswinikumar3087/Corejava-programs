package serializations.externalizations;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;


public class Person2 implements Externalizable{

    String fname ="aswini";
    String lname ="parida";
    String mname ="kumar";
    int sal =30;
    String address ="cuttack";
    int age =29;
   public Person2(){
        System.out.println("Inside Person2");
    }

    public Person2(String fname, String lname, String mname, int sal, String address, int age) {
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
        this.sal = sal;
        this.address = address;
        this.age = age;
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException{
        System.out.println("inside writeExternal");
        objectOutput.writeObject(fname);
        objectOutput.writeObject(lname);
        objectOutput.writeObject(mname);
        objectOutput.writeInt(age);
    }
    public void readExternal(ObjectInput objectInput)  throws IOException, ClassNotFoundException{
        System.out.println("inside readExternal");
       fname= (String) objectInput.readObject();
       lname=(String) objectInput.readObject();
       mname =(String) objectInput.readObject();
        age = objectInput.readInt();
        sal=50;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", mname='" + mname + '\'' +
                ", sal=" + sal +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
