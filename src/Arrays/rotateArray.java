package Arrays;

import java.util.Scanner;

public class rotateArray {

    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k ; i < n ; i++ ){
            ans[j++] = arr[i];
        }

        for (int i = 0 ; i < n - k ; i++ ){
            ans[j++] = arr[i];
        }
        return ans;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        int[] ans = rotate(arr, k);
        System.out.println("Array after rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i]);
        }
    }
}
