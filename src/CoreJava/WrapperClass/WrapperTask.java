package CoreJava.WrapperClass;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

/**
 * 🔹 Task / Exercise
 * <p>
 * 1. Create a program that:
 * <p>
 * Stores 5 primitive values (int, double, boolean) in wrapper classes.
 * <p>
 * Adds them to an ArrayList (which only accepts objects).
 * <p>
 * Retrieve and unbox them, printing the results.
 * <p>
 * 2. Write a small benchmark to compare:
 * <p>
 * Adding int values vs adding Integer objects in a loop of 1M iterations.
 * <p>
 * Measure time difference (to see autoboxing overhead).
 *
 */

public class WrapperTask {

    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    // Task 1: Wrapper storage and unboxing
    private static void taskOne() {
        int a = 10;
        double b = 20.5;
        boolean c = false;
        char d = 'A';
        byte e = 127;

        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(a); // autoboxing to Integer
        arrayList.add(b); // autoboxing to Double
        arrayList.add(c); // autoboxing to Boolean
        arrayList.add(d); // autoboxing to Character
        arrayList.add(e); // autoboxing to Byte

        for (Object obj : arrayList) {
            if (obj instanceof Integer value) {
                System.out.println("Unboxed Integer: " + value);
            } else if (obj instanceof Double value) {
                System.out.println("Unboxed Double: " + value);
            } else if (obj instanceof Boolean value) {
                System.out.println("Unboxed Boolean: " + value);
            } else if (obj instanceof Character value) {
                System.out.println("Unboxed Character: " + value);
            } else if (obj instanceof Byte value) {
                System.out.println("Unboxed Byte: " + value);
            }
        }
        System.out.println();
    }

    // Task 2: Benchmark primitives vs wrappers
    private static void taskTwo() {
        int iterations = 1_000_000;

        long primitiveDuration = benchmarkPrimitives(iterations);
        long wrapperDuration = benchmarkWrappers(iterations);

        System.out.println("Primitive duration: " + primitiveDuration + " ns");
        System.out.println("Wrapper duration: " + wrapperDuration + " ns");
        System.out.println("Difference: Wrapper is slower by " + (wrapperDuration - primitiveDuration) + " ns");
        double percentageDifference = ((double) Math.abs(wrapperDuration - primitiveDuration) / primitiveDuration) * 100;
        System.out.println("Difference: In % -> " + percentageDifference);
    }

    private static long benchmarkPrimitives(int iterations) {
        long x = 1L, ans = 0L;
        Instant start = Instant.now();
        for (int i = 0; i < iterations; i++) {
            ans += x;
        }
        Instant end = Instant.now();
        return Duration.between(start, end).toNanos();
    }

    private static long benchmarkWrappers(int iterations) {
        Long x = 1L, ans = 0L;
        Instant start = Instant.now();
        for (int i = 0; i < iterations; i++) {
            ans += x; // causes auto unboxing + boxing
        }
        Instant end = Instant.now();
        return Duration.between(start, end).toNanos();
    }
}

