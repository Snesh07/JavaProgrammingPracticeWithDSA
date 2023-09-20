package Conditioners;

import java.util.Scanner;

public class nestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age of Ram: ");
        int ram = sc.nextInt();
        System.out.println("Enter the age of Shyam: " );
        int shyam = sc.nextInt();
        System.out.println("Enter the age of Ajay: ");
        int ajay = sc.nextInt();

        if(ram < shyam){
            if(ram < ajay){
                System.out.println("Ram is youngest.");
            }else{
                System.out.println("Ajay is youngest");
            }
        }else if (shyam < ram ){
            if (shyam < ajay){
                System.out.println("Shyam is youngest.");
            }else{
                System.out.println("Ajay is youngest.");
            }
        }
    }
}
