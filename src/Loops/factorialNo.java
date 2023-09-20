package Loops;

import java.util.Scanner;

public class factorialNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for 'n' to print Factorial Series: ");
        int n = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= n ; i++){
            fact = fact * i;
            System.out.println("Factorial of " + i + " = " + fact);
         }
        }
    }





