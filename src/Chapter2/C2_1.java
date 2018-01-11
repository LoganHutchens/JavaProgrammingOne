package Chapter2;

import java.util.Scanner;

/**
 * Program to convert Celsius to Fahrenheit
 *
 * @author Logan Hutchens
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Get Celsius degree
        System.out.print("Enter a degree in Celsius: ");
        double celsiusDegree = input.nextDouble();
        //Calculate Fahrenheit
        double fahrenheitDegree = ((9.0 / 5.0) * celsiusDegree + 32);
        //Display output
        System.out.print(celsiusDegree + "Celsius is " + fahrenheitDegree + " Fahrenheit");
    }
}
