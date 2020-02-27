package arrayprograms;

import java.util.Arrays;
import java.util.Collections;

//Sort first k values in ascending order and remaining n-k values in descending order
public class SortingArray {
    public static void main(String[] args) {
        int a[]={4,3,2,1,9,5,8,7,6};
        int k=4;
        sortArray(a,k);

        printArray(a);

    }
    private static int[] sortArray(int[] a,int k){
        int arr1[]=new int[k];
        //adding the elements to arr1
        for(int i =0;i<k;i++){
            arr1[i] =a[i];
        }
        //Sort the array in ascending order

        Arrays.sort(arr1);
        int length =a.length-k;
        int arr2[]= new int[length];
        for(int i=k;i<a.length;i++){
            arr2[i-k] =a[i];
        }
       // Arrays.sort(a,k,length);
      //  Arrays.sort(Integer a [],k,a.length, Collections.<Integer>reverseOrder());
        int len2 = arr2.length;
       for(int i=0;i<a.length;i++){
           if(i<k){
               a[i]=arr1[i];
           }else{
               a[i]=arr2[len2-1];
               len2--;
           }

       }
return a;
    }
    private static void printArray(int[] a){
    for(int i=0;i<a.length;i++){
    System.out.println("array elements :"+a[i]);
    }
    }
}
