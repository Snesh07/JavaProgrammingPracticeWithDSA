package BasicsOfJava;
import java.util.Scanner;

public class squareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number for finding square of it: ");
        int num = sc.nextInt();

        int square = num*num;
        System.out.println("Square of " + num + " " + "is: " + square );

    }
}
