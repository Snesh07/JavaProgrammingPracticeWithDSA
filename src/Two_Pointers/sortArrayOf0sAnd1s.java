package Two_Pointers;

import java.util.Scanner;

public class sortArrayOf0sAnd1s {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZerosAndOnes(int[] arr){
         int n = arr.length;
         int count = 0;

//         count number of zeros
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 0){
                count++;
            }
        }
//        0 to count - 1 : 0 and count to n - 1: 1 =>
        for(int i = 0 ; i < n ; i++){
            if(i < count){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
        printArray(arr);
    }

    static void sortZerosAndOnesInPlace(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0){
                left++;
            }
            if (arr[right] == 1){
                right--;
            }
        }

        printArray(arr);
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
        sortZerosAndOnesInPlace(arr);



    }
}
