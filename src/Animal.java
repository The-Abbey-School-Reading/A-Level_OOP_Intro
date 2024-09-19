public class Animal {

    public String name;
    public int noOfLegs;
    public String noise;

    public Animal(String name, int number, String sound){
        this.name = name;
        this.noOfLegs = number;
        this.noise = sound;

        System.out.printf("Animal object created for %s. This animal has %d legs. It goes %s!\n", this.name, this.noOfLegs, this.noise);

    }
}
