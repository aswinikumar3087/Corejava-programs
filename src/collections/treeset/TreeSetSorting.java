package collections.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSorting implements Comparator<Employee> {

    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new TreeSetSorting());
        treeSet.add(new Employee(12,"aadf",2333));
        treeSet.add(new Employee(14,"asa",4444));
        treeSet.add(new Employee(6,"aad",5555));
        treeSet.add(new Employee(6,"aad",8888));
        treeSet.add(new Employee(167,"fa",6666));

        System.out.println(treeSet);

    }
    @Override
    public int compare(Employee o1, Employee o2) {
        Integer i1= (Integer)o1.age;
        Integer i2= (Integer)o2.age;
        /* if(i1<i2){
             return -11;
         }else if(i1>i2){
             return 1;
         }else return 0;*/
           // return i1.compareTo(i2);
        return o1.age<o2.age ?1 : o1.age >o2.age ? -1: o1.id<o2.id ?1:-1;
        /*if(o1.age<o2.age){
            return -1;
        }else if(o1.age>o2.age){
            return 1;
        }else {
            return o1.id<o2.id ?-1:1;
        }*/
    }

}
