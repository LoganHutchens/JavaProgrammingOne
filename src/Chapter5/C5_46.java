package Chapter5;

import java.util.Scanner;

/**
 * Program to reverse a string
 *
 * @author Logan Hutchens
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Getting string and outputting reverse
        System.out.print("Enter a string: ");
        String statement = input.nextLine();
        System.out.print(new StringBuilder(statement).reverse().toString());
    }
}
