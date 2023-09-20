package NestedLoopsForPatterns;

import java.util.Scanner;

public class PrintButterfly {
         public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int r = scanner.nextInt();

            for (int i = 1 ; i <= r ; i++ ){
                for (int j = 1 ; j <= i ; j++ ){
                    System.out.print("*");
                }
                for (int j = i ; j < 2 * r - i ; j++ ){
                    System.out.print(" ");
                }
                for (int j = i ; j >= 1 ; j-- ){
                    System.out.print("*");
                }
                System.out.println();
            }
             for (int i = r ; i >= 1 ; i-- ){
                 for (int j = 1 ; j <= i ; j++ ){
                     System.out.print("*");
                 }
                 for (int j = i ; j < 2 * r - i ; j++ ){
                     System.out.print(" ");
                 }
                 for (int j = i ; j >= 1 ; j-- ){
                     System.out.print("*");
                 }
                 System.out.println();
             }


        }
    }



