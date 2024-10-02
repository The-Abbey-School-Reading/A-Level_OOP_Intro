// Base class
public class Animal2 {
    String name;
    int age;

    public Animal2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
