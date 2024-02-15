package com.amit.stackUsingArr;

public class Main {
    public static void main(String[] args) {
        StackWArr s1 = new StackWArr(4);

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        s1.printS();

        System.out.println(s1.pop());

        s1.printS();

        System.out.println(s1.pop());

        s1.printS();

//        System.out.println(s1.getTop());

        s1.deleteStack();

        s1.printS();
    }
}