package lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    int age = 28;
//    boolean isYour = age >= 18;
//    boolean isOld = age <= 65;
//    if (!isYour && !isOld){
//        System.out.println("Работать необязательно");
//    } else {
//        System.out.println("Вы можете работать");
//    }

//        int age = 98;
//        if (age <= 18 || age >= 65){
//            System.out.println("Работать необязательно");
//        } else {
//            System.out.println("Вы можете работать");
//        }
        Scanner td = new Scanner(System.in);
//        System.out.printf("Введите первую сторону: ");
//        int a = td.nextInt();
//        System.out.printf("Введите вторую сторону: ");
//        int b = td.nextInt();
//        System.out.printf("Введите третью сторону: ");
//        int c = td.nextInt();
//        if (a == b && b == c || a == c && a == b || b == c && b == a){
//            System.out.println("Треугольник равносторонний");
//        } else if (a == b || b == c || c == b){
//            System.out.println("Треугольник равнобедренный");
//        } else {
//            System.out.println("Треугольник разносторонный");
//        }

//        int n;
//        System.out.print("Введите кол-во ворон (0-9) ");
//        n = td.nextInt();
//        if (n >= 0 && n <= 9){
//            System.out.print("На ветке ");
//            if (n == 1){
//                System.out.println(n + " ворона");
//            } else if (n >= 2 && n<= 4){
//                System.out.println(n + " вороны");
//            } else {
//                System.out.println(n + " ворон");
//            }
//        } else {
//            System.out.println("Ошибка ввода данных");
//        }

//        int day, time;
//        System.out.print("Введите день недели цифрами: ");
//        day = td.nextInt();
//        if (day >=1 && day <= 5){
//            System.out.print("Введите время: ");
//            time = td.nextInt();
//            System.out.print("Рабочий день. ");
//            if (time >= 8 && time <= 17){
//                System.out.println("Открыто");
//            } else{
//                System.out.println("Закрыто. Откроется в 8.00");
//            }
//        } else if (day >= 6 && day <= 7){
//            System.out.println("Нерабочий день.");
//        } else {
//            System.out.println("Такого дня недели не существует.");
//        }

//        int numDay;
//        System.out.print("Введите день недели цифрами: ");
//        numDay = td.nextInt();
//        if (numDay >= 1 && numDay <= 5) {
//            System.out.print("Рабочий день. ");
//            if (numDay == 1) System.out.print("Понедельник");
//            if (numDay == 2) System.out.print("Вторник");
//            if (numDay == 3) System.out.print("Среда");
//            if (numDay == 4) System.out.print("Четверг");
//            if (numDay == 5) System.out.print("Пятница");
//        } else if (numDay == 6 || numDay == 7){
//            System.out.print("Выходной день. ");
//            if (numDay == 6) System.out.print("Суббота");
//            if (numDay == 7) System.out.print("Воскресенье");
//        } else {
//            System.out.println("Несуществующий день недели");
//        }

//        int number, res;
//        number = 10;
//        res = number >= 0 ? number : -number; //xтернарный оператор на 2 или 3 операторов
//        System.out.println(res);

//        int age;
//        System.out.print("Введите свой возраст: ");
//        age = td.nextInt();
//        System.out.println(age >= 18 ? "Приятного просмотра" : "Вам рано смотреть этот фильм");

//        int a = 20, b = 20;
//        System.out.println(a == b ? b = 8 : a > b ? "a > b" : "b > a");

//        int n = true ? (false ? 10 : 20) : 30;
//        System.out.println(n);

//        System.out.println(5 / 0);

//        int a = 20, b= 0;
//        System.out.println(b == 0 ? "на 0 делить нельзя" : (float)a / b );

//        int n;
        System.out.print("\t Выбор цвета светофора\n1 (11)- красный, 2 (22)- желтый, 3 (33)- зеленый: ");
//        n = td.nextInt();

//        switch (n){
//            case 1:
//            case 11:
//                System.out.println("Стоим");
//                break;
//            case 2:
//            case 22:
//                System.out.println("Приготовились");
//                break;
//            case 3:
//            case 33:
//                System.out.println("Идем");
//                break;
//            default:
//                System.out.println("Такого цвета у светофора нет");
//        }

        int manth, year, numDays = 0;
        System.out.print("Введите номер месяца: ");
        manth = td.nextInt();

        switch (manth){
            case 1:
                numDays = 31;
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        System.out.println("Количество дней: " + numDays);





    }
}
