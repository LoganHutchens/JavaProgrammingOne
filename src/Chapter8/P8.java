package Chapter8;

import java.util.Scanner;

/**
 * Program to tracking sales of employees
 *
 * @author Logan Hutchens
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String day = "Logan";
        String salesman = "Logan";
        String answer;
        char employee;
        double[][] sales = new double[4][5];
        //Asking for ID, day, and sale amount
        do {
            do {
                System.out.print("Enter the salesman ID as A, B, C, or D. ");
                salesman = input.next().toUpperCase();
            } while ((!(salesman.equals("A"))) && (!(salesman.equals("B"))) && (!(salesman.equals("C"))) && (!(salesman.equals("D"))));
            do {
                System.out.print("Enter the day as M, T, W, H, F. ");
                day = input.next().toUpperCase();
            } while ((!(day.equals("M"))) && (!(day.equals("T"))) && (!(day.equals("W"))) && (!(day.equals("H"))) && (!(day.equals("F"))));
            System.out.print("Enter the amount of the sale. ");
            double amount = input.nextDouble();
            //Sorting through array and adding amount
            switch (salesman) {
                case "A":
                    switch (day) {
                        case "M":
                            sales[0][0] += amount;
                            break;
                        case "T":
                            sales[0][1] += amount;
                            break;
                        case "W":
                            sales[0][2] += amount;
                            break;
                        case "H":
                            sales[0][3] += amount;
                            break;
                        case "F":
                            sales[0][4] += amount;
                            break;
                    }
                    break;
                case "B":
                    switch (day) {
                        case "M":
                            sales[1][0] += amount;
                            break;
                        case "T":
                            sales[1][1] += amount;
                            break;
                        case "W":
                            sales[1][2] += amount;
                            break;
                        case "H":
                            sales[1][3] += amount;
                            break;
                        case "F":
                            sales[1][4] += amount;
                            break;
                    }
                    break;
                case "C":
                    switch (day) {
                        case "M":
                            sales[2][0] += amount;
                            break;
                        case "T":
                            sales[2][1] += amount;
                            break;
                        case "W":
                            sales[2][2] += amount;
                            break;
                        case "H":
                            sales[2][3] += amount;
                            break;
                        case "F":
                            sales[2][4] += amount;
                            break;
                    }
                    break;
                case "D":
                    switch (day) {
                        case "M":
                            sales[3][0] += amount;
                            break;
                        case "T":
                            sales[3][1] += amount;
                            break;
                        case "W":
                            sales[3][2] += amount;
                            break;
                        case "H":
                            sales[3][3] += amount;
                            break;
                        case "F":
                            sales[3][4] += amount;
                            break;
                    }
                    break;
            }
            do {
                System.out.println("More data? Enter Y for yes or N for no.");
                answer = input.next().toUpperCase();
            } while (!(answer.equals("Y")) && (!(answer.equals("N"))));
        } while (answer.equals("Y"));
        System.out.print("Salesman  M  T  W  H  F  ");
        System.out.println();
        employee = 'A';
        for (int row = 0; row < sales.length; row++) {
            System.out.print(employee + " ");
            for (int column = 0; column < sales[row].length; column++) {
                System.out.print(sales[row][column] + " ");
            }
            System.out.println();
            employee++;
        }
    }
}
