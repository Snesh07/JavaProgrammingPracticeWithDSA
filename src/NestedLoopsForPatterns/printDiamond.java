package NestedLoopsForPatterns;

import java.util.Scanner;

public class printDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row (odd no.): ");
        int r = sc.nextInt();

        for (int i = 1 ; i <= r ; i++ ){
            for ( int j = r-i ; j >= 1 ; j--){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= 2 * i - 1 ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = r-1 ; i >= 1 ; i-- ){
            for ( int j = r-i ; j >= 1 ; j--){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= 2 * i - 1 ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

//        By using one nested loop:

        int spaces = r / 2;
        int stars = 1;

        for (int i = 1 ; i <= r; i++ ) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= stars; k++ ){
                System.out.print("*");
            }
            System.out.println();
            if (i < (r + 1) / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }

    }
}
