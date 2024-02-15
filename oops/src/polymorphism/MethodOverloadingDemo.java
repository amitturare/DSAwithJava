package day5_polymorphism;

/*
    Poly means "many"
    Morphism means "forms" => Many Forms

    Method Overloading (Compile Time)
    Same method name, but different structure/signature.
    This happens only within in the same class.
    Doesn't need inheritance.
    Can be achieved by
    1. Change in number of parameters.
    2. Change of data types
    3. Change of sequence of passing parameters.
    One more option, Varargs -> Variable arguments
    Only considers the structure of the method, not the return type for overloading!?!?

    Method Overriding
    Happens in different class.
    Inheritance and implementations are needed.
    Return type should be same!
    Works with Covariant return type and not primitive return type.
*/

class Addition {
    int sum = 0;
    public void add(int n1, int n2) {
        sum = n1 + n2;
        System.out.println("Sum of two integers: " + sum);
    }
    public void add(int n1, int n2, int n3) {
        sum = n1 + n2 + n3;
        System.out.println("Sum of three integers: " + sum);
    }
    public void add(int n1, float n2) {
        float sum = n1 + n2;
        System.out.println("Sum of one int and one float: " + sum);
    }
    public void add(float n1, int n2) {
        float sum = n1 + n2;
        System.out.println("Sum of one float and one int: " + sum);
    }
    public void add(float n1, float n2) {
        float sum = n1 + n2;
        System.out.println("Sum of two floats: " + sum);
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Addition addition = new Addition();

        addition.add(2.5f, 1.2f); // Compiling Binding
        addition.add(12, 1.2f); // Compiling Binding
        addition.add(12.1f, 1); // Compiling Binding
        addition.add(10, 18); // Compiling Binding
        addition.add(10, 18, 23); // Compiling Binding
    }
}
