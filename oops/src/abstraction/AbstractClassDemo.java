package day4_abstraction;

/*
    WHY ABSTRACT CLASS / INTERFACE?
    Showing only the required things. Also called Selective Ignorance.
    Example: Car, Pizza Counter, Juice Center, etc.

    Abstract Class
    0 to 100% abstraction can be achieved.
    Anything can be abstracted and non-abstracted with the abstract keyword.
    It also means incomplete.
    incomplete method = incomplete class
    - Rules
    1. If you declare any method in a class it becomes abstract.
    2. If you declare any method in a class as abstract, then class will also become abstract.
    3. You can instantiate an abstract class.
    4. If you extend an abstract class, then its child class responsibility to complete or
       implement the abstract methods of that class.
    5. If child class fail to give an implementation to an abstract method, then that child
       99class has to declare itself as an "abstract class"

    Interface
    Gives 100% abstraction. By default, all methods are abstracted.
*/

abstract class Shape {
    public abstract void area(); // Declaration
    public void display() { // Declaration + Definition
        System.out.println("This is shape!");
    };


}

class Circle extends Shape {
    int radius;

    @Override
    public void area() { // Parent ka aadha kam, child karega
        float result = (float) (Math.PI * radius * radius);
        System.out.println("Result is: " + result);
    }
    public void display() {
        System.out.println("CIRCLE");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
//        Shape shape = new Shape(); // Abstract can not be instantiated.

        Circle circle = new Circle();
        circle.radius = 2;
        circle.display();
        circle.area();
    }
}
