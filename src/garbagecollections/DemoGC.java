package garbagecollections;

import java.util.Date;

/**
 * Created by 609540082 on 03/06/2019.
 */
public class DemoGC {
    public static void main(String []args)
    {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory :: "+runtime.totalMemory());
        System.out.println("Free memory :: "+runtime.freeMemory());

        for(int i=0;i<=100;i++)
        {
            Date date = new Date();
            date = null;

        }
        runtime.gc();
        System.out.println("Free memory :: "+runtime.freeMemory());
    }
}
