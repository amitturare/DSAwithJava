package com.amit;

public class Scope {
    public static void main(String[] args) {
        // Scope means where we can access our variables

        int a = 10;
        int b = 20;

//        System.out.println(num); // Gives an error

        {
//            int a = 78; // Gives an error, since it is initialized already outside the block. It can only be modified.
            a = 100; // Reassign the original ref variable to some other value
            int c = 99;
            // Values initialized in the block will remain in the block
        }
        int c = 0; // This can be initialized outside the box, because it has only block scope
//        System.out.println("a = " + a); // a = 100
//        System.out.println(c); // Gives an error, it cannot be used outside the block

        // Scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 10;
            // The i and num can not be used outside of this for loop

//            int a = 100; // Gives an error, since it is initialized already outside the block. It can only be modified.
        }
        int i = 100; // This can be initialized outside the box, because it has only block scope
    }

    static void random() {
//        System.out.println(a); // Gives an error, it can not be accessed here
        int num = 67; // This can not be accessed outside of this function
    }
}
