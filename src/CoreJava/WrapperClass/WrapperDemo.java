package CoreJava.WrapperClass;

public class WrapperDemo {
    public static void main(String[] args) {
        // Autoboxing
        int a = 10;
        Integer obj = a; // primitive → object
        System.out.println("Autoboxed: " + obj);

        // Unboxing
        Integer b = 20;
        int c = b; // object → primitive
        System.out.println("Unboxed: " + c);

        // Wrapper methods
        String str = "100";
        int num = Integer.parseInt(str); // convert String to int
        System.out.println("Parsed int: " + num);

        // Performance caution
        Integer x = 1000;
        Integer y = 1000;
        System.out.println("x==y ? " + (x == y)); // false (different objects)
    }
}

