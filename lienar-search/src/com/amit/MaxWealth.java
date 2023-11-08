package com.amit;
// https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

         for (int person = 0; person < accounts.length; person++) {
            int person_sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                // rows -> person
                // cols -> account
                person_sum += accounts[person][account];
            }
            if (person_sum > ans) {
                ans = person_sum;
            }
        }
        return ans;
    }
}
