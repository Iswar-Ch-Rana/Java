import java.util.Scanner; 

public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Num 1 : ");
        int num1 = input.nextInt();
        System.out.println("Enter Num 2 : ");
        int num2 = input.nextInt();

        if (num1 < num2) {
            int temp = num2 ;
            num2 = num1 ;
            num1 = temp ;
        }
        for (int i = num2; i >= 0; i--) {
            if(num1 % i == 0 && num2 % i == 0){
                System.out.println("The GCD of " + num1 + " and " + num2 + " = " + i);
                break ;
            }
        }
    }
}
