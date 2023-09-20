package Conditioners;

import java.util.Scanner;

public class findLossProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost price: ");
        long cost = sc.nextLong();

        System.out.println("Enter the selling price: ");
        long sell = sc.nextLong();

        if(cost < sell){
            long profit = sell - cost;
            System.out.println("You made a profit of " + profit + " Rs.");

        }else if(sell < cost){
            long loss = cost - sell;
            System.out.println("You incurred a loss of " + loss + " Rs.");
        }else {
            System.out.println("You made no profit and no loss.");
        }
    }
}
