package oops3;

public class Dog extends Animal {
    int animalNumber = 2;

    public void bark() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eating");
    }

    @Override
    public void walk() {
        System.out.println("Dog walking");
    }
}
