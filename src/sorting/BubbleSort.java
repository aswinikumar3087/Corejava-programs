package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int a[] = {23,4,5,2,55,32,12,22};
        int size = a.length;

        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1-i;j++){
                if (a[j]>a[j+1]){

                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]=temp;
                    //System.out.println("Swapped Elements :: jth ::"+j+" 1st element :: "+a[j]+" j+1th :: "+(j+1)+" 2nd element"+a[j+1]);
                }
            }

        }
        System.out.println("Arrays elements in sorted order ::"+Arrays.toString(a));
    }
}
