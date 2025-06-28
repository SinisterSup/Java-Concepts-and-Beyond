package oops2.package1;

public class Main {

    public static void main(String[] args) {
        Student guy = new Student();

        System.out.println(guy);
        System.out.println(guy.age);
//        // Since `name` attribute of Student class is private
//        // accessing guy.name, throws error
//        System.out.println(guy.name);
        System.out.println(guy.email);
        System.out.println(guy.address);

        Student guy2 = new Student("newbie", "newbie@hotmail.com");
        System.out.println(guy2);

        guy2.printDetails();

    }
}
