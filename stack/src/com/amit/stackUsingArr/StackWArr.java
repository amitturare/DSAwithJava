package com.amit.stackUsingArr;

public class StackWArr {
    int[] arr;
    int top;

    StackWArr(int size) {
        this.arr = new int[size];
        this.top = -1;
    }

    // Print
    void printS() {
        if (top == -1) {
            System.out.println("0 elements are in the stack.");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]);

            if (i != top) {
                System.out.print(" -> ");
            }
        }
        System.out.println(" <- TOP");
    }

    // isEmpty, isFull, push, pop, getTop, deleteStack
    boolean isEmpty() { return top == -1; }

    boolean isFull() { return top == arr.length - 1; }

    void push(int val) {
        if (isFull()) {
            System.out.println("Stack is full.");
            return;
        }
        arr[top + 1] = val;
        top++;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("0 elements are in the stack to pop.");
            return -1;
        }
        int topEl = arr[top];
        arr[top] = 0;
        top--;
        return topEl;
    }

    int getTop() { return arr[top]; }

    void deleteStack() { top = -1; }
}
