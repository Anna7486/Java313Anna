package lesson12;

public class Sample {
    public static void main(String[] args) {
        Dog d1 = new Dog("шарик");
        Dog d2 = new Dog("нарда");
        d1.run();
        d2.run();
    }
}

class Dog{
    private String name;
    private Foat foat;

    public Dog(String name) {
        this.name = name;
        foat = new Foat();
        System.out.println("экземпляр класса foat");
    }
    void run(){
        foat.run();
    }
    class  Foat{
        void run(){
            String name = "Foat";
            System.out.println("собака " + Dog.this.name + " бежит...");
        }
    }
}
