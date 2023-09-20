package Conditioners;
import java.util.Scanner;

public class CheckSidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three sides: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ( a < b + c && b < a + c && c < a + b ){
            System.out.println("Valid triangle.");
        }else {
            System.out.println("Invalid triangle.");
        }
    }
}
