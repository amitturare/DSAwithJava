package com.amit.stackUsingLL;

public class StackWLL {
    CustomLL list;
    int size;

    StackWLL() { list = new CustomLL(); }

    void printS() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        list.printLL();
    }

    boolean isEmpty() { return list.head == null; }

    void push(int val) { list.insertHead(val); }

    int pop() {
        if (isEmpty()) {
            System.out.println("0 elements are in the stack to pop.");
            return -1;
        }
        return list.deleteHead().value;
    }

    int getTopVal() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return list.head.value;
    }

    void deleteStack() { list.head = null; }
}
