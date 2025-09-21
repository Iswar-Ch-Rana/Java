package CoreJava.MarkerInterface;

import java.io.Serializable;

// Example: Custom Marker Interface
interface Auditable {
}  // Marker

/**
 * 👉 Think of it like giving a person a VIP badge: the badge itself does nothing,
 * but security checks for the badge and treats the person differently.
 * <p>
 * Example -
 * Serializable → tells JVM that objects of this class can be serialized (converted into byte stream).
 * Cloneable → tells JVM that clone() method can be safely called.
 * RandomAccess → tells algorithms that a List supports fast random access (like ArrayList).
 * Remote → marks classes whose methods can be invoked remotely (RMI).
 *
 */

// Example: Serializable (Marker Interface)

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Example: Cloneable (Marker Interface)
class MyData implements Cloneable {
    int value;

    MyData(int value) {
        this.value = value;
    }

    @Override
    public MyData clone() throws CloneNotSupportedException {
        return (MyData) super.clone();
    }
}

class Order implements Auditable {
    int orderId;

    Order(int id) {
        this.orderId = id;
    }
}

public class MarkerDemo {
    public static void main(String[] args) throws Exception {
        Student s = new Student(1, "Alex");

        if (s instanceof Serializable) {
            System.out.println("Student can be serialized.");
        }

        MyData data = new MyData(100);
        MyData data2 = (MyData) data.clone();
        System.out.println("Cloned: " + data2.value);

        Order o = new Order(101);
        if (o instanceof Auditable) {
            System.out.println("Order is auditable.");
        }
    }
}

