package CoreJava.OOPS;

// Interface with abstract methods and default method
interface Pet {
    // Static method (concrete method)
    static void showAffection() {
        System.out.println("Showing affection.");
    }

    // Abstract method
    void play();

    // Default method (concrete method)
    default void beFriendly() {
        System.out.println("Being friendly.");
    }
}

// Abstract class
abstract class Animal1 {
    private String name;

    // Constructor in abstract class
    public Animal1(String name) {
        this.name = name;
    }

    // Abstract method (no implementation)
    public abstract void makeSound();

    // Concrete method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Class that extends abstract class and implements interface
class Dog1 extends Animal1 implements Pet {
    public Dog1(String name) {
        super(name); // Call the constructor of the abstract class
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }

    @Override
    public void beFriendly() { // can be overridden or default implementations
        System.out.println("heloo");
    }
}


public class AbstractVSInterfaceExample {
    public static void main(String[] args) {
        Dog1 myDog = new Dog1("Buddy");
        myDog.makeSound(); // Dog barks.
        myDog.sleep(); // Buddy is sleeping.
        myDog.play(); // Dog is playing.
        myDog.beFriendly(); // Being friendly.

        Pet.showAffection(); // Showing affection.
    }
}

