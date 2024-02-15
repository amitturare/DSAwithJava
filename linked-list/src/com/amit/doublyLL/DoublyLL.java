package com.amit.doublyLL;

public class DoublyLL {
    Node head;
    Node tail;
    int size;

    public DoublyLL() {
        this.size = 0;
    }

    // Class Methods
    void printDLL() {
        Node pointer = head;
        System.out.print("START -> ");
        for (int i = 0; i < size; i++) {
            System.out.print(pointer.value);
            pointer = pointer.next;
            if (pointer == null) {
                break;
            }
            System.out.print(" <-> ");
        }
        System.out.println(" <- END");
    }
    void reverseDLL() {
        Node pointer1 = head;
        int totalNodes = 0;
        while (pointer1 != null) {
            totalNodes++;
            pointer1 = pointer1.next;
        }

        Node lastNode = getNode(totalNodes - 1);
        System.out.print("END -> ");
        for (int i = 0; i < totalNodes; i++) {
            System.out.print(lastNode.value);
            lastNode = lastNode.prev;
            if (lastNode == null) {
                break;
            }
            System.out.print(" <-> ");
        }
        System.out.println(" <- START");
    }
    int findNodeIndexByValue(int value) {
        Node pointer = head;
        for (int i = 0; i < size; i++) {
            if (pointer.value == value) {
                return i;
            }
            pointer = pointer.next;
        }
        return -1;
    }

    Node getNode(int index) {
        Node pointer = head;
        for (int i = 0; i < index; i++) {
            pointer = pointer.next;
        }
        return pointer;
    }

    // Insertion Methods
    void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }
    void insertTail(int val) {
        if (head == null) {
            insertHead(val);
            return;
        }

        Node newNode = new Node(val);
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = null;
        tail = newNode;
        size++;
    }

    void insert(int val, int index) {
        if (index == 0) {
            insertHead(val);
            return;
        } else if (index == size) {
            insertTail(val);
            return;
        }

        Node indexNode = getNode(index);
        Node prevNode = indexNode.prev;
        Node newNode = new Node(val, indexNode, prevNode);

        indexNode.prev = newNode;
        prevNode.next = newNode;
        size++;
    }

    // Deletion Methods
    Node deleteHead() {
        if (head == null) {
            return null;
        }
        Node deletedNode = head;
        head = head.next;
        head.prev = null;
        size--;
        return deletedNode;
    }

    Node deleteTail() {
        if (head == null) {
            return null;
        }
        Node deletedNode = tail;
        Node prevToTail = tail.prev;
        prevToTail.next = null;
        tail = prevToTail;
        size--;
        return deletedNode;
    }

    Node delete(int index) {
        if (index == 0) {
            return deleteHead();
        } else if (index == size - 1) {
            return deleteTail();
        }

        Node deletedNode = getNode(index);
        Node currNode = deletedNode;
        currNode.prev.next = currNode.next;
        currNode.next.prev = currNode.prev;
        size--;
        return deletedNode;
    }

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int val) {
            this.value = val;
        }
        public Node(int val, Node nextNode, Node prevNode) {
            this.value = val;
            this.next = nextNode;
            this.prev = prevNode;
        }
    }
}
