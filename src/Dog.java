// Dog class inheriting from Animal
public class Dog extends Animal2 {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}
