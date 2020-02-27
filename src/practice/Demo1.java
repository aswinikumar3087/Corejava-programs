package practice;

import java.util.HashMap;
import java.util.Map;

class Poly{
    public static void test(){
        System.out.println("Poly Super class");
    }
    public void test2(){
        System.out.println("Poly super");
    }
}

public class Demo1  {
    public static void test(){
        System.out.println("Demo sub class");
    }
    public void test3(){
        System.out.println("Poly super");
    }

    public static void main(String[] args) {


       // Demo1 demo1 = (Demo1) new Poly();
       // demo1.test();
        HashMap<String,String> map = new HashMap();
        map.put("aaa","aswini");
        map.put("bb","aswini");
        map.put("aaa","mammm");
        map.put("ccc","kkkk");

        for (Map.Entry<String,String> entry:map.entrySet()) {

            System.out.println("Key ::"+entry.getKey().hashCode());
            System.out.println("Value :: "+entry.getValue());
        }

    }

    @Override
    public int hashCode() {
        System.out.println("hascode called");
        return 1;
    }


}