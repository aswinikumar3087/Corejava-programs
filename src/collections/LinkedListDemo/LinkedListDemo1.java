package collections.LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by 609540082 on 25/02/2019.
 */
public class LinkedListDemo1 {

   public static void main(String args[])
   {
       LinkedList linkedList = new LinkedList();

       linkedList.add("jsp");
       linkedList.add("java");
       linkedList.add("python");
       linkedList.add("a");
       linkedList.add("b");
       linkedList.add("b");
       linkedList.add("c");
       linkedList.add(null);
       linkedList.add(65);
       linkedList.addFirst(3553);
       linkedList.addLast(666);
       linkedList.remove(3);

       if(linkedList.contains("java"))
       {
           System.out.println("index of :: "+linkedList.indexOf("java"));
       }
       Iterator it = linkedList.iterator();

       while(it.hasNext())
       {
           System.out.println("linked list contetnts :"+it.next());
       }
   }
}
