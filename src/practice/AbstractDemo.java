package practice;

interface Iface{
    void test();
}
class Abc{
    public long test(){
        return 1;
    }
}
class D{}
class E extends D{}

class G extends E{}
class H{
    E test(){
       return null;
    }
}
class I extends H{
    G test(){
        return null;
    }
}
public class AbstractDemo extends Abc {

    public AbstractDemo(){}


    public long test(){
       return 3;
    }

    public static void main(String[] args) {

     AbstractDemo abstractDemo = new AbstractDemo();


    }
}
