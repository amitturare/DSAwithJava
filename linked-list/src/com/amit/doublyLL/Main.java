package com.amit.doublyLL;

public class Main {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();

        list.insertHead(3);
        list.insertHead(5);
        list.insertHead(8);

        list.printDLL();

        list.insertTail(99);
        list.insertTail(80);

        list.printDLL();

        list.insert(23, 2);

        list.printDLL();

        System.out.println("Deleted Node: " + list.deleteHead().value);

        list.printDLL();

        System.out.println("Deleted Node: " + list.deleteTail().value);

        list.printDLL();

        System.out.println("Deleted Node: " + list.delete(list.size - 1).value);

        list.printDLL();

        list.reverseDLL();

        System.out.println(list.findNodeIndexByValue(23));

//        System.out.println(list.head.next.next.next.prev.value);
    }
}
