package collections.treeset;

import java.util.HashSet;
import java.util.TreeSet;

public class IteratingSetUsingForEach {
    public static void main(String[] args) {
        HashSet treeSet = new HashSet();
        treeSet.add("geeks");
        treeSet.add("for");
        treeSet.add("geeks");
        treeSet.add("geks");

        treeSet.forEach(i-> System.out.println(i));
        //Convert treeset to toArray();
        String str[] = new String[2];
        str=(String[])treeSet.toArray();

               for(int i=0;i<str.length;i++){
                   System.out.println("Array elements are :: "+str[i]);
               }


    }
}
