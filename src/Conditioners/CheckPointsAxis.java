package Conditioners;
import java.util.Scanner;

public class CheckPointsAxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y: ");
        int y = sc.nextInt();

        if( x == 0 & y == 0){
            System.out.println("Points lies at the origin");
        } else if ( x == 0 && y != 0 ) {
            System.out.println("Points lies on y-axis");
        }else if ( x != 0 && y == 0 ){
            System.out.println("Points lies on x-axis");
        }else {
            System.out.println("Points does not lie on the x-axis, y-axis or origin ");
        }
    }
}
