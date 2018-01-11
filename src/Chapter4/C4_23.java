package Chapter4;

import java.util.Scanner;

/**
 * Program to display a payroll statement for an employee
 *
 * @author Logan Hutchens
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Getting all the info
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();
        //Calculate deductions and gross pay
        double grossPay = (payRate * hours);
        double federalWithholding = (grossPay * federalTax);
        double stateWithholding = (grossPay * stateTax);
        double deductions = (federalWithholding + stateWithholding);
        double netPay = (grossPay - deductions);
        //Output info
        System.out.printf("Employee name: %s", name);
        System.out.printf("\n Hours worked: %4.2f", hours);
        System.out.printf("\n Pay rate: $%4.2f", payRate);
        System.out.printf("\n Gross pay: $%4.2f", grossPay);
        System.out.println("\n Deductions: ");
        System.out.printf("\t Federal Withholding (%.2f%%): $%4.2f", (federalTax * 100), federalWithholding);
        System.out.printf("\n \t State Withholding (%.2f%%): $%4.2f", (stateTax * 100), stateWithholding);
        System.out.printf("\n \t Total Deductions: $%4.2f", deductions);
        System.out.printf("\n Net Pay $%4.2f ", netPay);
        System.out.println();
    }
}
