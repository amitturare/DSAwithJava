/*
    Question
    Write down a Java code for SIP calculator in which there should be a registration fee for using the calculator
    which will be 150. On every year of investment 50 rupees to be added to the entire return on investment.
    For eg: if the investment period is 2 years then 50+50 to be added to the final amount.

    Variables:
    int amt
    int years
    int rate
    int calcFees
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int calcFees = 150;

        System.out.print("Enter the investing amount: ");
        float amt = in.nextFloat();
        System.out.print("Enter the rate: ");
        float rate = in.nextFloat();
        System.out.print("Enter the years for investment: ");
        float yrs = in.nextFloat();

        float calculatedAmt = calculateSIP(amt, yrs, rate, calcFees);
        System.out.println("Total amount after " + yrs + " years: Rs." + calculatedAmt);
    }

    static float calculateSIP(float amt, float yrs, float rate, int calcFees) {
        float totalAmt = 0;

        // To add up the interest over the years - SI
        for (int year = 1; year <= yrs ; year++) {
            double interest = (amt * rate * year) / 100;

            // For each year
            totalAmt += (amt + interest + 50);
        }

        totalAmt -= calcFees; // -150

        return totalAmt;
    }
}
