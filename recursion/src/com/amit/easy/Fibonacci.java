package com.amit.easy;

class Fibonacci {
  public static void main(String[] args) {
    System.out.println(fib(6));
  }

  static int fib(int n) {
    if (n == 0 || n == 1) { // Base condition are the answers which are already provided to you.
      return n;
    }
    return fib(n - 1) + fib(n - 2); // This is called as the Recursive Relation, a formula which is called in recursively. 
  }
}