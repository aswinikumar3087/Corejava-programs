package threadConcepts.threadbasics;

class BookTicket extends Thread{

    Object train;
    Object comp;
    BookTicket(Object train,Object comp){
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

class CancelTicket extends Thread{

    Object train,comp;

    CancelTicket(Object train,Object comp){
        this.train=train;
        this.comp=comp;
    }
    public void run(){
        synchronized (comp){
            System.out.println("Cancel Ticket :: Comp obj locked");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (train){
                System.out.println("Cancel ticket :: Train obj locked..");
            }
        }
    }
}
public class DeadlockDemo {
    public static void main(String[] args) {
        Object train = new Object();
        Object comp = new Object();

        BookTicket bookTicket = new BookTicket(train,comp);
        CancelTicket cancelTicket = new CancelTicket(train,comp);
        bookTicket.start();
        cancelTicket.start();
    }
}
