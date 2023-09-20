package Arrays;

public class findMaxElementOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 4, 6, 9, 42, 12, 7};
        int max = 0;

        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
