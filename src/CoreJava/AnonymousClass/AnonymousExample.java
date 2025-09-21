package CoreJava.AnonymousClass;

abstract class Shape {
    abstract void calculateArea(int dimension);
}

public class AnonymousExample {
    public static void main(String[] args) {
        Shape circle = new Shape() {
            @Override
            void calculateArea(int radius) {
                double result = Math.PI * radius * radius;
                System.out.println("The Area: " + result);
            }
        };
        circle.calculateArea(5);

        Shape square = new Shape() {
            @Override
            void calculateArea(int side) {
                System.out.println("The Area: " + Math.pow(side, 2));
            }
        };
        square.calculateArea(9);
    }
}
