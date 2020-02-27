package arrayprograms;

import java.util.Arrays;

public class BinarySearchIterativeApproach {
    public static void main(String[] args) {
        int a[]= {23,4,2,16,78,55,44,65,87,43,56};
        Arrays.sort(a);
        //System.out.println(Arrays.toString(a));

        int key=99;
        int low=1;
        int high = a.length;

        int index = binarySearch(low,high,key,a);
        System.out.println("index"+index);
    }
    public static int binarySearch(int low,int high,int key,int a[]){
        System.out.println(Arrays.toString(a));
        int mid= (low+high)/2;

        for(int i=low;i<high;i++){
            if(key==a[mid]){
                return mid;
            }else{
                if(key<a[mid]){
                    high = mid;
                    mid = (low+mid)/2;

                }else{
                    low = mid;
                    mid = (low+high)/2;
                }
            }
        }
        return -1;

    }
}
