package Arrays;

import java.util.Scanner;

public class findUniqueElement {

    static int checkUniqueNumber(int[] arr){
        int num = -1;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] > 0){
                num = arr[i];
            }
        }
        return num;
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

        System.out.println("Unique No.: " + checkUniqueNumber(arr));
    }
}
