package com.Questions;

public class Q15 { // Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
    public static void main(String[] args) {

        int days_in_a = 30;
        int count = 0;

        for (int i = 1; i <= days_in_a ; i++) {
            if (i % 2 == 0) {
                count += 1;
            }
        }
        System.out.println("Number of even days in August: " + count);
    }
}
