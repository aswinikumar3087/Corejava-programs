package collections.treeset;



import java.util.Comparator;
import java.util.TreeSet;

class Student implements Comparable<Student>{
    String id;
    String name;

    public Student(String id, String rollno) {
        this.id = id;
        this.name = rollno;
    }

    @Override
    public int compareTo(Student o1) {
        String id = o1.name;
       return this.name.compareTo(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
class EmployeeDemo implements Comparator<EmployeeDemo> {
    String name;
    int eid;

    public EmployeeDemo() {
    }

    public EmployeeDemo(String name, int eid) {
        this.name = name;
        this.eid = eid;
    }

    @Override
    public int compare(EmployeeDemo o1, EmployeeDemo o2) {
         return o1.eid<o2.eid ?-1 :o1.eid>o2.eid ?1:0;
    }

    @Override
    public String toString() {
        return "EmployeeDemo{" +
                "name='" + name + '\'' +
                ", eid='" + eid + '\'' +
                '}';
    }
}
public class TreesetDemo {
    public static void main(String[] args) {
       // TreeSet<Student> treeSet1 = new TreeSet();
        // treeSet1.add(new Student("101","ak"));
        //treeSet1.add(new Student("102","ak1"));
        TreeSet<EmployeeDemo> treeSet1 = new TreeSet(new EmployeeDemo());
        EmployeeDemo employee = new EmployeeDemo("aaa",101);
        EmployeeDemo employee1 = new EmployeeDemo("ayey",99);
        EmployeeDemo employee2 = new EmployeeDemo("aaa",111);
        EmployeeDemo employee3 = new EmployeeDemo("aaa",143);
        treeSet1.add(employee);
        treeSet1.add(employee1);
        treeSet1.add(employee2);
        treeSet1.add(employee3);
        treeSet1.add(new EmployeeDemo("bsbs",62));
        treeSet1.add(new EmployeeDemo("bsbs",452));
       // treeSet1.add(new EmployeeDemo("nddn",113));

        System.out.println(treeSet1.first());
        System.out.println(treeSet1.last());
        System.out.println(treeSet1.headSet(employee2));
        System.out.println(treeSet1.tailSet(employee2));
        System.out.println("comp:: "+treeSet1.comparator());

    }
/*public int compare(Object obj1,Object obj2){
        Integer obj = (Integer)obj1;
        Integer obj3 = (Integer)obj2;

      return  -obj.compareTo(obj3);
}*/
}
