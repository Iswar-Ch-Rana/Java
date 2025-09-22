package CoreJava.VariableLengthArguments;

class VarArgDemo {
    // Var-Arg method
    static int sum(int... numbers) {
        int result = 0;
        for (int n : numbers) {
            result += n;
        }
        return result;
    }

    // Var-Arg with another parameter
    static void greet(String message, String... names) {
        for (String name : names) {
            System.out.println(message + ", " + name);
        }
    }

    public static void main(String[] args) {
        System.out.println(sum());                 // 0
        System.out.println(sum(5));                // 5
        System.out.println(sum(1, 2, 3, 4, 5));    // 15

        greet("Hello", "Alice", "Bob", "Charlie");
    }
}

