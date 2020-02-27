package arrayprograms;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class FrequencyCount {
    public static void main(String[] args) {
        int a [] = {10,20,20,30,30,30};
        int twentyCounter=0;
        int thirtyCounter=0;

        Set<Integer> set = new HashSet<>();

        for(int i=0;i<a.length;i++){
            boolean flag =set.add(a[i]);

            if(flag == false){

                if(20==a[i]){
                    twentyCounter=twentyCounter+1;
                }else{
                    thirtyCounter =thirtyCounter+1;
                }
            }
        }
        System.out.println(twentyCounter);
        System.out.println(thirtyCounter);

        TreeSet treeSet = new TreeSet(set);

    }


}
