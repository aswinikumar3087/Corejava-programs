package threadConcepts.customthreadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

public class CustomThreadPool {
    public static void main(String[] args) {

        System.out.println();
        ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        ThreadPoolExecutor executor1 = (ThreadPoolExecutor)Executors.newFixedThreadPool(3);
        ScheduledThreadPoolExecutor executor2 = (ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(4);

    }
}
