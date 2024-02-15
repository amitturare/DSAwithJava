package com.amit.basics;

class Message {
  public static void main(String[] args) {
    // Print "Hello All" 5 times with recursion
    message();
  }

  static void message() {
    System.out.println("Hello All!");
    message1();
  }

  static void message1() {
    System.out.println("Hello All!");
    message2();
  }

  static void message2() {
    System.out.println("Hello All!");
    message3();
  }

  static void message3() {
    System.out.println("Hello All!");
    message4();
  }

  static void message4() {
    System.out.println("Hello All!");
  }
}