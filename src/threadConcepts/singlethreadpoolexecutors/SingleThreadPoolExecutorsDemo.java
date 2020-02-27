package threadConcepts.singlethreadpoolexecutors;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPoolExecutorsDemo {

    public static void main(String []args)
    {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i =1;i<4;i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Inisde run :: STPED");
                }
            });
        }
        executorService.shutdownNow();
    }
}
