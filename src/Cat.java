// Cat class inheriting from Animal
public class Cat extends Animal2 {
    String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}