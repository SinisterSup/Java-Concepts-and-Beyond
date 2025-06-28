package oops3;

public class Greetings {

    // Method overloading Demo
    void hello() {
        System.out.println("hello world!");
    }

    void hello(String name) {
        System.out.println("hello " + name);
    }

    void hello(int age) {
        System.out.println("hey hello to all the people of age - " + age);
    }

    void hello(Dog d) {
        System.out.println("hello dawg!!");
    }

//    // The below method is not allowed,
//    // raises compile time error,
//    // because it is ambiguous for the compiler to choose
//    // between two different methods with the same signature.
//    void hello(String anotherGuy) {
//        System.out.println("hello " + anotherGuy);
//    }
}
