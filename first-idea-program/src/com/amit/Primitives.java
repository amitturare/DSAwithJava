package com.amit;

public class Primitives {
    public static void main(String[] args) {
        // Primitive data types
        int simpleInteger = 69; // Can store 4 bytes of numbers
        char letter = 'S'; // Starts with single quotes
        float smallDecimalNumbers = 69.69f; // Can store 4 bytes of numbers, values are not fully accurate here, it rounds it off
        double largeDecimalNumbers = 12312.12312312123; // Can store 8 bytes of numbers
        long largeIntegerValues = 123123123123123L; // Can store 8 bytes of numbers
        boolean flag = true; // or false;

        /*
        69.69f, specifies it is not a double
        123123123123123L, specifies this is not a normal integer
         */

        // Integer class is also available to store integers
        /* It is a wrapper class, which provides
        additional functionalities to the primitives */
        Integer someInteger = 69;


        // String is not primitive
        /* Primitive is any data type that you can
        not break into any further data type */
        String name = "Amit";
    }
}
