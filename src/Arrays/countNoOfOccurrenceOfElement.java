package Arrays;

import java.util.Scanner;

public class countNoOfOccurrenceOfElement {

    static int countOccurrence(int[] arr, int x) {
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }

    static int lastOccurrence(int[] arr, int x){
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
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

        System.out.println("Enter any value to find its occurrence: ");
        int x = sc.nextInt();

        System.out.println("Occurrence: " + countOccurrence(arr, x));

        System.out.println("Last Occurrence on Index: " + lastOccurrence(arr, x));
    }
}
