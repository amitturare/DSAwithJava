package com.amit.singlyLL;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
            Built-in LinkedList Syntax,
            LinkedList<Object> newName = new LinkedList<>();
        */

        CustomLL list = new CustomLL();

        list.insertHead(5);
        list.insertHead(4);
        list.insertHead(3);
        list.insertHead(2);
        list.insertHead(1);
        list.insertHead(0);

        list.printLL();

        list.insertTail(99);

        list.printLL();

        list.insert(23, 1);

        list.printLL();

        System.out.println("Deleting Value: " + list.deleteHead().value);

        list.printLL();

        System.out.println("Deleting Value: " + list.deleteTail().value);

        list.printLL();

        System.out.println("Deleting Value: " + list.delete(1).value);

        list.printLL();

//        System.out.println(list.getNodeValue(2));
//        System.out.println(list.findNodeIndexByValue(5));

//        list.rotate(2);

//        list.printLL();

        list.setValue(1, 10);

        list.printLL();

    }
}
