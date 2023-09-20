package Conditioners;
import java.util.Scanner;

public class compareAreaPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of a Rectangle: ");
        int l = sc.nextInt();

        System.out.println("Enter Breadth of a Rectangle: ");
        int b = sc.nextInt();

        int perimeter = 2 * (l + b);
        int area = l * b;

        if(perimeter > area){
            System.out.println("Perimeter: " + perimeter + " is greater than the Area: " + area + " of the Rectangle");
        }else {
            System.out.println("Area: " + area + " is greater than the Perimeter: " + perimeter + " of the Rectangle");
        }
    }
}
