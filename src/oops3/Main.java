package oops3;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.walk();

        Dog dog1 = new Dog();
        dog1.walk();
        dog1.bark();

        Animal animalDog = new Dog();
        animalDog.walk();
//        // the below method is not allowed
//        // since bark is only the behavior of dog class,
//        // not of Animal behaviour.
//        animal1.bark();

        System.out.println(animal1.animalNumber);  // 1000
        System.out.println(dog1.animalNumber);  // 1000? 2? -> 2!!
        System.out.println(animalDog.animalNumber);  // 1000

        UploadService uploadService = new UploadService(new AWSCloudProvider());
        uploadService.handleFileUpload("myFile");
    }
}
