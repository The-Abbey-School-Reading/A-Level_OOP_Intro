public class Person {
    private String name;
    private Address address; // Aggregation

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " lives at " + address;
    }
}

