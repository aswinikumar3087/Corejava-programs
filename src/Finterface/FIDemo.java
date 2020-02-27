package Finterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FIDemo {

    public static void main(String[] args) throws Exception {

       //DefaultMethodIf df = (a) -> { int b =a*a;
     //  System.out.println(b);
     //  return b;};
      // df.squareInts(70);

        List list = new ArrayList();
        list.add(23);
        list.add(33);
        list.add(53);
        list.add(63);
        list.add(3);
        list.add(30);
        //Collections.sort(list,new FIDemo());

        Comparator<Integer> comparator = (Integer obj1,Integer obj2)->  obj1<obj2 ?1:obj1>obj2 ?-1 :0;
        Collections.sort(list,comparator);
        System.out.println(list);
        AnnonymousDemo annonymousDemo = new AnnonymousDemo() {
            @Override
            public void test1() {
                System.out.println("From test1");
            }

            @Override
            public void test2() {
                System.out.println("From test2");
            }
        };
        annonymousDemo.test1();
        annonymousDemo.test2();

    }

}