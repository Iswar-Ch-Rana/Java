import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for prime or not:");
        int num = input.nextInt();
        int count = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Number is Not prime");
        } else {
            System.out.println("Number Is Prime");
        }
    }
}
