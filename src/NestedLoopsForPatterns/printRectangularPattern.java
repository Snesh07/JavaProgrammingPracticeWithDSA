package NestedLoopsForPatterns;

import java.util.Scanner;

public class printRectangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height: ");
        int r = sc.nextInt();
        System.out.println("Enter the width: ");
        int c = sc.nextInt();

        for (int i = 1 ; i <= r ; i++){
            for (int j = 1 ; j <= c ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
