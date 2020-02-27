package arrayprograms;

/**
 * Created by 609540082 on 26/11/2019.
 */
public class MaxOfArray {
    public static void main(String[] args) {
        int []a={3,56,77,4,322,453,311,54554545,34334,545454,787878878,344};
        int max=0;
        int min=0;
        for(int i=0;i<a.length-1;i++){
            max = Math.max(max,a[i]);
          // int min1 = Math.min(a[i],a[i+1]);
           // System.out.println(max);
            System.out.println(min);
        }

        System.out.println("max of array::"+max);
        System.out.println("min of array::"+min);
    }
}
