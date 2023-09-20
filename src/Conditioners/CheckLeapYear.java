package Conditioners;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Year to check it's a Leap Year or not: ");

        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println( year + " is a Leap Year.");
        }else{
            System.out.println( year + " is not a Leap Year.");
        }
    }
}
