package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by 609540082 on 24/08/2019.
 */
public class SetDemo{
    public static void main(String[] args) {
        Set set = new HashSet<>();
        set.add(new Student(1,"aswini"));
        set.add(new Student(1,"aswini"));

        System.out.println(set.size());

        Map map = new HashMap<>();
        map.put("Micky","mouse");
        map.put("Micky","mount");
        System.out.println("map size"+map.get("Micky"));
    }
}

class Student{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
