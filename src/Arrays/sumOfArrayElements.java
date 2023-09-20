package Arrays;

public class sumOfArrayElements {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 78, 42, 156, 20};
        int sum = 0;

        for (int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
