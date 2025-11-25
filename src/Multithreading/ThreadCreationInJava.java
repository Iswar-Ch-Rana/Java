package Multithreading;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}


class MyRunnable1 implements Runnable {
    public void run() {
        // Code to be executed by the thread
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

public class ThreadCreationInJava {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread running: " + Thread.currentThread().getName());
        });
        t1.start();
        MyRunnable1 myRunnable = new MyRunnable1();

        Thread t2 = new Thread(myRunnable);
        t2.start();


        // Better way
        Runnable newRunnable = () -> {
            System.out.println("Thread is running");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().isAlive());
            System.out.println(Thread.currentThread().threadId());
            System.out.println(Thread.currentThread().getPriority());
            System.out.println(Thread.currentThread().getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread t3 = new Thread(newRunnable, "my-thread-name");

        t3.start();
    }
}
