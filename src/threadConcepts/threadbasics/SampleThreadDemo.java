package threadConcepts.threadbasics;

public class SampleThreadDemo extends Thread {

    public void run() {
        System.out.println("From Basic thread class" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        SampleThreadDemo sampleThreadDemo = new SampleThreadDemo();
        sampleThreadDemo.start();

        Thread thread = new Thread(sampleThreadDemo);
        thread.start();

        Mythread mythread = new Mythread();
        Thread thread1 = new Thread(mythread);
        thread1.start();
    }
}
    class Mythread implements Runnable{
        @Override
        public void run() {
            System.out.println("From Mythread class"+Thread.currentThread().getName());
        }
    }

