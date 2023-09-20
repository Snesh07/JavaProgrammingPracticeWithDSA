package Conditioners;
import java.util.Scanner;

public class threePointsOnLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter the value of y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter the value of x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter the value of y2: ");
        int y2 = sc.nextInt();
        System.out.println("Enter the value of x3: ");
        int x3 = sc.nextInt();
        System.out.println("Enter the value of y3: ");
        int y3 = sc.nextInt();

        if ((y2 - y1)/(x2 - x1) == (y3 - y2)/(x3 - x2)){
            System.out.println("Points lies on a straight line");
        }else {
            System.out.println("Points doesn't lie on a straight line");
        }
    }
}
