// Question: #66, https://leetcode.com/problems/plus-one

package com.amit;

import java.util.Arrays;

public class QPlusOne {
    public static void main(String[] args) {
        int[] numArr = {9,8,7,6,5,4,3,2,1,0};
        long num = arrToNum(numArr);
        System.out.println(num);
        num++;
        System.out.println(getTotalDigits(num));
        System.out.println(Arrays.toString(numToArr(num, numArr.length)));


    }

    static long arrToNum(int[] arr) {
        long result = 0;
        for (int digit : arr) {
            result = result * 10 + digit;
        }
        return result;
    }

    static int[] numToArr(long num, int totalDigits) {
        int[] result = new int[totalDigits];
        for (int i = totalDigits - 1; i >= 0; i--) {
            long digit = num % 10;
            result[i] = (int) digit;
            num /= 10;
        }
        return result;
    }

    static int getTotalDigits(long num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
