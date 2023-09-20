package Arrays;

class ArraysExample {

    void multiArrays(){
        int[][] arr_1 = new int[5][3];
        int[][] arr = {{8, 3, 2}, {1, 5, 6}};
        int[][][] arr_3 = new int[5][3][3];
        arr_3[0][0][0] = 1;

        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println(arr[1][1]);
    }
    void demoArrays(){
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names = {"Tina", "Meena", "Jack"};

        ages[0] = 78;
        ages[1] = 28;
        ages[2] = 22;

        for ( int i = 0 ; i < names.length ; i++ ){
            System.out.println(names[i]);
        }

        for (int age : ages) {
            System.out.println("Using for each :" + age);
        }

        int i = 0;
        while (i < ages.length){
            System.out.println("using while loop :" + ages[i]);
            i++;
        }

        System.out.println(ages[0]);
        System.out.println(names.length);
    }
}

public class Main{
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        obj.demoArrays();
        obj.multiArrays();

    }

}
