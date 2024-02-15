package com.amit;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            ArrayList is used when there is no idea of the length of the array.
            Here Java handles the length itself. Similar to vectors in C++.

            Initially the size is fixed internally. Now if the arraylist is filled
            more than the capacity,
            First it creates a new arrayList of say, double the size.
            Then old elements are copied in the new one and then old elements
            are copied in the new one. Later the old list gets deleted.

            Syntax,
            ArrayList<dataType> variableName = new ArrayList<>(initialCapacity);

            dataType accepts wrapper classes instead of the primitives.
            For Example, String, Integer, etc.
        */
        ArrayList<Integer> list = new ArrayList<>(2);

        // Any number of elements can be added inside
        list.add(67);
        list.add(78);
        list.add(69);
        list.add(7);
        list.add(0);

        System.out.println(list);

        // Check if list contains a specific element
        System.out.println(list.contains(69)); // Outputs: true

        // Update an element
        list.set(0, 100); // Change the value of 0th index to 100
        System.out.println(list);

        // Remove an element
        list.remove(2); // Removes the element at 2nd index.
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>(2);

        // Inputting values into the list
        for (int i = 0; i < 5; i++) {
            list1.add(in.nextInt());
        }
        System.out.println(list1);
    }
}
