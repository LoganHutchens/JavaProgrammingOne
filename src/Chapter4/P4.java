package Chapter4;

import java.util.Scanner;

/**
 * Program to compare two bidder's bids
 *
 * @author Logan Hutchens
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Get info about fisrt bidder
        System.out.println("What is the first bidder's name?");
        String bidder1 = input.next();
        System.out.println("How many hours of work does " + bidder1 + " need?");
        int hours1 = input.nextInt();
        System.out.println("How much does " + bidder1 + " charge per hour?");
        double rate1 = input.nextDouble();
        //Get info about second bidder
        System.out.println("What is the second bidder's name?");
        String bidder2 = input.next();
        System.out.println("How many hours of work does " + bidder2 + " need?");
        int hours2 = input.nextInt();
        System.out.println("How much does " + bidder2 + " charge per hour?");
        double rate2 = input.nextDouble();
        //Calculate hours times hourly rate
        double cost1 = (hours1 * rate1);
        double cost2 = (hours2 * rate2);
        //Comparing the two bidders
        if (cost1 < cost2) {
            System.out.printf("The winner is " + bidder1 + " with a cost of $%4.2f ", cost1);
        } else if (cost1 > cost2) {
            System.out.printf("The winner is " + bidder2 + " with a cost of $%4.2f ", cost2);
        } else if (cost1 == cost2) {
            if (hours1 < hours2) {
                System.out.printf("The winner is " + bidder1 + " with a cost of $%4.2f ", cost1);
                System.out.println("\n They require " + hours1 + " hours");
            } else if (hours1 > hours2) {
                System.out.printf("The winner is " + bidder2 + " with a cost of $%4.2f ", cost2);
                System.out.println("\n They require " + hours2 + " hours");
            } else if (hours1 == hours2) {
                System.out.println(bidder1 + " and " + bidder2 + " have identical bids");
                System.out.printf("The number of hours is " + hours1 + ", the cost per hour is $ " + rate1 + ", or $%4.2f ", rate1);
                System.out.printf("\n The total cost is $ " + cost1 + ", or $%4.2f ", cost1);
            }
        }
    }
}
