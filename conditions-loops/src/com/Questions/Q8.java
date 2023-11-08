package com.Questions;

import java.util.Scanner;

public class Q8 { // Calculate Average Marks
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Marks of Math: ");
        float math = in.nextFloat();
        System.out.print("Marks of Physics: ");
        float phy = in.nextFloat();
        System.out.print("Marks of Chemistry: ");
        float chem = in.nextFloat();
        System.out.print("Marks of English: ");
        float eng = in.nextFloat();

        float avg = (math + phy + chem + eng)/100;

        System.out.println("Average score: " + avg);
    }
}
