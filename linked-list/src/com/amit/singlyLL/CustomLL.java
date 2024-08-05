package com.amit.singlyLL;

public class CustomLL {
    // Class Variables
    private Node head;
    private Node tail;
    private int size;

    // Class Constructors
    public CustomLL() {
        this.size = 0;
    }

    // Class Methods
    void printLL() {
        Node pointer = head;
        for (int i = 0; i < size; i++) {
            System.out.print(pointer.value + " -> ");
            pointer = pointer.next;

            if (pointer == null) {
                break;
            }
        }
        System.out.println("END");
    }
    Node getNode(int index) {
        Node pointer = head;
        for (int i = 0; i < index; i++) {
            pointer = pointer.next;
        }
        return pointer;
    }
    int getNodeValue(int index) {
        Node pointer = head;
        for (int i = 0; i < index; i++) {
            pointer = pointer.next;
        }
        return pointer.value;
    }
    int findNodeIndexByValue(int val) {
        Node pointer = head;
        for (int i = 0; i < size; i++) {
            if (pointer.value == val) {
                return i;
            }
            pointer = pointer.next;
        }
        return -1;
    }
    void rotate(int index) {
        if (index < 0 && index > size) {
            return;
        }
        tail.next = head;
        Node pointer = head;
        for (int i = 0; i < index; i++) {
            pointer = pointer.next;
        }
        head = pointer;
        Node newTail = pointer;
        for (int i = 0; i < size - 1; i++) {
            newTail = newTail.next;
        }
        newTail.next = null;
    }
    void setValue(int index, int newVal) {
        Node pointer = getNode(index);
        pointer.value = newVal;
    }

    // Insertion Methods
    void insertHead(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }
    void insertTail(int value) {
        if (tail == null) {
            insertHead(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
        size++;
    }
    void insert(int value, int index) {
        if (index == 0 ) {
            insertHead(value);
            return;
        } else if (index == size) {
            insertTail(value);
            return;
        }

        Node prevNodePointer = head;
        for (int i = 0; i < index - 1; i++) {
            prevNodePointer = prevNodePointer.next;
        }
        Node newNode = new Node(value, prevNodePointer.next);
        prevNodePointer.next = newNode;
        size++;
    }

    // Deletion Methods
    Node deleteHead() {
        if (head == null) {
            return null;
        }

        Node deletedNode = head;
        head = head.next;
        size--;
        return deletedNode;
    }
    Node deleteTail() {
        if (tail == null) {
            return null;
        }

        Node prevNodeToTail = getNode(size-2);
        Node deletedNode = tail;
        prevNodeToTail.next = null;
        tail = prevNodeToTail;
        size--;
        return deletedNode;
    }
    Node delete(int index) {
        if (index == 0) {
            return deleteHead();
        } else if (index == size - 1) {
            return deleteTail();
        }

        Node prevNode = getNode(index - 1);
        Node deletedNode = getNode(index);
        prevNode.next = prevNode.next.next;
        size--;
        return deletedNode;
    }



    class Node {
        // Class Variables
        int value;
        Node next;

        // Class Constructors
        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node nextNode) {
            this.value = val;
            this.next = nextNode;
        }
    }
}
