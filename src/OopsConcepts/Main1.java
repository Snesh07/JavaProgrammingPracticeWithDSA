package OopsConcepts;

import java.util.Scanner;

class Algebra {

    int add(int a, int b){
        int ans = a + b;
        return ans;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Algebra obj = new Algebra();

        System.out.println("Enter the value of a: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int y = sc.nextInt();

        System.out.println("Sum of two no. is: " + obj.add( x, y ));

    }
}
