package CoreJava.NestedClassAndStaticNestedClass;

// Inner Class Example
//public class OuterClass {
//    private final int outerField = 10;
//
//    class InnerClass {
//        void display() {
//            System.out.println("Outer field: " + outerField);
//        }
//    }
//
//    public static void main(String[] args) {
//        OuterClass outer = new OuterClass();
//        OuterClass.InnerClass inner = outer.new InnerClass();
//        inner.display(); // Output: Outer field: 10
//    }
//}

// Static Nested Class Example:
public class OuterClass {
    private static int staticOuterField = 20;

    public static void main(String[] args) {
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display(); // Output: Static outer field: 20
    }

    static class StaticNestedClass {
        void display() {
            System.out.println("Static outer field: " + staticOuterField);
        }
    }
}
/*
[0, 0, 3, 3, 5, 6]
 0 
* * */