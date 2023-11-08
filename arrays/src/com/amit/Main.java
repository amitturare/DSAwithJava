package com.amit;

public class Main {

    public static void main(String[] args) {
        // Q: Store a roll number
        int a = 18;

        // Q: Store a person's name
        String name = "Amit Turare";

        // Q: Store 5 roll numbers
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;

        /*
            Syntax for array:
                datatype[] variable_name = new datatype[size];
        */
//        int[] rnos = new int[5];
        // OR (Directly)
//        int[] rnos2 = {1, 2, 3, 4, 18};

        int[] ros; // Declaration of array, ros is getting defined in the STACK memory.
        ros = new int[5]; // Initialisation: actually here object is being created in the HEAP memory.
//        System.out.println(ros[1]);

        String[] arr  = new String[4];
        System.out.println(arr[0]);
    }
}
