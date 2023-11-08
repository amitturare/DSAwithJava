package com.amit;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            Syntax of array list:
                ArrayList<datatype> list = new ArrayList<>();
         */
        ArrayList<Integer> list = new ArrayList<Integer>(5);
//        list.add(6);
//        list.add(45);
//        list.add(456);
//        list.add(31);
//        list.add(6);
//        list.add(69);
//
//        System.out.println(list.contains(69));
//        System.out.println(list);
//        list.set(0, 99);
//        list.remove(2);
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // Get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
