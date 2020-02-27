package threadConcepts.scheduledthreadpooldemo;


import threadConcepts.util.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorDemo {

    public static void main(String []args)
    {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);
        for(int i= 1;i<5;i++)
        {
            //service.schedule(new Task(),15, TimeUnit.SECONDS);
            System.out.println("threads..");
            //service.scheduleAtFixedRate(new Task(),10,13,TimeUnit.SECONDS);
            service.scheduleWithFixedDelay(new Task(),12,10,TimeUnit.SECONDS);
        }
        service.shutdown();
    }
}
