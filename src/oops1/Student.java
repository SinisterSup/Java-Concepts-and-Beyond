package oops1;

public class Student {
    // attributes
    String name;
    int age;
    double psp;

//    // default constructor. provided by language. no need to explicitly create.
//    Student() {
//        this.name = null;
//        this.age = 0;
//        this.psp = 0.0;
//    }

    // behaviors
    void pauseBatch() {
        if (age > 25) {
            System.out.println("Pause not possible");
            return;
        }
        psp = 0.0;
        System.out.println("Student " + name + "'s batch pause initiated");
    }
}


// public acts as an access modifier