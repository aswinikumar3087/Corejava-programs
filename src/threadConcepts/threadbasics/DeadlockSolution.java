package threadConcepts.threadbasics;

class BookTicket1 extends Thread{

    Object train;
    Object comp;
    BookTicket1(Object train,Object comp){
        this.train = train;
        this.comp = comp;
    }
    public void run(){
        synchronized (train){
            System.out.println("Booked ticket locked on train");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (comp){
                System.out.println("Booked Ticket locked on compartment");
            }
        }
    }
}

class CancelTicket1 extends Thread{

    Object train,comp;

    CancelTicket1(Object train,Object comp){
        this.train=train;
        this.comp=comp;
    }
    public void run(){
        synchronized (train){
            System.out.println("Cancel Ticket :: Comp obj locked");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (comp){
                System.out.println("Cancel ticket :: Train obj locked..");
            }
        }
    }
}
public class DeadlockSolution {
    public static void main(String[] args) {
        Object book = new Object();
        Object cancel = new Object();
        BookTicket1 bookTicket1 = new BookTicket1(book,cancel);
        CancelTicket1 cancelTicket = new CancelTicket1(book,cancel);
        bookTicket1.start();
        cancelTicket.start();

    }
}
