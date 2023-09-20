package Two_Pointers;

import java.util.Scanner;

public class returnSortedSquaresArrayOfNumbers {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
    }

    static int[] sortSquare(int[] arr){
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = 0;

        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
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

        System.out.println("Original Array: ");
        printArray(arr);
        System.out.println("Sorted Array: ");
        int[] ans = sortSquare(arr);
        reverseArrInPlace(ans);
        printArray(ans);
    }
}
