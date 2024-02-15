package com.amit.patterns;

public class Triangle {
    public static void main(String[] args) {
        invertedIriangle(4, 0);
        normalTriangle(4, 0);
    }

    static void normalTriangle(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            normalTriangle(row, col + 1);
            System.out.print("*");
        }
        if (row == col) {
            normalTriangle(row - 1, 0);
            System.out.println();
        }
    }

    static void invertedIriangle(int row, int col) { // Similar to Bubble Sort
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
            invertedIriangle(row, col + 1);
        }
        if (row == col) {
            System.out.println();
            invertedIriangle(row - 1, 0);
        }
    }
}
