package com.amit;

import java.util.Arrays;
import java.util.Scanner;

public class EX {
    public static void main(String[] args) {
        int[][] images = {{1,1,0},{1,0,1},{0,0,0}};
        for (int i = 0; i <= images.length - 1; i ++) {
            int[] flipped = Hflip(images[i]);
            int[] inverted = invert(flipped);

            images[i] = inverted;
        }
        for (int[] image: images) {
            System.out.println(Arrays.toString(image));
        }

    }

    static int[] Hflip(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        return arr;
    }

    static int[] invert(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        return arr;
    }
}

