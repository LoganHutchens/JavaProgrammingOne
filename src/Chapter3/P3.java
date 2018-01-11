package Chapter3;

import java.util.Scanner;

/**
 * Program to compare two numbers with different requirements
 *
 * @author Logan Hutchens
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Getting the two variables
        System.out.print("Enter the first number: ");
        double numberOne = input.nextDouble();
        System.out.print("Enter the second number: ");
        double numberTwo = input.nextDouble();
        //Comparing the two numbers
        if (numberOne < numberTwo) {
            System.out.println("The first number is less than the second");
        }
        if (numberOne > numberTwo) {
            System.out.println("The first number is greater than the second");
        }
        if (numberOne == numberTwo) {
            System.out.println("The first number is equal to the second");
        }
        if (numberOne <= numberTwo) {
            System.out.println("The first number is less than or equal to the second");
        }
        if (numberOne != numberTwo) {
            System.out.println("The first number is not equal to the second");
        }
        //Comparing second number to zero and figuring out the fraction
        if (numberTwo == 0) {
            System.out.println("Cannot divide by zero");
        }
        if (numberOne / numberTwo < 1.0) {
            System.out.println("Proper fraction");
        }
        if (numberOne / numberTwo >= 1.0) {
            System.out.println("Improper fraction");
        }
        //Comparing first number to 90, 80, 70, and 60
        if (numberOne >= 90.0) {
            System.out.println("A");
        } else if (numberOne >= 80.0) {
            System.out.println("B");
        } else if (numberOne >= 70.0) {
            System.out.println("C");
        } else if (numberOne >= 60.0) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        //Seeing if the second number is in range
        if (numberTwo >= 1.0 && numberTwo <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
