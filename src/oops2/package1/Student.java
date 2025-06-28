package oops2.package1;

public class Student {

    public int age;
    private String name;
    protected String email;
    String address;

    public Student() {
        this.name = "freeguy";
        this.email = "freeguy@email.com";
        this.address = "freeguy home, free world";
        this.age = 25;
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

//    // The below constructor declaration throws error
//    // since the Constructor signature is not unique
//    // and raises ambiguity for Java compiler to decide between
//    // 2 different constructors with the same signature
//    public Student(String name, String address) {
//        this.name = name;
//        this.address = address;
//    }

    public Student(int age, String name, String email, String address) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public void printDetails() {
        System.out.println("Printing Details: ");
        printName();
        printEmail();
    }
    public void printName() {
        System.out.println("Name: " + this.name);
    }
    public void printEmail() {
        System.out.println("Email: " + this.email);
    }
}
