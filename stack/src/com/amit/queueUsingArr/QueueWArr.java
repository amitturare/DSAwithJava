package com.amit.queueUsingArr;

public class QueueWArr {
    int[] arr;
    int front;
    int rear;

    public QueueWArr(int size) {
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    // Check if queue is full
    public boolean isFull() {
        if (front == 0 && rear == arr.length - 1) {
            return true;
        }
        return false;

    }

    // Display the queue
    public void printQ() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("FRONT -> ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i]);
            if (i != rear) {
                System.out.print(" -> ");
            }
        }
        System.out.println(" <- REAR");
    }

    // Display the peek element
    public int getTop() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return arr[front];
    }

    // Insert elements in queue
    public void enQueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        arr[rear + 1] = val;
        rear++;
    }

    // Delete an element in queue
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int deletedItem = arr[front];
        if (front == rear) {
            arr[front] = 0;
            front = -1;
            rear = -1;
        } else {
            arr[front] = 0;
            front++;
        }
        return deletedItem;
     }

     // Delete the whole queue
    public void deleteQ() {
        front = -1;
        rear = -1;
        arr = null;
    }
}
