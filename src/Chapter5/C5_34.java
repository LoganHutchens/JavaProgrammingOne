package Chapter5;

import java.util.Scanner;

/**
 * Program to play rock, paper, or scissors
 *
 * @author Logan Hutchens
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declaring variables
        int playerWins = 0;
        int computerWins = 0;
        //Choosing rock, paper, or scissors, and counting wins
        while ((playerWins <= 2) && (computerWins <= 2)) {
            int com = (int) (Math.random() * 3);
            System.out.println("Choose scissors, rock, or paper.");
            System.out.print("Scissors (0), Rock (1), Paper (2): ");
            int human = input.nextInt();
            //If player chooses scissors
            if (human == 0) {
                switch (com) {
                    case 0:
                        System.out.println("The computer is scissors. You are scissors. It is a tie.");
                        break;
                    case 1:
                        System.out.println("The computer is rock. You are scissors. You lost.");
                        computerWins++;
                        break;
                    case 2:
                        System.out.println("The computer is paper. You are scissors. You won.");
                        playerWins++;
                        break;
                }
            }
            //If player chooses rock
            if (human == 1) {
                switch (com) {
                    case 0:
                        System.out.println("The computer is scissors. You are rock. You won.");
                        playerWins++;
                        break;
                    case 1:
                        System.out.println("The computer is rock. You are rock. It is a tie.");
                        break;
                    case 2:
                        System.out.println("The computer is paper. You are rock. You lost.");

                        computerWins++;
                        break;
                }
            }
            //If player chooses paper
            if (human == 2) {
                switch (com) {
                    case 0:
                        System.out.println("The computer is scissors. You are paper. You lost.");
                        computerWins++;
                        break;
                    case 1:
                        System.out.println("The computer is rock. You are paper. You won");
                        playerWins++;
                        break;
                    case 2:
                        System.out.println("The computer is paper. You are paper. It is a tie.");
                        break;
                }
            }
        }
        if (playerWins > 2) {
            System.out.println("You won more than two times");
        }
        if (computerWins > 2) {
            System.out.println("The computer won more than two times");
        }
    }
}
