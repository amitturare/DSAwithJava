package com.amit;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Add three list into the MultiAl `list` made above
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Add elements to the 3 sub lists 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
