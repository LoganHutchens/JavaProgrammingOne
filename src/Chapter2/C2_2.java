package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate the area and volume of a circle
 *
 * @author Logan Hutchens
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Get radius
        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter a length: ");
        double length = input.nextDouble();
        //Calculate area and volume
        double area = (radius * radius * Math.PI);
        double volume = (area * length);
        //Display output
        System.out.print("The area is " + area + ", and the volume is " + volume);
    }
}
