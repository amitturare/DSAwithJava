package com.amit.circularsinglyLL;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLL list = new CircularSinglyLL();

        list.insertHead(3);
        list.insertHead(8);
        list.insertHead(18);
        list.insertHead(5);

        list.insertTail(99);

        list.printCSLL();

        list.insert(23, 2);

        list.printCSLL();

        System.out.println("Deleting Value: " + list.deleteHead().value);

        list.printCSLL();

        System.out.println("Deleting Value: " + list.deleteTail().value);

        list.printCSLL();

        System.out.println("Deleting Value: " + list.delete(3).value);

        list.printCSLL();

        System.out.println(list.findNodeIndexByValue(23));
    }
}
