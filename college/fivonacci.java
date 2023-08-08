import java.util.Scanner;

public class fivonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for Fibonacci :");
        int num = input.nextInt() ;
        fevo(num);
        System.out.println();
    }
    public static void fevo(int num){
        int first = 0 ;
        int second = 1 ;
        int sum = 0 ;
        System.out.print(first+ " ");
        System.out.print(second+ " ");
        for (int i = 0; i < num-2; i++) {
            int temp = first + second ;
            first = second ;
            second = temp ;
            System.out.print(temp + " ");
            if( temp %2 == 0){
                sum+= temp ;
            }
        }
        System.out.println("\nThe Even sum of Fibonacci series = "+sum);
    }
}
