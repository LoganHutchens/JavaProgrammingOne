package Chapter5;

import java.util.Scanner;

/**
 * Program to count votes
 *
 * @author Logan Hutchens
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yesVotes = 0;
        int noVotes = 0;
        int invalidVotes = 0;
        String answer = "";
        do {
            System.out.print("Enter Y to vote yes, N to vote no, or Q to quit voting: ");
            answer = input.next().toUpperCase();
            switch (answer) {
                case "Y":
                    yesVotes++;
                    break;
                case "N":
                    noVotes++;
                    break;
                case "Q":
                    break;
                default:
                    invalidVotes++;
                    System.out.println("INVALID CODE: ");
                    break;
            }
        } while (!("q".equalsIgnoreCase(answer)));
        System.out.println("Yes votes: " + yesVotes);
        System.out.println("No votes: " + noVotes);
        System.out.println("Invalid votes: " + invalidVotes);
        System.out.println("Total votes: " + (yesVotes + noVotes + invalidVotes));
    }
}
