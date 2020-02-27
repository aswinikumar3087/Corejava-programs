package arrayprograms;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        String str ="i am working in british telecom bangalore";
        //str  =str.replaceAll("\\s","");
        str = str.replace(" ","");
        //System.out.println();
        char ch []= str.toCharArray();
        System.out.println(Arrays.toString(ch));
        int length = str.length();
        //System.out.println(length);
        //int row = (int)Math.sqrt(length);

        int a1 = (int)Math.round(Math.sqrt(15));

        System.out.println("a1"+a1);
        int b1 = (int)Math.round(Math.ceil(Math.sqrt(length)));
        System.out.println("b1"+b1);
      //  System.out.println(a1 + "\t" + b1);

       // System.out.println(i);
       // int column =row+1;
       // System.out.println("row :"+row+"Column :"+column);
        System.out.println(ch.length);
        char b[][] = new char[a1][b1];

        int count = 0;
        for(int a=0;a<a1;a++){
            for(int m=0;m<b1;m++){
                if(count<ch.length){
                    b[a][m] = ch[count];
                    System.out.println("Count val ::"+count);
                    count++;
                }

            }
        }

        for(int i=0;i<a1;i++){
            for(int j=0;j<b1;j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}
