package com.amit;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int id = in.nextInt();
        String department = in.next();

//        switch (id) {
//            case 1:
//                System.out.println("ID 1");
//                break;
//            case 2:
//                System.out.println("ID 2");
//                break;
//            case 3:
//                System.out.println("ID 3");
//                switch (department) {
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("No department entered.");
//                }
//                break;
//            default:
//                System.out.println("Enter correct ID.");
//        }

        // Enhanced version
        switch (id) {
            case 1 -> System.out.println("ID 1");
            case 2 -> System.out.println("ID 2");
            case 3 -> {
                System.out.println("ID 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered.");
                }
            }
            default -> System.out.println("Enter correct ID.");
        }
    }
}
