package oops2.package2;

import oops2.package1.Student;

public class IntelligentStudent extends Student {

    void changeBatch() {
        System.out.println("Changing Batch");
        System.out.println(age);
        // Since `email` attribute is from parent Student class
        // and protected, it can be accessed from child class
        System.out.println(email);
//        // Since `address` attribute of its parent class is
//        // package private, it can't be accessed from a diff package
//        System.out.println(address);
//        // Since `name` attribute of parent class is private
//        // It'll only be accessible within the same class (i.e., Student)
//        System.out.println(name);
    }
}
