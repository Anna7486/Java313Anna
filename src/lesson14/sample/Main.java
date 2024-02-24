package lesson14.sample;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.voice();
        animal2.voice();
    }
}

class Animal{
    public void voice(){
        System.out.println("голос!");
    }
}

class Cat extends Animal{
    @Override
    public void voice(){
        System.out.println("мяу");
    }
}

class Dog extends Animal{
    @Override
    public void voice(){
        System.out.println("гав");
    }
}
