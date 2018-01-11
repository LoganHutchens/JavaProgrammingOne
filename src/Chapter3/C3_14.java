package Chapter3;

import java.util.Scanner;

/**
 * Program to play heads or tails with 1 or 0
 *
 * @author Logan Hutchens
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Getting the guess
        System.out.println("Will it be 1 or 0?");
        double guess = input.nextDouble();
        //Randomizing number
        int answer = (int) (Math.random() * 2);
        //Comparing and output
        if (guess == answer) {
            System.out.println("Your guess was correct!");
        }
        if (guess != answer) {
            System.out.println("Your guess was incorrect.");
        }
    }
}
