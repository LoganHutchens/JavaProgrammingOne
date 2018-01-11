package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate tip and total
 *
 * @author Logan Hutchens
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Get subtotal and gratuity rate
        System.out.print("Enter a subtotal: ");
        double subtotal = input.nextDouble();
        System.out.print("Enter a gratuity rate: ");
        double gratuityRate = input.nextDouble();
        //Calculate gratuity and total
        double tip = ((gratuityRate / 100) * subtotal);
        double total = subtotal + tip;
        //Display output
        System.out.print("The gratuity is $" + tip + ", and the total is $" + total);
    }
}
