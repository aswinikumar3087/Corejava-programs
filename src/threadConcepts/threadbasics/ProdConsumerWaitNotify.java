package threadConcepts.threadbasics;

class Producer1 extends Thread{

    boolean dataProdOver=false;
    StringBuilder sb;

    Producer1(){
        sb= new StringBuilder();
    }
    public void run(){
        synchronized (sb) {
            for (int i = 0; i < 10; i++) {
                sb.append("Added :: " + i + "::");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            sb.notify();
        }
        //dataProdOver= true;
    }
}
class Consumer1 extends Thread{

    Producer1 producer;
    Consumer1(Producer1 producer){
        this.producer =producer;
    }
    public void run(){
        synchronized (producer.sb) {
            try {
                producer.sb.wait();
                System.out.println("Consumer waiting...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Printing sb ::" + producer.sb);
        }
    }
}
public class ProdConsumerWaitNotify {
    public static void main(String[] args) {
    Producer1 producer1 = new Producer1();
    Consumer1 consumer1 = new Consumer1(producer1);

    producer1.start();
    consumer1.start();

    }
}
