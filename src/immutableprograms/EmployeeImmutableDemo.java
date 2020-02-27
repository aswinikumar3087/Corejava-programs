/*
* Immutable class with mutable objects like Date and Collections
* */
package immutableprograms;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

final class Employee{

    private final int id;

    private final String name;

    private final HashMap<String,String> testMap;

    private final Date date;

    public Employee(int id, String name, HashMap<String, String> testMap,Date date) {
        this.id = id;
        this.name = name;
        this.testMap = testMap;
        this.date=date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getTestMap() {
        return (HashMap<String, String>) testMap.clone();
    }

    public Date getDate() {
        return (Date)date.clone();
    }
}
public final class EmployeeImmutableDemo {
    public static void main(String[] args) {
        HashMap<String, String> h1 = new HashMap<String,String>();
        h1.put("1", "first");
        h1.put("2", "second");
        Employee employee = new Employee(101,"Aswini",h1,new Date());
        System.out.println("Eid"+employee.getId());
        System.out.println("Ename"+employee.getName());
        employee.getTestMap().put("3","dummy");
        System.out.println("map :: "+employee.getTestMap().keySet());
        System.out.println("map :: "+employee.getDate().getTime());
        employee.getDate().setDate(10);
        System.out.println("after modifying date :: "+employee.getDate().getTime());

        //System.out.println("Date"+ employee.getDate());
    }

}
