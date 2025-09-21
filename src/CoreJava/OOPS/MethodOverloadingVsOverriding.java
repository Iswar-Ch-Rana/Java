package CoreJava.OOPS;

/**
 * Compile Time Polymorphism
 */

class Calculator {
    // Method overloading
    int add(int a, int b) {
        System.out.println("int method with 2");
        return a + b;
    }

    int add(int a, int b, int c) {
        System.out.println("int method with 3");
        return a + b + c;
    }

    double add(double a, double b) {
        System.out.println("double method");
        return a + b;
    }
}

/**
 * Run Time Polymorphism
 */

class Animal2 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog2 extends Animal2 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}


public class MethodOverloadingVsOverriding {
    public static void main(String[] args) {

        // Compile Time
        Calculator calc = new Calculator();
        int result1 = calc.add(2, 3);          // Calls int add(int a, int b)
        System.out.println("result1 -> " + result1);
        double result2 = calc.add(2.5, 3.5);   // Calls double add(double a, double b)
        System.out.println("result2 -> " + result2);
        double result3 = calc.add(2, 3, 4);   // Calls int add(int a, int b, int c)
        System.out.println("result3 -> " + result3);

        // Run Time
        Animal2 animal = new Dog2();  // Upcasting
        animal.sound();               // Calls Dog's overridden method

        Animal2 animal2 = new Animal2();
        animal2.sound();
    }
}
