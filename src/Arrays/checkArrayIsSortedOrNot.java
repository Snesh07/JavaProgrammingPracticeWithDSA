package Arrays;

import java.util.Scanner;

public class checkArrayIsSortedOrNot {

    static boolean isSorted(int[] arr){
        boolean ans = true;

        for (int i = 1 ; i < arr.length ; i++){
            if( arr[i] < arr[i - 1]){
                ans = false;
                break;
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
        for(int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Is sorted: " + isSorted(arr));
    }
}
