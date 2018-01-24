package Chapter7;

import java.util.Scanner;

/**
 * Program to find the minimum of an array
 *
 * @author Logan Hutchens
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Entering numbers and filling array
        double[] myList = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
        }
        //Output
        System.out.println("The minimum number is " + min(myList));
    }

    /**
     * Main Method
     *
     * @param myList array
     * @return returns the minimum
     */
    //Finding the minimum
    public static double min(double[] myList) {
        double min = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] < min) {
                min = myList[i];
            }
        }
        return min;
    }
}
