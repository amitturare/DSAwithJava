package com.amit.classExample;

public class Main {
    public static void main(String[] args) {

        // Object of class Pen
        Pens pen1 = new Pens();

        System.out.println(pen1.color);
        System.out.println(pen1.type);

        Pens pen2 = new Pens("red", "gel");
        System.out.println(pen2.color);
        System.out.println(pen2.type);

        // Invocation
        pen2.changeType("roller-ball");
        pen1.changeType("roller-ball");
        pen2.changeType("roller-ball");
    }
}

class Pens {
    String color;
    String type;

    // Constructors
    Pens() {
        this.color = "blue";
        this.type = "ball";
    }
    Pens (String col, String typ) {
        this.color = col;
        this.type = typ;
    }

    /*
        METHODS
        returnType name() {

        }
    */
    void changeType(String newType) {
        this.type = newType;
    }

    /*
        Create a food class,
        Class Variables: type: junk, healthy, bevrages
                         int colories,
                         style
                         taste

        Objects --> food items
        Methods --> 1. Change calories
                    2. Change style



    */
}
