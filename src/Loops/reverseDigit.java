package Loops;
import java.util.Scanner;

public class reverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int n = num;
        int ans = 0;

        while( n > 0 ){
            ans = (ans * 10) + n % 10;
            n = n/10;
        }
        System.out.println("Reverse of " + num + " = " + ans );


    }
}
