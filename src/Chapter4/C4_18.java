package Chapter4;

import java.util.Scanner;

/**
 * Program to get student major and status
 *
 * @author Logan Hutchens
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Getting the major and status
        System.out.print("Enter two characters: ");
        String text = input.next().toUpperCase();
        String output;
        //Comparing major value
        switch (text.charAt(0)) {
            case 'M':
                output = "Mathematics";
                break;
            case 'C':
                output = "Computer Science";
                break;
            case 'I':
                output = "Information Technology";
                break;
            default:
                output = "Invalid Input";
                break;
        }
        //Comparing status value
        if (output != "Invalid Input") {
            switch (text.charAt(1)) {
                case '1':
                    output += " Freshman";
                    break;
                case '2':
                    output += " Sophomore";
                    break;
                case '3':
                    output += " Junior";
                    break;
                case '4':
                    output += " Senior";
                    break;
                default:
                    output = "Invalid Input";
                    break;
            }
        }
        System.out.println(output);
    }
}
