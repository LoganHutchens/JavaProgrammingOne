package Chapter3;

import java.util.Scanner;

/**
 * Program to compare two packages based on weight and price
 *
 * @author Logan Hutchens
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Get the weight and price of each bag
        System.out.println("Enter the weight and price for the first package: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.println("Enter the weight and price for the second package: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        //Comparing prices and output
        if (weight1 / price1 > weight2 / price2) {
            System.out.println("Package 1 has a better price");
        } else if (weight1 / price1 < weight2 / price2) {
            System.out.println("Package 2 has a better price");
        } else {
            System.out.println("The two packages have the same price");
        }
    }
}
