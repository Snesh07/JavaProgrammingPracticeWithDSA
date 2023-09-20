package BasicsOfJava;
import java.util.Scanner;

public class takingCharAsInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character for finding its ASCII value: ");
        char ch = sc.next().charAt(0);
        int x = ch;
        System.out.println("ASCII value of " + ch + " is: " + x);

    }
}
