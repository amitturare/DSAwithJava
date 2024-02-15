package com.amit.queueUsingLL;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        QueueWLL qLL = new QueueWLL();

        System.out.println(qLL.isEmpty());

        qLL.enQueue(1);
        qLL.enQueue(2);
        qLL.enQueue(3);
        qLL.enQueue(4);

        qLL.printQ();

        System.out.println(qLL.deQueue().value);

        qLL.printQ();
    }
}
