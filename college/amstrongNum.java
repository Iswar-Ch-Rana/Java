import java.util.Scanner;
import java.lang.Math ;

public class amstrongNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = input.nextInt();
        double len = getlen(num);
        double sum = 0 ;
        while (num != 0) {
            double digit = num%10 ;
            num = num/10 ;
            sum = sum + (Math.pow(digit,len));
        }
        int ans = (int)sum ;
        if (ans == num) {
            System.out.println("This is amstrong number");
        }
        else{
            System.out.println(sum);
            System.out.println("Not amstring ");
        }
    }
    public static double getlen(int num){
        double len = 0 ;
        while (num != 0) {
            len++ ;
            num = num/10 ;
        }
        return len ;
    }
}
