package threadConcepts.threadbasics;

class BookTicketOne implements Runnable{
    Object train;
    Object comp;
    int available =1;

    BookTicketOne(Object train,Object comp){
        this.train=train;
        this.comp =comp;
    }

        @Override
        public void run() {
         synchronized (train){
             System.out.println("Inside train");
             try{
             Thread.sleep(2000);}
             catch (Exception e){}
             synchronized (comp){
                 System.out.println("Inside comp:: booking berth :: available ticekts ::"+available);
                 available = available-1;

                 System.out.println("Available tickets ::"+available);
             }
         }
        }

}
class CancelTicketOne implements Runnable{

    Object train;
    Object comp;
    int available =2;

    CancelTicketOne(Object train, Object comp){
        this.train=train;
        this.comp=comp;
    }

        @Override
        public void run() {
         synchronized (comp){
             System.out.println("Inside comp..");
             synchronized (train){
                 System.out.println("Inside train :: cancelling ticket");
                 available = available+1;

                 System.out.println("available berth ::"+available);
             }
         }
        }

}
public class DeadlockPractice {

    public static void main(String[] args) {

     Object train = new Object();
     Object compartment = new Object();

     BookTicketOne bookTicketOne = new BookTicketOne(train,compartment);
        Thread thread = new Thread(bookTicketOne);
         thread.start();
     CancelTicketOne cancelTicketOne = new CancelTicketOne(train,compartment);
     Thread thread1 = new Thread(cancelTicketOne);
     thread1.start();
    }
}
