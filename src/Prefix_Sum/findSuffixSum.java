package Prefix_Sum;

import java.util.Scanner;

public class findSuffixSum {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] suffixSumArray(int[] arr){
        int n = arr.length;

        for(int i = n-2 ; i >= 0  ; i--){
            arr[i] = arr[i + 1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: ");
        printArray(arr);
        System.out.println("Suffix Sum Array: ");
        int[] suffixSum = suffixSumArray(arr);
        printArray(suffixSum);

    }
}
