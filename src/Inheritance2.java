public class Inheritance2 {

    // Main class to test the implementation

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, "Black");

        dog.displayInfo();
        dog.makeSound();
        System.out.println();
        cat.displayInfo();
        cat.makeSound();
    }
}

