package collections.treeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by 609540082 on 25/11/2019.
 * Set to Array conversion
 */
public class SetToArray {
    public static void main(String[] args) throws Exception{

        TreeSet<String> treeSet = new TreeSet();
        treeSet.add("geeks");
        treeSet.add("ks");
        treeSet.add("geks");
        treeSet.add("eeks");

        Object sTring[]  ;
        sTring =(Object[])treeSet.toArray();
        System.out.println("List Array ::"+Arrays.asList(sTring));

        for(int i=0;i<sTring.length;i++)
            System.out.println("array elements ::"+sTring[i]);

    }
}
