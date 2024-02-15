package com.amit.introduction;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        /*
            Wrapper classes have more methods to work with
            than primitives like int, float, etc. You can check by
            writing the dot operator in front of the variable.
        */
        Integer num1 = 40;
        Integer num2 = 50;

        swap(a, b);
        System.out.println(a + ", " + b);
        /*
            This does not work because with primitives, pass by value
            is happening on the function.
        */

        swap(num1, num2);
        System.out.println(num1 + ", " + num2);
        /*
            This also does not work even though it does pass by reference
            value on the function, because the Integer wrapper
            class has the "final" keyword.

            "final" keyword makes sure that the variable or any other object
            can not be modified, example,
            "final" variables should be initialized while declaring only.

            If "final" keyword is given to a statement of initializing an object,
            its key's value can be changed but the whole object can not be changed.
            When a non-primitive (object) is final, you cannot reassign it.
        */
        final int number = 69;
//        number = 70; // After adding final, this assignment gives an error
        System.out.println(number);

        final Random amit = new Random("Amit Turare");
        amit.name = "Something else"; // This is possible
//        amit = new Random("new object"); // But this gives an error

        Random obj;
        for (int i = 0; i < 10000000; i++) {
            obj = new Random("Random object");
            /*
                obj is getting created multiple times,
                therefore the unassigned older obj objects will
                be cleared automatically using GC and the destructor will run.
            */
        }
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class Random {
    final int num = 10;
    String name;

    Random (String name) {
        System.out.println("Object created");
        this.name = name;
    }

    @Override // This destructor function will be executed when GC starts to act
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
