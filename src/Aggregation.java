public class Aggregation {

    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Reading", "UK");
        Person person = new Person("John Doe", address);

        System.out.println(person);

    }

}
