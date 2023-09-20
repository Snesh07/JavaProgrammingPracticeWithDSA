package NestedLoopsForPatterns;

import java.util.Scanner;

public class hollowNumericalPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row: ");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= (r - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                if( i == 1 || k == 1 || i == r || k == r ){
                    System.out.print(i);
                }else {
                    System.out.print(" ");
                }
            }
            for (int l = i-1 ; l >= 1 ; l--) {
                if( i == 1 || l == 1 || i == r || l == r ){
                    System.out.print(i);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
