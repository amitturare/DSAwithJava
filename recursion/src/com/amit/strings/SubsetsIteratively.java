package com.amit.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetsIteratively {
    public static void main(String[] args) {
        System.out.println(getSubs(new int[]{1, 2, 3}));
        System.out.println(getSubsDups(new int[]{1, 2, 2}));
    }

    static ArrayList<ArrayList<Integer>> getSubs(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num: arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    static ArrayList<ArrayList<Integer>> getSubsDups(int[] arr) {
        // Sort the array
        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        // Initially add an empty list
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // If current and previous element is same then move start to end + 1;
            // This will only work when i > 0, or else it will give index out of bound error
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            // Move the end to the last element of the outer ArrayList
            end = outer.size() - 1;

            int n = outer.size();
            for (int j = start; j < n; j++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
