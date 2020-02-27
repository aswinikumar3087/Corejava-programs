package collections;

import java.util.*;

/**
 * Created by 609540082 on 12/02/2019.
 */
public class RemoveDuplicatesFromList {

    public static void main(String []args)
    {
        List<String> listWithDuplicateElements = new ArrayList<>();
        listWithDuplicateElements.add("JAVA");
        listWithDuplicateElements.add("J2EE");
        listWithDuplicateElements.add("JSP");
        listWithDuplicateElements.add("SERVLETS");
        listWithDuplicateElements.add("JAVA");
        listWithDuplicateElements.add("STRUTS");
        listWithDuplicateElements.add("JSP");
        System.out.println("elements with duplicates"+listWithDuplicateElements);
        Set<String> set = new HashSet<>(listWithDuplicateElements);
        System.out.println("elements without duplicates"+set);

        Queue<String> queue = new PriorityQueue<>(listWithDuplicateElements);
      // Iterator listIterator = set();
        Number []a = new Double[2];
        a[0] = 3;
    }
}
