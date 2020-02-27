package threadConcepts.threadbasics;

import java.util.ArrayList;
import java.util.List;

class producerPractice extends Thread{

    List<Integer> list =new ArrayList<>();

    @Override
    public void run() {
        synchronized (list){
        for (int i =0;i<20;i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Prodcer engaged ::" + i);
                list.add(i);
            } catch (Exception e) {

            }
        }
        list.notify();
        }
    }
}
class ConsumerPractice extends Thread{
    producerPractice producer;
    ConsumerPractice(producerPractice producer){
      this.producer = producer;
  }
    @Override
    public void run() {
        synchronized (producer.list){
            try{
                System.out.println("Consumer waiting");
                producer.list.wait();
            }catch (Exception e){
                System.out.println("");
            }
            for (Integer a :producer.list) {
                System.out.println("elelments ::"+a);
            }
        }

    }
}

public class PraducerConsumerPractice {

    public static void main(String[] args) {

        producerPractice producerPractice = new producerPractice();
        ConsumerPractice consumerPractice = new ConsumerPractice(producerPractice);
        producerPractice.start();
        consumerPractice.start();
    }
}
