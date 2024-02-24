package lesson14.sample.peoples;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Батодалаев", "Даши", 16, "ГК", "Веб_011", 5);
        student1.info();
        Student student2 = new Student("Загидуллин" , "Линар", 32, "РПО" , "ПД_011", 5);
        student2.info();
        Graduate graduate = new Graduate("Шугани", "Сергей", 15, "РПО", "ПД_011", 5, "Защита персональных данных");
        graduate.info();
        Teacher teacher = new Teacher("Данышин", "Андрей", 38, "Астрофизика", 110);
        teacher.info();
    }
}
