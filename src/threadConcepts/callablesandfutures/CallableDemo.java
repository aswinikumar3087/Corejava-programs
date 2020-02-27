package threadConcepts.callablesandfutures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args)  {
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        List<Future> list = new ArrayList();
        for(int i =1;i<30;i++)
        {
      Future future =  executorService.submit(new Callable<Integer>() {
                public Integer call() throws Exception{
                    System.out.println("Thread name "+Thread.currentThread().getName());
                    Thread.sleep(2000);
                    return new Random().nextInt();
                }
            });
            list.add(future);
        }

   for(int i =1;i<list.size();i++)
   {
       Future future = list.get(i);
       try {
           Integer a = (Integer)future.get();
           System.out.println("Int value a :: "+a);
       } catch (InterruptedException | ExecutionException e) {
           e.printStackTrace();
       }
   }
        System.out.println("Main () :: Ends");
        executorService.shutdownNow();
    }
}
