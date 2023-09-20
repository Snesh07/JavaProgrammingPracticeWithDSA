package NestedLoopsForPatterns;

import java.util.Scanner;

public class printTiltRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = scanner.nextInt();

        for (int i = 1 ; i <= r ; i++ ){
            for (int j = r-i ; j >= 1 ; j-- ){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= r ; j++ ){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
