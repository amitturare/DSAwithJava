package day5_polymorphism;

interface Shape {
    void area();
}

class Rectangle implements Shape {
    int length, breadth;
    @Override
    public void area() {
        int result = length * breadth;
        System.out.println("Result is: " + result);
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.breadth = 2;
        rectangle.length = 4;
        rectangle.area();
    }
}
