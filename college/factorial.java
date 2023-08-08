import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for factorial:");
        int num = input.nextInt() ;
        int fac = facto(num);
        System.out.println("The Factorial of "+ num + " = " + fac);
    }
    public static int facto(int num){
        if( num == 0 || num == 1)
            return 1 ;

        return num * facto(num-1) ;
    }
}
