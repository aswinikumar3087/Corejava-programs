package threadConcepts.util;


public class Task implements Runnable{

    public void run()
    {
        try{
            Thread.sleep(200);
            System.out.println("Inside run method () Thread name ::"+Thread.currentThread().getName());
            Thread.sleep(100);
        }catch (Exception e)
        {
            System.out.println("exception occured ....");
        }
    }

}
