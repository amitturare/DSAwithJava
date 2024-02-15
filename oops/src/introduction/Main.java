package com.amit.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Store 5 roll numbers
        int[] rollNos = new int[5];

        // Store 5 names of those roll numbers
        String[] names = new String[5];

        // Now create a data structure containing data of 5 students,
        // their rollNo, name and marks
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // This all are individual arrays. Classes can help define it more properly

        // Now to create a new student,
        Student[] students = new Student[5];
//        System.out.println(Arrays.toString(students)); // Outputs null array

        // Step 1: Declaring
        Student student1;
        // Step 2: Initializing
        student1 = new Student();
        // Below values are output before building a specific constructor
        System.out.println(student1); // Gives a random value
        System.out.println(student1.rNo); // By default outputs 0
        System.out.println(student1.name); // By default outputs null
        System.out.println(student1.marks); // By default outputs 0.0

        // Setting values
        student1.rNo = 10;
        student1.name = "Amit";
        student1.marks = 82.3f;

        System.out.println(student1.rNo); // Outputs: 10
        System.out.println(student1.name); // Outputs: "Amit"
        System.out.println(student1.marks); // Outputs: 82.3
//        System.out.println(student1.branch); // Gives an error

        Student student2 = new Student();
        // This object will get all the default values which are set in the constructor.
        System.out.println(student2.rNo); // Outputs: 18
        System.out.println(student2.name); // Outputs: "Rahul"
        System.out.println(student2.marks); // Outputs: 88.5

        student1.changeName("SomeNewName");
        student1.greeting();

        Student student3 = new Student(2, "Rachel", 81.5f);
        System.out.println(student3.rNo); // Outputs: 2
        System.out.println(student3.name); // Outputs: "Rachel"
        System.out.println(student3.marks); // Outputs: 81.5

        /*
            If now the constructor is called without any arguments,
            it will call the constructor which does not take any parameters.
            This is called as constructor overloading.
        */
        Student student4 = new Student();
        System.out.println(student4.rNo); // Outputs: 18
        System.out.println(student4.name); // Outputs: "Rahul"
        System.out.println(student4.marks); // Outputs: 88.5

        Student student5 = new Student(student3);
        System.out.println(student3.rNo); // Outputs: 2
        System.out.println(student3.name); // Outputs: "Rachel"
        System.out.println(student3.marks); // Outputs: 81.5
    }
}

// Create a class for every single student
class Student {
    int rNo;
    String name;
    float marks;

    Student () { // This constructor will add same values to all objects
        this.rNo = 18;
        this.name = "Rahul";
        this.marks = 88.5f;

        // To call one constructor from another,
        // Comment above part and remove below comments
    }
    Student (int rollNo, String name, float marks) {
        // This constructor will take args from user to form a new object
        this.rNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    Student (Student otherObject) {
        // This constructor will take some other object value and set it to new object.
        this.rNo = otherObject.rNo;
        this.name = otherObject.name;
        this.marks = otherObject.marks;
    }

    // To create a method for the object, simply create a function,
    void changeName(String newName) {
        this.name = newName;
    }
    void greeting() {
        System.out.println("Hello, " + this.name);
    }
}