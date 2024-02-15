package com.amit.easy;

class ReverseANumber {
  public static void main(String[] args) {
    // System.out.println(reverse(1842));

    // reverse2(1234);
    // System.out.println(sum);

    // System.out.println(checkPalin(1234321));
    System.out.println(reverse(1234));
  }

  // static int reverse1(int n) {
  //   if (n % 10 == n) {
  //     return n;
  //   }
    
  //   System.out.print(n % 10);
  //   return reverse(n/10);
  // }

  // static int sum = 0;
  // static void reverse2(int n) {
  //   if (n == 0) {
  //     return;
  //   }

  //   int rem = n % 10;
  //   sum = sum * 10 + rem;
  //   reverse2(n / 10);
  // }

  static int reverse(int n) {
    int digits = (int)(Math.log10(n));
    return helper(n, digits);
  }
  static int helper(int n, int digits) {
    if (n % 10 == n) {
      return n;
    }
    int rem = n % 10;
    return rem * (int)(Math.pow(10, digits)) + helper(n/10, digits - 1);
  }

  static boolean checkPalin(int n) {
    return n == reverse(n);
  }
}