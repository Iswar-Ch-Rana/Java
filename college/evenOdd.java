import java.util.Scanner; 

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number for even or odd:");

        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}