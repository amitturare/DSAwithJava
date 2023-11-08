package com.amit;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 6, 2, 7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums) {
            if (even(num)) {
                count ++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num) {
        int number_of_digits = digits2(num);
        /*
        if (number_of_digits % 2 == 0) {
            return true;
        }
        return false;
         */
        return number_of_digits % 2 == 0;
    }

    // To count the number of digits
    static int digits(int num) {
        // If input is a negative number, make it positive
        if (num < 0) {
            num *= (-1);
        }
        // If input is 0, return count as 1
        if (num ==0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count ++;
            num /= 10;
        }
        return count;
    }

    static int digits2(int num) {
        return (int)(Math.log10(num)) + 1;
    }

}
