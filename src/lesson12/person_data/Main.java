package lesson12.person_data;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Юлия", "23.05.1986", "8(999)888-77-66", "Россия", "Хабаровск", "Улица Гамарника 45");
        h1.printInfo();
        h1.setName("Юля");
        h1.setBirthday("26.05.1985");
        System.out.println(h1.getName());
        System.out.println(h1.getBirthday());
        h1.printInfo();

        Human h2 = new Human("Юрий");
        h2.setData("24.12.1999", "Россия", "Сочи", "Улица ленина 15");
        h2.printInfo();
    }
}
