package com.Questions;

import java.util.Scanner;

public class Q6 { // Calculate CGPA Java Program
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

        float percentage = ((math + phy + chem + eng) / 400) * 100;
        float cgpa = percentage/9.5f;

        System.out.println("Your CGPA: " + cgpa);
    }
}
