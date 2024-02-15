package day4_abstraction;

/*
    Interface
    Gives 100% abstraction. By default, all methods are abstracted.
*/

interface ShapeNew {
    int sum = 0; // public static final, Italic things are mainly static
    void area(); // To add body, then make it default or static
}

class Rectangle implements ShapeNew {
    int length, breadth;

    public void display() {
        System.out.println("This is Rectangle display method!");
    }

    @Override
    public void area() {
        int result = length * breadth;
        System.out.println("Area is: " + result);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 2;
        rectangle.breadth = 2;
        rectangle.display();
        rectangle.area();
    }
}
