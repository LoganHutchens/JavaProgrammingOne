package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate meal cost, sales tax, tip, and overall price
 *
 * @author Logan Hutchens
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Enter the prices of the components of the meal
        System.out.print("Enter the price of the meal: ");
        double mealPrice = input.nextDouble();
        System.out.print("Enter the price of the drink: ");
        double drinkPrice = input.nextDouble();
        System.out.print("Enter the price of the dessert: ");
        double dessertPrice = input.nextDouble();
        //Compute price of total meal
        double totalmealPrice = (mealPrice + drinkPrice + dessertPrice);
        //Compute sales tax
        double salesTax = (totalmealPrice * 0.10);
        //Compute tip
        double mealTip = ((totalmealPrice + salesTax) * 0.15);
        //Compute overall price
        double overallPrice = (totalmealPrice + salesTax + mealTip);
        //State the prices
        System.out.println("The cost of the meal is " + totalmealPrice + ", the cost of the sales tax is " + salesTax + ", the cost of the tip is " + mealTip + ", and the overall price is " + overallPrice);

    }
}
