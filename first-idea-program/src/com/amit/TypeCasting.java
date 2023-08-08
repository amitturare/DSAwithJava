package com.amit;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Conversion of one type to another automatically
        float num = input.nextFloat();
        System.out.println(num);
        /*
        Inputting integer here will result a float
        For example, input = 18, output = 18.0

        Conditions for this to happen,
        1. The two types must be compatible.
        2. Destination type should be greater than source type
           Here, float > integer
           int num = input.nextFloat(); This will give an error,
           int value can not handle float because int < float.
         */

        // Type Casting: Converting a bigger number into smaller type explicitly
        // To convert a float to integer,
        int num1 = (int)(67.56f);
        System.out.println(num1); // Outputs the integer value, 67

        // Automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a);
//        System.out.println(b); // Outputs: 1
        /*
            Maximum value it can hold is 256,
            it takes the remainder of given value a and maximum value,
            which results into 1. In Simple words a % 256 = 1
        */

        byte n1 = 40;
        byte n2 = 50;
        int c = n1 * n2;
        /*
         'c' is 2000, but then Java automatically
          stores the intermediary part and works it off as an integer
          float > integer > byte
        */
        System.out.println(c); // Outputs: 20

        int number = 'A'; // Assigning character to an int
        System.out.println(number); // Outputs: 65, ascii value of 'A'

        /*
         Rules for type promotion
         1. All byte, short, char values are promoted to int
         2. If any one of the operand of the expression is long,
            the whole operation will be promoted to long.
            Same for float and double.

         Example,
        */
        byte sb = 42;
        char sc = 'a';
        short ss = 1024;
        int si = 50000;
        float sf = 5.67f;
        double sd = 0.1234;
        double result = (sf * sb) + (si / sc) - (sd - ss);

        System.out.println((sf * sb) + " " + (si / sc) + " " + (sd - ss));
        // From the above expression float + integer - double
        System.out.println(result); // Results a double because it is dominant
    }
}
