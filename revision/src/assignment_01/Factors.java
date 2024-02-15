// Input a number and print all the factors of that number (use loops).

package assignment_01;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.println("Factors of " + num + " are: ");
        getFactors(num);
    }

    static void getFactors(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
