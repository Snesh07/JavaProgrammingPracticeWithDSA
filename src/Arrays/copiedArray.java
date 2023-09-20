package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class copiedArray {
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
            // Print Array 1
            for (int i = 0; i < n ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            // Try to copy Array_2 :
//            int[] arr_2 = arr.clone(); // Deep copy using .clone();
//        int[] arr_2 = Arrays.copyOf(arr, arr.length); // Deep copy using Array.copyOf();
//        int[] arr_2 = Arrays.copyOfRange(arr, 0, arr.length ); // Deep copy using .clone();
        int[] arr_2 = arr;
            System.out.print("Copied Array: ");
            for (int i = 0; i < n ; i++){
                System.out.print(arr_2[i] + " ");
            }
            System.out.println();

            arr_2[0] = 0;
            arr_2[1] = 0;

        System.out.print("Copied array after change: ");
            for (int i = 0; i < n ; i++){
                System.out.print(arr_2[i] + " ");
            }
        System.out.println();

        System.out.print("Original array after change in copied array cause of reference address (Shallow copy): ");
        for (int i = 0; i < n ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
