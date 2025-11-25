package Multithreading;

class RunnableTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable is running");
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableTask());
        thread.start();
    }
}
