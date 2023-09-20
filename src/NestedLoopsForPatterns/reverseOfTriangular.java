package NestedLoopsForPatterns;

import java.util.Scanner;

public class reverseOfTriangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row: ");
        int r = sc.nextInt();


        for (int i = r ; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

//       or we can use this method also:-

//        for (int i = 1; i <= r ; i++){
//            for ( int j = 1 ; j <= ( (r + 1) - i) ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
