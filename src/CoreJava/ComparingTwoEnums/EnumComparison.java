package CoreJava.ComparingTwoEnums;

/**
 * Interview Tip
 * <p>
 * Common question:
 * <p>
 * Q: Can we use == to compare enums in Java?
 * <p>
 * 👉 Yes. Unlike normal objects, enums are guaranteed singletons, so == works perfectly and is the recommended way.
 * <p>
 * Q: What’s the difference between == and .equals() with enums?
 * <p>
 * 👉 Both work the same, but == is preferred for enums.
 *
 */

public class EnumComparison {
    static void main() {
        Color color1 = Color.RED;
        Color color2 = Color.RED;
        Color color3 = Color.GREEN;

        if (color1 == color2) {
            System.out.println("color1 and color2 are the same");
        } else {
            System.out.println("color1 and color2 are different");
        }

        if (color1 == color3) {
            System.out.println("color1 and color3 are the same");
        } else {
            System.out.println("color1 and color3 are different");
        }

        System.out.println();
        if (color1.equals(color2)) {
            System.out.println("color1 and color2 are the same");
        } else {
            System.out.println("color1 and color2 are different");
        }

        if (color1.equals(color3)) {
            System.out.println("color1 and color3 are the same");
        } else {
            System.out.println("color1 and color3 are different");
        }
    }
}
