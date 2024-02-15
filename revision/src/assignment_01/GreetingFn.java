// Take name as input and print a greeting message for that particular name as a function.

package assignment_01;

import java.util.Scanner;

public class GreetingFn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.next();

        System.out.println(greet(name));
    }

    static String greet(String name) {
        return "Good Morning, " + name;
    }
}