public class Main {

    public static void main(String[] args){

        Animal cow = new Animal("cow", 4, "moo");
        System.out.println("How many legs does a cow have? " + cow.noOfLegs);
        Animal sheep = new Animal("sheep", 4, "baa");
        System.out.println("Sheep go " + sheep.noise);
    }
}
