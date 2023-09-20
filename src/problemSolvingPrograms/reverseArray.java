package problemSolvingPrograms;

import java.util.Scanner;

public class reverseArray {

    static void reverseArr(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        for(int i = n-1 ; i >=0 ; i--){
            ans[j++] = arr[i];
        }

        System.out.println("Reversed Array: ");
        for (int i = 0 ; i < n ; i++){
            System.out.print(ans[i] + " ");
        }
    }

    static void swapInArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseArrInPlace(int[] arr){
        int i = 0;
        int j = arr.length - 1;

    while(i < j){
        swapInArray(arr, i, j);
        i++;
        j--;
    }

        for ( i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }

    }

//    for rotate an array by k
    static void reverse(int[] arr, int i, int j){
        while (i < j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
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

        rotateInPlace(arr, k);

        System.out.println("Array after rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
