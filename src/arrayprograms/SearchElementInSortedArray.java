package arrayprograms;

/**
 * Created by 609540082 on 15/11/2019.
 * search an element in sorted array by binary search
 */
public class SearchElementInSortedArray {

    public static void main(String[] args) {
        int arr[] ={3,4,5,6,7,8,9,10,11,12};

        int key,n;
         n = arr.length;
         key = 6;
       int index= binarySearchElement(arr,0,key,n);
        System.out.println("Index ::"+index);
    }
    static int binarySearchElement(int a[],int low,int key,int length){

        if(length <0)
            return -1;
        else{
            int mid = (low+length)/2;
           if(key == a[mid])
               return mid;
           else
               return key>a[mid] ?binarySearchElement(a,mid+1,key,length):binarySearchElement(a,low,key,mid-1);
        }


    }
}
