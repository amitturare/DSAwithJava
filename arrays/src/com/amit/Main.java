package com.amit;

public class Main {
    public static void main(String[] args) {
        // Q: Store a roll number
        int a = 19;

        // Q: Store a person's name
        String name = "Amit Turare";

        // Q: Store 5 roll numbers together
        /*
            Syntax of an array
            datatype[] variableName = new datatype[size];

            datatype[] --> Helps to specify the datatype of the elements that are going to be stored in the array.
            variableName --> It is the reference variable.
            new datatype[size] --> It is creating the object in the heap memory.

            Note,
            1. The datatype represents the type of the data stored inside the array.
            2. Type of the elements inside the array should be same.
        */
        int[] rollNumbers = new int[5];
        // OR
        int[] rollNumbers2 = {1, 2, 3, 4, 5};

        /*
            int[] someArr; // This is called as the declaration of the array.
                           // It is just getting defined in the stack.
                           // This happens at compile time.

            someArr = new int[5]; // This is initialization.
                                  // Here, object is getting created in the heap.
                                  // This happens at runtime.
                                  // Heap objects may not be continuous, this depends on JVM.
                                  // Here at the runtime memory is allocated.

            new keyword is used to create an object. Here it will create an
            array of integer elements of size 5.

            By default, when only size is specified for integer array, it
            will have all the elements as 0. Here rollNumbers is [0, 0, 0, 0, 0].

            By default, when only size is specified for string array, it will have
            all the elements as null. Here below arr is [null, null, null, null, null].
            All elements are pointing to null.
        */
//        System.out.println(rollNumbers[1]); // Outputs: 0

        String[] arr = new String[4];
//        System.out.println(arr[0]); // Outputs: null
        /*
            null is a literal which can be assigned to non-primitives.
            String str = null; // Gives no error.
            int num = null; // Gives an error.

            IMPORTANT Note,
            1. Primitives are stored in stack memory.
            2. Non-primitives or objects like string type, etc., are stored in heap memory.
        */
    }
}