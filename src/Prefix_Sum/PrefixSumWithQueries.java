package Prefix_Sum;

import java.util.Scanner;

public class PrefixSumWithQueries {
    static void printArray(int[] arr){
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;

        for(int i = 1 ; i < n ; i++){
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Enter the elements of Array: ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] pref = makePrefixSumArray(arr);

        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.println("Enter range: ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = pref[r] - pref[l-1];
            System.out.println("Sum: " + ans);

        }
    }
}
