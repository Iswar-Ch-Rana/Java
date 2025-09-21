package CoreJava.OverrideStaticMethodInJava;

/**
 * ✅ Interview Tip
 * <p>
 * If asked:
 * "Can we override static methods in Java?"
 * Answer:
 * <p>
 * 👉 No, we cannot override static methods. They are resolved at compile time and belong to the class, not the object.
 * If a child class defines the same static method, it is called method hiding, not overriding.
 *
 */
class Parent {
    public static void staticMethod() {
        System.out.println("Static method in Parent class");
    }

    public void instanceMethod() {
        System.out.println("Instance method in Parent class");
    }
}

class Child extends Parent {
    // This hides the static method in Parent, it does not override it
    public static void staticMethod() {
        System.out.println("Static method in Child class");
    }

    // This overrides the instance method in Parent
    @Override
    public void instanceMethod() {
        System.out.println("Instance method in Child class");
    }
}

public class OverrideStaticMethod {
    public static void main() {
        Parent parent = new Parent();
        Parent childAsParent = new Child();
        Child child = new Child();

        parent.staticMethod(); // Output: Static method in Parent class
        childAsParent.staticMethod(); // Output: Static method in Parent class
        child.staticMethod(); // Output: Static method in Child class

        parent.instanceMethod(); // Output: Instance method in Parent class
        childAsParent.instanceMethod(); // Output: Instance method in Child class
        child.instanceMethod(); // Output: Instance method in Child class
    }

}
/**
 * Explanation
 * 1. Static Method Calls:
 * Parent.staticMethod() prints "Static method in Parent class".
 * childAsParent.staticMethod() (where childAsParent is of type Parent) also prints "Static method in Parent class" because static methods are resolved at compile time based on the reference type, not the actual object.
 * child.staticMethod() (where child is of type Child) prints "Static method in Child class".
 * <p>
 * 2. Instance Method Calls:
 * parent.instanceMethod() prints "Instance method in Parent class".
 * childAsParent.instanceMethod() prints "Instance method in Child class" because instance methods are resolved at runtime based on the actual object.
 * child.instanceMethod() prints "Instance method in Child class".
 */

