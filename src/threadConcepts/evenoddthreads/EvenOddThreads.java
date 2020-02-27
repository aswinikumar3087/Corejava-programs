package threadConcepts.evenoddthreads;

class EvenThread implements Runnable{
      EvenOddThreads evenOddThreads;

      EvenThread (EvenOddThreads evenOddThreads){
        this.evenOddThreads= evenOddThreads;

      }
      public void run(){
        evenOddThreads.printEvenNums();

     }
 }
   class OddThread implements Runnable{
    EvenOddThreads evenOddThreads;

       OddThread (EvenOddThreads evenOddThreads){
       this.evenOddThreads= evenOddThreads;

    }

    public void run(){
        evenOddThreads.printOddNums();
    }
}
public class EvenOddThreads {
    int current;
    int max;
    EvenOddThreads(int current,int max){
        this.current=current;
        this.max=max;
    }
    public static void main(String[] args) {

        EvenOddThreads evenOddThreads = new EvenOddThreads(1,20);

        OddThread oddThread = new OddThread(evenOddThreads);
        EvenThread evenThread = new EvenThread(evenOddThreads);
        Thread thread1 = new Thread(evenThread);
        thread1.setName("Even Thread");
        Thread thread = new Thread(oddThread);
        thread.setName("Odd thread");
        thread1.start();
        thread.start();
    }

    public void printEvenNums(){
        while(this.current<=this.max){
            synchronized (this){
                if(this.current%2 ==0){
                    System.out.println("Even Num ::"+this.current+"Thread name ::"+Thread.currentThread().getName());
                    this.current++;
                    this.notify();
                }else{
                    try{

                        this.wait();
                    }catch (InterruptedException ie){

                    }
                }
            }
        }
    }
    public void printOddNums(){
        while(this.current<=this.max){
            synchronized (this){
                if(this.current%2 !=0){
                    System.out.println("Odd Num ::"+this.current+"Thread name ::"+Thread.currentThread().getName());
                    this.current++;
                    this.notify();
                }else{
                    try{

                        this.wait();
                    }catch (InterruptedException ie){

                    }
                }
            }
        }
    }
 }


