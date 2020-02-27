package generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

//interface demo for generics
/*interface FindSumOfElements{
    void test();
}
class B implements FindSumOfElements{
    @Override
    public void test() {
        System.out.println("FindSumOfElements");

}*/
public class GenricsDemo {
    public static void main(String[] args) {

        //Lower Bounds
        List<? super Number>list2 = new ArrayList();
        list2.add(23);
        list2.add(23.5);

        List<? extends Number> list3 = new ArrayList<>();
        //list3.add(34);// We can add only null values to list3 as ? extends Number and its conflicting which subclass object
        // will be added to list



        // C. Intercommunication between generic and non generic code
       List<String> list = new ArrayList<String>();
       list.add("Aswini");
       list.add("kumar");
       list.add("Aswini");
        test2(list);
        System.out.println(list);
        list.add("fde");
        // end of intercommunication

        // Typesafety check happens at comile time
        ArrayList arrayList = new ArrayList<String>();
        arrayList.add(23);
        arrayList.add(24);
        arrayList.add("as");
        System.out.println(arrayList);

    }
    //Method for intercommunication of generic and non generic methods
    public static void test2(List list){
        list.add("ade");
        list.add(10);
        list.add(13);
    }
    //Generics provides type safety during compile time, the below 2 methods gives CTE as name:Clash as both methods having same
    //erasure
   /* public void test(List<Integer> list){

    }
    public void test(List<String> list2){

    }*/

}
