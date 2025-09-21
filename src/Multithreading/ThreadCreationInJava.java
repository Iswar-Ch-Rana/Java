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
    }
}
