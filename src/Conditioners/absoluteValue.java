package Conditioners;

import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. to find Absolute value of it: ");
        int num = sc.nextInt();

        if(num < 0){
            num = num * (-1);
        }
        System.out.println("Absolute value is: " + num );
    }
}
