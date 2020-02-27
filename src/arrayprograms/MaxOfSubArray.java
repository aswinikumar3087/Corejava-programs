package arrayprograms;
/*
* Find max value of sub array of an array for k=3 -- Sliding window technique
*  e.g.= {2,4,5,9,32,21,4,13}
*    1st 3 ele = 2+4+5= 11
*    2nd 3 ele = 4+5+9=18
*    3rd =5+9+32=46
*    4th = 9+32+21=62
*    5th = 32+21+4=57
*    6th = 21+4+13=38
*
*    So the output will be 62  with O(n)
* */


public class MaxOfSubArray {
    public static void main(String[] args) {

        int a[] = {2,4,5,9,32,21,4,64,2,33,13};
        int k=3;
        int wsum=0;
        int maxsum=0;

        for(int i=0;i<k;i++){
           wsum = wsum+a[i]; //11
           // System.out.println("wsum"+wsum);

        }
        for(int j=1;j<=k;j++){
            int msum = (wsum+a[k])-a[j-1];
            maxsum=Math.max(msum,wsum);
            wsum=Math.max(msum,wsum);
            System.out.println("Max Sum"+wsum);

            if (k<a.length-1)
                k++;
            else break;

        }
        System.out.println("max of List::"+maxsum);
    }
}
