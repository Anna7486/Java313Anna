package lesson16.ganecs;

public class sample6 {
    public static void main(String[] args) {
        Digit d1 = new Digit(10);
        Digit d2 = new Digit(10.5);
        Digit d3 = new Digit(10.5f);

        System.out.println(d1.value + " " + d2.value + " " + d3.value);
    }
}

class Digit{
    public double value;

//    public Digit(double value) {
//        this.value = value;
//    }

    public <T extends Number> Digit(T value){
        this.value = value.intValue();
    }
}
