package Conditioners;
import java.util.Scanner;

public class findGreatestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println("Greatest no. is: " + a );
        } else if(b > a && b > c){
            System.out.println("Greatest no. is: " + b );
        }else{
            System.out.println("Greatest no. is: " + c );
        }
    }
}
