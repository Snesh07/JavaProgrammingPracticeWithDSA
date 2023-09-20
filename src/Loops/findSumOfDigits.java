package Loops;
import java.util.Scanner;

public class findSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any digit: ");
        int num = sc.nextInt();
        int sumOfDigit = 0;
        int n = num;

        while(n > 0){
            sumOfDigit += n % 10;
            n = n / 10;
        }

        System.out.println("Sum of digits of " + num + " = " + sumOfDigit);

    }
}
