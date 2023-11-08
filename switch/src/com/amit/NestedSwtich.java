package com.amit;

import java.util.Scanner;

public class NestedSwtich {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();

//        switch (empID) {
//            case 1:
//                System.out.println("Amit Turare");
//                break;
//            case 2:
//                System.out.println("Garen");
//                break;
//            case 3:
//                System.out.println("Emp Number 3");
//                switch (department) {
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("No department entered");
//                }
//                break;
//            default: {
//                System.out.println("Enter correct EmpID");
//            }
//        }

        // Better way to write
        switch (empID) {
            case 1 -> System.out.println("Amit Turare");
            case 2 -> System.out.println("Garen");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> {
                System.out.println("Enter correct EmpID");
            }
        }
    }
}
