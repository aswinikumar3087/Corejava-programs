package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class GFG extends ArrayList {

    public static void main(String[] args) {

        List<String> list =
                Collections.synchronizedList(new ArrayList<String>());

        list.add("practice");
        list.add("code");
        list.add("quiz");


            // must be in synchronized block
            Iterator it = list.iterator();

            while (it.hasNext())
                System.out.println(it.next());



        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        // Adding elements to synchronized ArrayList
        copyOnWriteArrayList.add("geek");
        copyOnWriteArrayList.add("code");
        copyOnWriteArrayList.add("practice");

        System.out.println("Elements of synchronized ArrayList :");

        // Iterating on the synchronized ArrayList using iterator.
        Iterator<String> ite = copyOnWriteArrayList.iterator();

        while (ite.hasNext())
            System.out.println(ite.next());
    }
}
