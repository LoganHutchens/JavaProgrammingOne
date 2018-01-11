package Chapter3;

import java.util.Scanner;



/**
 * Program to check whether a number is divisible by 5, 6, or both
 *
 * @author Logan Hutchens
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Getting the integer
        System.out.println("Enter an integer: ");
        double number = input.nextDouble();
        //Figuring out whether the integer is divisible by 5 or 6
        System.out.println("Is " + number + " divisible by 5 and 6?");
        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println("Is " + number + " divisible by 5 or 6?");
        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println("Is " + number + " divisible by 5, or 6, but not both?");
        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
