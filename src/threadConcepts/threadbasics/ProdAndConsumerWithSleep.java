package threadConcepts.threadbasics;

class Producer extends Thread{

    boolean dataProdOver=false;
    StringBuilder sb;

    Producer(){
        sb= new StringBuilder();
    }
    public void run(){
        for(int i=0;i<10;i++){
            sb.append("Added :: "+i+"::");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        dataProdOver= true;
    }
}
class Consumer extends Thread{

    Producer producer;
    Consumer(Producer producer){
        this.producer =producer;
    }
    public void run(){
        try {
        while(!producer.dataProdOver){
            Thread.sleep(200);
            System.out.println("Waiting for producer to finish ::");
             }
        }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Printing sb ::"+producer.sb);
        }
    }

public class ProdAndConsumerWithSleep {
    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer(producer);
        producer.start();
        consumer.start();
    }
}
