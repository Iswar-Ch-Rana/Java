package CoreJava.FinalKeywordAffectClassInheritanceAndMethodOverriding;

/**
 * 🔹 Concept Explanation
 *
 * In Java, the final keyword has 3 main uses:
 *
 * Final variables → constants (cannot be reassigned).
 *
 * Final methods → cannot be overridden.
 *
 * Final classes → cannot be extended (no subclassing).
 * */

class Parent {
    final void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    // ❌ Compilation Error: cannot override final method
    // void show() { System.out.println("Child show()"); }
}

final class Vehicle {
    void drive() {
        System.out.println("Driving vehicle...");
    }
}

// ❌ Compilation Error: cannot inherit from final Vehicle
// class Car extends Vehicle {}

public class FinalClassDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.show(); // Always calls Parent's show()

        Vehicle v = new Vehicle();
        v.drive();
    }
}
