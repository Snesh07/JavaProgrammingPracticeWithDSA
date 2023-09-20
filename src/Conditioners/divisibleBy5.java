package Conditioners;

import java.util.Scanner;

public class divisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any no. to check it is Divisible by 5 or not: ");
        int num = sc.nextInt();

        if (num%5 == 0){
            System.out.println("Entered no. " + num + " is divisible by 5.");
        }else{
            System.out.println("Entered no. " + num + " is not divisible by 5.");
        }
    }
}
