package Finterface.predefinedinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


class Emp{
    private int sal;

    public Emp(int sal) {
        this.sal = sal;
    }

    public int getSal() {
        return sal;
    }
}

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> p = i->i%2==0;
        System.out.println(p.test(12));
        System.out.println(p.test(15));

        Emp emp =new Emp(12000);
        Emp emp2 =new Emp(13000);

        Predicate<Emp> predicate = (e1) -> e1.getSal()>15000 ;
        System.out.println("Employee obj ::"+predicate.test(emp));

        String s [] = {"abc","aswini","kumar","Parida","adaa"};
        Predicate<String> predicate1 = (str)->str.length() >= 4;
        for (String s1:s) {
            if(predicate1.test(s1))
            System.out.println("string ::"+s1);
        }

        List<Emp> list = new ArrayList<>();
        list.add(new Emp(1200));
        list.add(new Emp(1300));
        list.add(new Emp(1400));
        list.add(new Emp(1500));
        list.add(new Emp(1700));

        Predicate<Emp> predicate2 =(e1) -> e1.getSal()>1600;
        for (Emp emp1: list) {
         if(predicate2.test(emp1))
             System.out.println("Emp sal"+emp1.getSal());
        }
    }
}
