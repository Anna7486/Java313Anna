package dz.dz20;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Реализуйте класс Автомобиль. Необходимо хранить " +
                "в полях класса: %nназвание модели, год выпуска, производителя, " +
                "мощность двигателя, цвет машины, цену. Реализуйте %nметоды класса" +
                " для ввода данных, вывода данных, реализуйте доступ к отдельным" +
                " полям через методы класса.");
        System.out.println();
        System.out.println();
        Automobile a1 = new Automobile("X7 M50i", "2022", "BMW", "530 л.с.", "black", "10790000");
        a1.printInfo();
        a1.setYear("2021");
        a1.setCarColor("white");
        System.out.println(a1.getYear());
        System.out.println(a1.getCarColor());
        a1.printInfo();
    }
}
