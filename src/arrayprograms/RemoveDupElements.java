package arrayprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 609540082 on 26/08/2019.
 */
public class RemoveDupElements {
    public static void main(String[] args) {
        int array[] = {10,20,45,32,10,20,55,65,32,43,55};
        int array2[] = {10,20,45,32,10,20,55,65,32,43,55};
        Object obj[]={array};
        Object obj1[]={array2};
        Object obj2[]={obj};
        Object obj3[]={obj1};

        Set set = new HashSet<>();
        for(int i=0;i<array.length;i++){
            if(!set.add(array[i])){
                System.out.println("Duplicate found ::"+array[i]);
            }
        }
        //Compare tw arrays
        System.out.println("Array comparison :: "+Arrays.equals(array,array2));

        //Array deep Comparison
        System.out.println("Array Deep Comparson inner objects :: "+Arrays.deepEquals(obj2,obj3));


    }
}
