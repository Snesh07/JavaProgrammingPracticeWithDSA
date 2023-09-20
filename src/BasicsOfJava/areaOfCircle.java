package BasicsOfJava;
import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int r = sc.nextInt();
        double area = 3.14 * r * r;
        System.out.println("Area of the circle for radius " + r + " is: " + area);
    }
}
