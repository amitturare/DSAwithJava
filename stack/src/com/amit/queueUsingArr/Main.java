package com.amit.queueUsingArr;

public class Main {
    public static void main(String[] args) {
        QueueWArr qArr = new QueueWArr(4);

        qArr.enQueue(1);
        qArr.enQueue(3);
        qArr.enQueue(5);
        qArr.enQueue(7);
        qArr.enQueue(4);

        qArr.printQ();

        System.out.println(qArr.deQueue());

        qArr.printQ();

        System.out.println(qArr.getTop());

        qArr.deleteQ();

        qArr.printQ();
    }
}
