package threadConcepts.cachedthreadpools;

import threadConcepts.util.Task;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {

    public static void main(String [] args) throws Exception
    {
        int processorCount = Runtime.getRuntime().availableProcessors();
        System.out.println("processorCount"+processorCount);
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i =1;i<50;i++)
        {
            Thread.sleep(2000);
            service.execute(new Task());
        }
        service.shutdownNow();
        System.out.println("Finished");
    }
}
