package Loops;
import java.util.Scanner;

public class countNumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Number: ");
        long num = sc.nextLong();
        long numOfDigit = 0;
        long n = num;

        while (n > 0){
            n = n / 10;
            numOfDigit++;
        }
        System.out.println("Number of digits in " + num + " = " + numOfDigit);
    }
}
