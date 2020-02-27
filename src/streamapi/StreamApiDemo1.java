package streamapi;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12,3,4,5,6,76,43,32);

        numbers.stream().filter(x->x %2==0).forEach(x-> System.out.println("even numbers"+x));


        List<String> list = Arrays.asList("ak","rk","sk");
        //foreach()
       // list.forEach(name-> System.out.println(name));
        list.stream().filter(name -> !name.equals("ak")).forEach(name -> System.out.println(name));

        List<Integer> list1 = Arrays.asList(12,34,35,66);
        list1.stream().filter(a -> a!=34).forEach(a-> System.out.println(a));
        list1.stream().map(a->a+12).forEach(a-> System.out.println("added 12 to each"+a));

        List<Integer> list2 = Arrays.asList(12,34,54,65,76,43,54);

        Set set1 = list2.stream().map(a->a+5).collect(Collectors.toSet());

        set1.forEach(a -> System.out.println("set value"+a));

        System.out.println("Count :: "+list2.stream().count());


        Comparator<Integer> comparator1 = (o1,o2)-> o1<o2 ?1 : o1>o2 ?-1 :0;

        list2.stream().sorted(comparator1).forEach(a-> System.out.println(a+"::"));

        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List<String> result = names.stream().sorted().collect(Collectors.toList());

        result.forEach(a-> System.out.println(a));

        // Convert set to Streams

        Set<Integer> set2 = new HashSet<>();
        set2.add(23);
        set2.add(235);
        set2.add(24);
        set2.add(236 );

        Stream stream = set2.stream();
        stream.forEach(a-> System.out.println("Elements of stream ::"+a));

        // Convert streams to Set

        Stream<Integer> stream1 = Stream.of(2,3,4,77,55,43);
        List<Integer> list3 = stream1.collect(Collectors.toList());
        list3.forEach(a-> System.out.println("from Streams to list ::"+a));


        Map<Integer, String> map = new HashMap<>();

        // Add entries to the Map
        map.put(1, "Geeks");
        map.put(2, "forGeeks");
        map.put(3, "A computer Portal");
        System.out.println("sets ::"+map.entrySet());

        //Convert stream to Array
        Stream stream2 = Stream.of(32,23,12,54,65);
        Object [] i= stream2.toArray();
        System.out.println(Arrays.toString(i));

        //Creating Integer Array
        Stream stream3 = Stream.of(32,23,12,54,65);
        Integer[] array =(Integer[]) stream3.toArray(Integer []::new);
        System.out.println("array"+Arrays.toString(array));
        Stream.of(array).forEach(System.out::println);

        Comparator<String> comparator  =(o1,o2)-> o1.compareTo(o2);
        System.out.println( "comp str"+comparator.compare("a","A"));

        Runnable runnable = ()-> System.out.println("FROM runnable");
        runnable.run();


    }
}
