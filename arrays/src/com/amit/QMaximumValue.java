package com.amit;

public class QMaximumValue {
    public static void main(String[] args) {
        int[] arr = {12, 18, 11, 22, 10};

        System.out.println(largestInRage(arr, 0, 1));
    }

    static int largestInRage(int[] arr, int start, int end) {
        int largest = -1;
        for (int i = start; i <= end ; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    static int largestNum(int[] arr) {
        int largest = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                largest = arr[i];
//            }
//        }

        // With enhanced for loop,
        for (int num: arr) {
            if (num > largest) {
                largest = num;
            }
        }

        return largest;
    }
}
