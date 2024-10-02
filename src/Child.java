public class Child extends Person2 {
    String schoolName;

    Child(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("School: " + schoolName);
    }
}
