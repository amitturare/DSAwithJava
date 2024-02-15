// Question: #121, https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

package com.amit;

public class QBestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {2, 4, 1};

        int minValue = findMinValue(prices);
        int minValueIndex = searchElement(prices, minValue);


        System.out.println(minValue);
        System.out.println(minValueIndex);

        if (prices[minValueIndex] == prices[prices.length - 1]) {
            System.out.println(0);
        } else {
            int maxValue = findMaxValue(prices, minValueIndex);
            System.out.println(maxValue);
            System.out.println(maxValue - minValue);
        }
    }

    static int findMinValue (int[] arr) {
        int minValueIndex = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValueIndex) {
                minValueIndex = arr[i];
            }
        }
        return minValueIndex;
    }

    static int findMaxValue (int[] arr, int start) {
        int maxValueIndex = arr[start];

        for (int i = start; i < arr.length; i++) {
            if (arr[i] > maxValueIndex) {
                maxValueIndex = arr[i];
            }
        }
        return maxValueIndex;
    }

    static int searchElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
