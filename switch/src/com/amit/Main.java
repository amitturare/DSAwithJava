package com.amit;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit = in.next();

//        if (fruit.equals("mango")) {
//            System.out.println("King");
//        } if (fruit.equals("apple")) {
//            System.out.println("Sweet red fruit");
//        }

        /*
            Syntax of switch statement
            switch(expression) {
                // Cases
                case one:
                    // do something
                    break; // To terminate the sequence, if not provided all the below bodies of the cases will be executed
                case two:
                    // do something
                    break;
                default:
                    // do something
            }
        */
//        switch (fruit) {
//            case "mango":
//                System.out.println("King");
//                break;
//            case "apple":
//                System.out.println("Sweet red fruit");
//                break;
//            case "orange":
//                System.out.println("Round fruit");
//                break;
//            case "grapes":
//                System.out.println("Small fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit");
//        }

        // Enhanced switch, break condition is not required
        switch (fruit) {
            case "mango" -> System.out.println("King");
            case "apple" -> System.out.println("Sweet red fruit");
            case "orange" -> System.out.println("Round fruit");
            case "grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }

        int day = in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Out of week number");
//        }

//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//                // Here if we put 3, it will keep on executing till it finds a break condition that is on the 5th day (Weekday)
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }

        // With enhanced one,
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
     }
}