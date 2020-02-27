package threadConcepts.threadbasics;


public class SynchronizationDemo extends Thread {
    int bookTicket;
    int availble=1;
    SynchronizationDemo(int bookTicket){
        this.bookTicket=bookTicket;
    }
    public void run() {
        synchronized (this) {
            if (availble>=bookTicket) {
                System.out.println("Ticket booked for person" + Thread.currentThread().getName());
                try {
                    Thread.sleep(3000);
                    availble= availble-bookTicket;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Tickets available" + availble);
            } else
                System.out.println("Sorry no Tickets available...");
        }
    }

    public static void main(String[] args) {
        SynchronizationDemo synchronizationDemo = new SynchronizationDemo(1);
        SynchronizationDemo synchronizationDemo1 = new SynchronizationDemo(1);
        synchronizationDemo.setName("1st person");
        synchronizationDemo.start();
        synchronizationDemo1.setName("2nd person");
        synchronizationDemo1.start();
    }

}
