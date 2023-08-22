package com.amit;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // A method that takes variable amount of arguments
        random(1, 2, 3, 4, 5, 6, 7, 8);

        multiple(2, 3, "Amit", "How"); // The arguments should be passed in order only as specified in the method

    }

    static void multiple(int a, int b, String ...v) {
        // The variableLengthArgs should always be passed last in the order.
    }

    static void random(int ...variableLengthArgs) { // Internally takes an array of integers
        System.out.println(Arrays.toString(variableLengthArgs)); // An array of numbers
    }
}
