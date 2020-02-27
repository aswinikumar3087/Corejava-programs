package collections.customcollectiondevelopment;


import java.util.Properties;

public class CustomDemo {

    public static void main(String []args)
    {
       /*CustomCollection customCollection = new CustomCollection();
        customCollection.add(1);
        customCollection.add(12);
        customCollection.add(15);
        customCollection.add(16);
        //Fetch all elements from Collection
        //customCollection.getAll();
        customCollection.replace(2,30);
        customCollection.getAll();
        System.out.println(customCollection.get(2));
        System.out.println("size of collection ::"+customCollection.size());
        customCollection.removeElement(2);
        System.out.println("elements after removing 2nd index");
        customCollection.getAll();*/
        Properties properties = new Properties();
        properties.setProperty("name","aswini");
        properties.setProperty("surname","parida");

        System.out.println(properties.getProperty("surname"));

        CustomCollectionDevelopment customCollectionDevelopment = new CustomCollectionDevelopment();
        customCollectionDevelopment.add(1);
        customCollectionDevelopment.add(2);
        customCollectionDevelopment.add(3);
        customCollectionDevelopment.add(4);
        System.out.println("element is ::"+customCollectionDevelopment.get(2));
        customCollectionDevelopment.remove(2);
        customCollectionDevelopment.getAllelements();

    }
}
