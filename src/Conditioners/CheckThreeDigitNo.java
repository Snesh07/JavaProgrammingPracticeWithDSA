package Conditioners;
import java.util.Scanner;

public class CheckThreeDigitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any no.: ");
        int num = sc.nextInt();

        if( num > 99 && num < 1000){
            System.out.println("Entered no. is a three digit no.");
        }else{
            System.out.println("Entered no. is not a three digit no.");
        }
    }
}
