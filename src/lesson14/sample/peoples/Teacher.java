package lesson14.sample.peoples;

public class Teacher extends Human{
    private String spethaly;
    private int number;

    public Teacher(String lastName, String firstName, int age, String spethaly, int number) {
        super(lastName, firstName, age);
        this.spethaly = spethaly;
        this.number = number;
    }

    @Override
    public void info(){
        super.info();
        System.out.println(this.spethaly + " " + this.number);
    }
}
