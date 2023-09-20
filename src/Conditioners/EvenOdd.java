package Conditioners;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no. to check Even or Odd: ");
        int num = sc.nextInt();
         if (num%2 == 0){
             System.out.println("No. is Even.");
         }else{
             System.out.println("No. is Odd.");
         }
    }

}
