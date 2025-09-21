package CoreJava.SuperExample;

/**
 * 🔹 Interview Tip
 * <p>
 * Common questions:
 * <p>
 * Difference between this and super.
 * <p>
 * Can super() be used in static methods? → No.
 * <p>
 * Can super access private members of parent? → No, only protected or public.
 * <p>
 * Mistakes to avoid:
 * <p>
 * Forgetting that super() must be the first statement in constructor.
 * <p>
 * Confusing this() with super().
 * <p>
 * <p>
 * 🔹 Deep Insights
 * <p>
 * super can only be used in instance methods or constructors, not in static methods.
 * <p>
 * Constructor call: super() must be the first statement in the child constructor.
 * <p>
 * Java automatically inserts a no-arg super() call in child constructors if you don’t explicitly call a parent constructor.
 * <p>
 * Shadowed variables: If a child declares a variable with the same name as parent, super.varName is needed to access the parent’s version.
 */

class Parent1 {
    void show() {
        System.out.println("Parent1 show()");
    }
}

class Child1 extends Parent1 {
    void show() {
        System.out.println("Child1 show()");
    }

    void display() {
        show();       // calls Child1's show()
        super.show(); // calls Parent1's show()
    }
}

class Parent2 {
    int x = 10;
}

class Child2 extends Parent2 {
    int x = 20;

    void printValues() {
        System.out.println("Child x: " + x);
        System.out.println("Parent x: " + super.x);
    }
}

class Parent3 {
    Parent3() {
        System.out.println("Parent constructor");
    }
}

class Child3 extends Parent3 {
    Child3() {
        super();  // calls Parent constructor
        System.out.println("Child constructor");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.display();

        Child2 c2 = new Child2();
        c2.printValues();

        Child3 c3 = new Child3();
    }
}

