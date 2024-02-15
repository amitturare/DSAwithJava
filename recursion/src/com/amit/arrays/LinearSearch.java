package com.amit.arrays;

import java.util.*;

class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(searchIndexFromLast(arr, 9, arr.length - 1));
        
        int[] arr1 = {2, 1, 4, 5, 7, 1, 3, 1};
        // searchAllIndexes(arr1, 1, 0);
        // System.out.println(list);
        
        // System.out.println(searchAllIndexes(arr1, 1, 0, new ArrayList<Integer>()));
        
        System.out.println(searchAllIndexes2(arr1, 1, 0));
    }
    
    static boolean search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        
        return target == arr[index] || search(arr, target, index + 1);
    }
    
    static int searchIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        
        if (target == arr[index]) {
            return index;
        }
        return searchIndex(arr, target, index + 1);
    }
    
    static int searchIndexFromLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        
        if (target == arr[index]) {
            return index;
        }
        return searchIndexFromLast(arr, target, index - 1);
    }
    
    static ArrayList<Integer> list = new ArrayList<>();
    static void searchAllIndexes(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (target == arr[index]) {
            list.add(index);
        }
        searchAllIndexes(arr, target, index + 1);
    }
    
    static ArrayList<Integer> searchAllIndexes(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (target == arr[index]) {
            list.add(index);
        }
        return searchAllIndexes(arr, target, index + 1, list);
    }
    
    static ArrayList<Integer> searchAllIndexes2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        
        if (index == arr.length) {
            return list;
        }
        if (target == arr[index]) {
            list.add(index);
        }
        
        ArrayList<Integer> ansBelowFromCalls = searchAllIndexes2(arr, target, index + 1);
        list.addAll(ansBelowFromCalls);
        return list;
    }
}