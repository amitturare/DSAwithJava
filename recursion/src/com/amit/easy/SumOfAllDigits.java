package com.amit.easy;

class SumOfAllDigits {
  public static void main(String[] args) {
    System.out.println(sum(1342));
  }

  static int sum(int n) {
    if (n == 0) {
      return n;
    }

    int digit = n % 10;
    return digit + sum(n / 10);
  }
}