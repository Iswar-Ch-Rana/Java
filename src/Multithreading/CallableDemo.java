package Multithreading;

import java.util.concurrent.*;

class CallableTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000); // simulate task
        return 42;
    }
}

public class CallableDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new CallableTask());

        System.out.println("Result: " + future.get()); // waits and returns result
        System.out.println(future.isDone());
        executor.shutdown();
    }
}

