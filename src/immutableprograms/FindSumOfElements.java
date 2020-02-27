package immutableprograms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 609540082 on 26/11/2019.
 *
 * Sum of  2 numbers divisible by 60 and 1st element is the size of list i.e 8 here the size and remaining are the list elements
 */
public class FindSumOfElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(10);

int j =list.get(0);
int count=0;
int sum =0;
    for(int i=1;i<j;i++)
    {
        for(int k =i+1;k<=j;k++){
            int a=list.get(i);
            int b= list.get(k);
            //System.out.println("a"+a+"b"+b);
            System.out.println("Sum ::"+(a+b));
            sum = a+b;
            if((sum%60)==0)
            {
                count= count+1;
            }
        }
    }
        System.out.println("Count"+count);

    }
}
