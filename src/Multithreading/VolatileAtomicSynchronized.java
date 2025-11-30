package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

// Volatile
class VolatileExample {
    private volatile boolean flag;

    public void setFlag(boolean value) {
        flag = value;
    }

    public boolean getFlag() {
        return flag;
    }
}

// Atomic

class AtomicExample {
    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCount() {
        return counter.get();
    }
}

// Synchronized
class SynchronizedExample {
    private int count;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}


public class VolatileAtomicSynchronized {
    static void main() {
        VolatileExample volatileExample = new VolatileExample();
        AtomicExample atomicExample = new AtomicExample();
        SynchronizedExample synchronizedExample = new SynchronizedExample();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                volatileExample.setFlag(true);
                atomicExample.increment();
                synchronizedExample.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                volatileExample.setFlag(false);
                atomicExample.increment();
                synchronizedExample.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join(); // Main thread waits for t1 to finish
            t2.join(); // Main thread waits for t2 to finish
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(volatileExample.getFlag());
        System.out.println(atomicExample.getCount());
        System.out.println(synchronizedExample.getCount());
    }
}
