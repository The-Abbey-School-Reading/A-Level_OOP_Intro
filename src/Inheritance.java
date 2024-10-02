public class Inheritance {
    // Main class to test the implementation
        public static void main(String[] args) {
            Child child = new Child("Alice", 10, "Greenwood Elementary");
            Adult adult = new Adult("Bob", 35, "Software Engineer");

            child.displayInfo();
            System.out.println();
            adult.displayInfo();
        }
    }
