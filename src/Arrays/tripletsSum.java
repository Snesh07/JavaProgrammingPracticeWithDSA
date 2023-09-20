package Arrays;

import java.util.Scanner;

public class tripletsSum {

    static int tripletSum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;

        for(int i = 0 ; i < n ; i++){
            for (int j = i + 1 ; j < n ; j++){
                for (int k = j + 1 ; k < n ; k++){
                    if (arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
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

        System.out.println("Enter target sum: ");
        int target = sc.nextInt();

        System.out.println("Target triplets: " + tripletSum(arr, target));
    }
}
