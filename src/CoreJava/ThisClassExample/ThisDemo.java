package CoreJava.ThisClassExample;

/**
 * 🔹 Concept Explanation
 * <p>
 * The this keyword in Java is a reference to the current object — the object whose method or constructor is being called.
 * <p>
 * It’s used for:
 * <p>
 * Referring to instance variables when they are shadowed by local variables.
 * <p>
 * Calling other constructors in the same class.
 * <p>
 * Passing the current object as an argument to methods or constructors.
 * <p>
 * Returning the current object from a method (useful for method chaining).
 */

// 1. Distinguish instance variable from local variable

class Employee1 {
    private String name;

    Employee1(String name) {
        this.name = name;  // this.name refers to instance variable
    }

    void printName(String name) {
        System.out.println("Local name: " + name);      // method argument
        System.out.println("Instance name: " + this.name); // current object field
    }
}

// 2. Constructor chaining
class Employee2 {
    private String name;
    private int id;

    Employee2(String name) {
        this.name = name;
    }

    Employee2(String name, int id) {
        this(name);  // call another constructor
        this.id = id;
    }

    void printInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// 3. Passing current object as method argument
class Printer {
    void print(Employee3 e) {
        System.out.println("Printing employee: " + e.name);
    }
}

class Employee3 {
    String name;

    Employee3(String name) {
        this.name = name;
    }

    void show(Printer p) {
        p.print(this);  // pass current object
    }
}

public class ThisDemo {
    static void main() {
        Employee1 e1 = new Employee1("Alex");
        e1.printName("John");

        Employee2 e2 = new Employee2("Alex", 101);
        e2.printInfo();

        Printer p = new Printer();
        Employee3 e3 = new Employee3("Alex");
        e3.show(p);
    }
}
