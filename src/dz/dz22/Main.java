package dz.dz22;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Виктор Вербов", "Gr111", 6);
        System.out.println(student.toString());
        Aspirant aspirant1 = new Aspirant("Александр Невзоров", "Gr222", 4, "Work1");
        System.out.println(aspirant1.toString());
        Aspirant aspirant2 = new Aspirant("Антон Бобров", "Gr333", 5, "Work2");
        System.out.println(aspirant2.toString());
    }
}
