package stringpackage;

import java.util.Scanner;

/**
 * Created by 609540082 on 04/12/2019.
 */
public class EvenoddStrings
{

        public static void main(String[] args) {
         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);

             System.out.println("Enter number of strings :: 1st will be integer and then strings");
            int number = sc.nextInt();
            sc.nextLine();

            for(int i =0;i<number;i++){
                String s1 = sc.nextLine();

                char []ch = s1.toCharArray();
                int length = s1.length();

                StringBuilder sb = new StringBuilder();
                for(int j=0;j<length;j=j+2){

                    sb.append(ch[j]);
                }
                sb.append(" ");
                for(int k=1;k<length;k=k+2){
                    sb.append(ch[k]);
                }
                System.out.println(sb.toString());

            }
            sc.close();
        }

}
