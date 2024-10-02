public class Adult extends Person2 {
    String jobTitle;

    Adult(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Job Title: " + jobTitle);
    }
}
