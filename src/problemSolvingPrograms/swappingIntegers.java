package problemSolvingPrograms;

import java.util.Scanner;

public class swappingIntegers {

    static void swap(int a, int b){
        System.out.println("Original values before swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b );

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Values after swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b );
    }

    static void swapWithoutTemp(int a, int b){
        System.out.println("Original values before swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b );

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values after swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b );
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        swapWithoutTemp(a, b);
    }
}
