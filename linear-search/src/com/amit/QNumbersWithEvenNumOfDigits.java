// LeetCode: 1295

package com.amit;

public class QNumbersWithEvenNumOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        System.out.println(numWithEvenNumOfDigits(nums));
    }

    static int numWithEvenNumOfDigits(int[] arr) {
        int count = 0;
        for (int num: arr) {
            if (totalDigits(num) % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    static int totalDigits(int num) {
        int totalDigits = 0;
        if (num < 0) {
            num *= (-1);
        }
        if (num == 0) {
            return 1;
        }
        while (num > 0) {
            totalDigits++;
            num /= 10;
        }

        return totalDigits;
    }
}
