// Take integer inputs till the user enters 0 and print the sum of all numbers.

package assignment_01;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your numbers: ");
        boolean isInputValueNotZero = true;

        int sum = 0;
        while (isInputValueNotZero) {
            int num = in.nextInt();

            if (num == 0) {
                isInputValueNotZero = false;
            }

            sum += num;
        }

        System.out.println("Sum of all numbers = " + sum);
    }
}
