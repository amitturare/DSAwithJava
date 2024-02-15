package com.amit.queueUsingLL;

public class QueueWLL {
    Node head;
    Node tail;
    int size;

    public QueueWLL () {
        this.size = 0;
    }

    void printQ() {
        Node pointer = head;
        System.out.print("FRONT -> ");
        while (pointer != null) {
            if (pointer != head) {
                System.out.print(" <- ");
            }
            System.out.print(pointer.value);
            pointer = pointer.next;
        }
        System.out.println(" <- REAR");
    }

    boolean isEmpty() {
        return head == null;
    }

    void enQueue(int val) {
        if (tail == null) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = head;
            }
            size++;
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
        size++;
    }

    Node deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        Node deletedNode = head;
        head = head.next;
        size--;
        return deletedNode;
    }


    class Node {
        int value;
        Node next;

        public Node (int val) {
            this.value = val;
        }
    }
}
