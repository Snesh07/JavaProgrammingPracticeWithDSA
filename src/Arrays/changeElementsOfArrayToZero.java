package Arrays;

import java.util.Scanner;

public class changeElementsOfArrayToZero {


    static void printArray(int[] arr){
        for (int i = 0 ; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void arrayChanger(int[] arr){
        for(int i = 0; i < arr.length ; i++){
            arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // taking Input
        System.out.println("Enter the elements of Array: ");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        arrayChanger(arr);


    }
}
