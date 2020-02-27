package collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 609540082 on 18/06/2019.
 */
public class ALmethods {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        //add elements
        al.add(2);
        al.add(4);
        al.add(5);
        al.add(2);
        al.add(5);
        al.add(6);
        System.out.println("al list:: "+al);
        //remove elements
        al.remove(2);
        System.out.println("al list before removing 1st occurence of 2:: "+al);
        //remove 1st occurence from the list if it present
        al.remove(new Integer(2));
        System.out.println(al.contains(4));
        System.out.println("al list:: "+al);
        //Sublist or subset for the list
        List list =al.subList(1,3);
        System.out.println("list"+list);
        int a = al.set(2,45);
        System.out.println("Replaced element :"+a);
        System.out.println("list after set method"+al);

        //Create a new list and addall the elements to prev list
        ArrayList list2 = new ArrayList();
        list2.add(98);
        list2.add(65);
        list2.add(54);
        ArrayList<Integer> list1 = new ArrayList<>(4);
        list1.add(23);
        list1.add(78);
        list1.add(65);
        list1.add(67);
        list2.addAll(list1);

        System.out.println("list1 before removal of list2 ::"+list2);

        //removeall (Collection c)

        list1.removeAll(list2);
        System.out.println("list1 after removal of list2"+list1);


    }
}
