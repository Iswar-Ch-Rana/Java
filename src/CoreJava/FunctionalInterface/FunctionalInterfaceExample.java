package CoreJava.FunctionalInterface;

@FunctionalInterface
interface Operation {
    int apply(int a, int b);

    default void printResult(String name, Operation op, int a, int b) {
        System.out.println(name + " -> " + op.apply(a, b));
    }
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation mul = (a, b) -> a * b;
        Operation div = (a, b) -> b == 0 ? 0 : a / b;

        sum.printResult("Addition", sum, 10, 5);
        sub.printResult("Subtraction", sub, 10, 5);
        mul.printResult("Multiplication", mul, 10, 5);
        div.printResult("Division", div, 10, 0);
    }
}
