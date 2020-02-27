package comparatorandcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

    public static void main(String [] args)
    {
        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(new Laptop("Dell",30000,4));
        laptopList.add(new Laptop("Dell",80000,8));
        laptopList.add(new Laptop("Dell",70000,6));
/*
        Comparator<Laptop> comparator = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop lap1, Laptop lap2) {
               if(lap1.getPrice()>lap2.getPrice())
               {return 1;}
               else
                   return -1;
            }
        };*/

        Collections.sort(laptopList, new Laptop());


        for (Laptop laptop: laptopList) {
            System.out.println(laptop);
        }

        String enggDetails = "700970245+Jagir Chahal+LWJXC61+true:601142666+Michael Gwynn+LWMXG41+true";
      String ein =   deriveEnggEIN(enggDetails);
        System.out.println("EIN ::"+ein);
    }
    private static String deriveEnggEIN(String enggDetails){
        String[] temp;
        String leadEnggEIN=null;
        if (enggDetails!=null) {
            temp = enggDetails.split("\\+");
            for(int i =0;i<temp.length;i++){

                System.out.println("temp ::"+temp[i]);
            }
            if (temp.length != 1) {
                leadEnggEIN = enggDetails.substring(0, enggDetails.indexOf('+'));
            }
        }
        return leadEnggEIN;
    }
}
