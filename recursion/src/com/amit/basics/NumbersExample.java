package com.amit.basics;

class NumbersExample {
  public static void main(String[] args) {
    // Write a recursive function which print from 1 to 5 by taking the values as input.
    print(1);
  }

  static void print(int n) {
    /*
    Base condition - helps to stop the recursive function whenever the condition is met.
    
    If there is no base condition, function calls will keep happening and stack will keep on getting filled.
    Later on the memory of the computer will exceed the limit and stack will overflow - causing an error.
    */
    if (n == 5) {
      System.out.println(n);
      return;
    }

    // Recursive call - calling a function again and again, can be treated as separate call in the stack.
    System.out.println(n);
    print(n + 1);
  }
  
  /*
  static void print(int n) {
    System.out.println(n);
    print1(2);
  }

  static void print1(int n) {
    System.out.println(n);
    print2(3);
  }

  static void print2(int n) {
    System.out.println(n);
    print3(4);
  }

  static void print3(int n) {
    System.out.println(n);
    print4(5);
  }

  static void print4(int n) {
    System.out.println(n);
  }
  */
}