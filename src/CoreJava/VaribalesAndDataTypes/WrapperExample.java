package CoreJava.VaribalesAndDataTypes;

public class WrapperExample {
    public static void main(String[] args) {

        /*
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // Autoboxing of int to Integer

        String str = "123";
        int num = Integer.parseInt(str); // Converts String to int

        Integer obj = null; // Allowed
        int num = null;     // Compilation Error
        */
        /**
         * WrapperExample
         **/

        // Primitive type
        int num = 5;

        // Wrapper class (Boxing)
        Integer obj = num; // Autoboxing

        // Using utility method
        String str = obj.toString(); // Converts Integer to String

        // Unboxing
        int value = obj; // Auto-unboxing
        System.out.println("Primitive: " + value);
    }
}

