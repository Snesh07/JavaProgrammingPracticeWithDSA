package Arrays;

import java.util.Scanner;



public class searchElementInArray {

    static void printArray(int[] arr){
        for (int i = 0 ; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {1, 15, 18, 16, 12, 7, 2, 8, 5, 10};
        System.out.println("Enter any number from 1 to 20");
        int num = sc.nextInt();
        int ans = -1;

//        // Linear Search

        for(int i = 0; i < arr1.length; i++){
            if (num == arr1[i]){
                ans = i;
                break;
            }
        }
        System.out.println(num + " is founded at index: " + ans);
        System.out.println("Array is: ");
        printArray(arr1);
    }
}
