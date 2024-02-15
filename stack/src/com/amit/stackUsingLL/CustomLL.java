package com.amit.stackUsingLL;

public class CustomLL {
    Node head;
    int size;

    public CustomLL() {
        this.size = 0;
    }

    void printLL() {
        Node pointer = head;
        System.out.print("TOP -> ");
        for (int i = 0; i < size; i++) {
            System.out.print(pointer.value);
            pointer = pointer.next;

            if (pointer != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    Node deleteHead() {
        Node deletedNode = head;
        head = head.next;
        size--;
        return deletedNode;
    }

    class Node {
        int value;
        Node next;

        public Node(int val) {
            this.value = val;
        }
    }
}
