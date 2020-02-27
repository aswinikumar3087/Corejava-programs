package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by 609540082 on 26/12/2019.
 */
public class StreamAPiDemo2 {
    public static void main(String[] args) {
        // demo of map and forEach
        List<Integer> list = Arrays.asList(12,2,4,5,6,7);
        list.stream().map(x-> x*x).forEach(a-> System.out.println(a));
        List list1 = list.stream().map(x-> x*x).collect(Collectors.toList());
        System.out.println(list1);

        list.stream().filter(x->x%3==0).forEach(x-> System.out.println("even numbers ::"+x));
        list.stream().sorted((x,y) -> x<y ?1:x>y ?-1:0).forEach(x-> System.out.println(x));
    }
}
