package com.amit.circularsinglyLL;

public class CircularSinglyLL {
    private Node head;
    private Node tail;
    public int size;

    public CircularSinglyLL() {
        this.size = 0;
    }

    // Class Methods
    void printCSLL() {
        Node pointer = head;
        for (int i = 0; i < size; i++) {
            System.out.print(pointer.value + " -> ");
            pointer = pointer.next;
        }
        if (tail != null) {
            System.out.println("HEAD " + tail.next.value + "...");
        }
    }
    Node getNode(int index) {
        Node pointer = head;
        if (index < size) {
            for (int i = 0; i < index; i++) {
                pointer = pointer.next;
            }
            return pointer;
        }
        return null;
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


    // Insert Methods
    void insertHead(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        tail.next = head;
        size++;
    }
    void insertTail(int value) {
        if (head == null) {
            insertHead(value);
            return;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    void insert(int value, int index) {
        if (index == 0) {
            insertHead(value);
            return;
        } else if (index == size) {
            insertTail(value);
            return;
        }
        Node prevNodePointer = getNode(index - 1);
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
        tail.next = head;
        size--;
        return deletedNode;
    }
    Node deleteTail() {
        if (tail == null) {
            return null;
        }
        Node deletedNode = tail;
        Node prevNodePointer = getNode(size - 2);
        prevNodePointer.next = head;
        tail = prevNodePointer;
        size--;
        return deletedNode;
    }
    Node delete(int index) {
        if (index == 0) {
            return deleteHead();
        } else if (index == size - 1) {
            return deleteTail();
        }
        if (index < size) {
            Node deletedNode = getNode(index);
            Node prevNodePointer = getNode(index - 1);
            prevNodePointer.next = prevNodePointer.next.next;
            size--;
            return deletedNode;
        }
        return null;
    }

    class Node {
        int value;
        Node next;

        public Node(int val) {
            this.value = val;
        }
        public Node(int val, Node nextNode) {
            this.value = val;
            this.next = nextNode;
        }
    }
}
