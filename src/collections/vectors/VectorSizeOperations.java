package collections.vectors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by 609540082 on 13/02/2019.
 */
public class VectorSizeOperations {

    public static void main(String []args) {

        Vector vector = new Vector(5);
        System.out.println("cacacity for " + vector.capacity());
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.add(60);
        vector.add(70);

        System.out.println("cacacity for " + vector.capacity());
        System.out.println("firstElement for " + vector.firstElement());
        System.out.println("lastElement for " + vector.lastElement());

        Enumeration<Integer> enumeration = vector.elements();
          ArrayList list = new ArrayList<>();
          list.add(10);
          list.add(20);
          list.add(30);
          list.add(40);
          list.remove(30);
          list.size();

          Object [] objects = list.toArray();

          for(Object object: objects)
          {
              System.out.println(object);
          }

      //  System.out.println(list.isEmpty());
    }
}
