package com.amit.stackUsingLL;

public class Main {
    public static void main(String[] args) {
        StackWLL s1 = new StackWLL();

        s1.push(1);
        s1.push(2);
        s1.push(3);

        s1.printS();

        System.out.println(s1.pop());

        s1.printS();

        System.out.println(s1.pop());

        s1.printS();

        System.out.println(s1.getTopVal());

        s1.deleteStack();

        System.out.println(s1.getTopVal());

    }
}