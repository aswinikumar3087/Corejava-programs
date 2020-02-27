package sorting;

public class QuickSortDemo {
    public static void main(String[] args) {
        int a[] = {10,16,8,12,15,6,3,9,5};
        int pivot = 10;
        int low=0;
        int high = a.length;
        //doPartition(low,high,pivot,a);

    }
  /*  public static int [] doPartition(int low,int high, int pivot,int a[]){
        int i =low+1;
        while(pivot <=a[i]){
            i++;
        }
        int j = high-1;
        while(pivot>a[j]){
            j--;
        }
        if(i<j){
          int temp = a[i];
          a[i]=a[j];
          a[j] = temp;
        }
    }*/
}
