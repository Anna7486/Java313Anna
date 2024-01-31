package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        /*System.out.print("Введите число:");
        int num = imput.nextInt();
        System.out.printf("Вы ввели число: %d", num);*/
        /*System.out.print("Имя: ");
        String name = imput.next();
        System.out.print("Возраст: ");
        int age = imput.nextInt();
        System.out.print("Рост: ");
        float height = imput.nextFloat();
        System.out.printf("Имя: %s. Возраст: %d. Рост: %.2f", name, age, height);*/

//        System.out.print("a = ");
//        int a = imput.nextInt();
//        System.out.print("b = ");
//        int b = imput.nextInt();
//        System.out.print("c = ");
//        int c = imput.nextInt();
//        System.out.print("d = ");
//        int d = imput.nextInt();
//        int sum1 = a + b;
//        int sum2 = c + d;
//        double calc = (double) sum1/sum2;
//        System.out.printf("Результат: %.2f",calc);
//
//        imput.close();

//        int a = 5;
//        a += 10; //a = a + 10
//        System.out.println(a);
//
//        a -= 7; //15 - 7
//        System.out.println(a);

//        int a, b, c, sum;
//        System.out.println("Введите 1 число: ");
//        a = imput.nextInt();
//        System.out.println("Введите 2 число: ");
//        b = imput.nextInt();
//        System.out.println("Введите 3 число: ");
//        c = imput.nextInt();
//        sum = a + b + c;
//        System.out.println("Сумма чисел: " + sum);

//        int a, b, c, sum;
//        System.out.print("Введите 1 число: ");
//        sum = imput.nextInt();
//        System.out.print("Введите 2 число: ");
//        sum += imput.nextInt();
//        System.out.print("Введите 3 число: ");
//        sum += imput.nextInt();
//        System.out.println("Сумма чисел: " + sum);

//        int a = 8;
//        int b = 8;
//
//        System.out.println(a == b);
//        System.out.println(a != b);
//        System.out.println(a > b);
//        System.out.println(a < b);
//        System.out.println(a <= b);
//        System.out.println(a >= b);

//        boolean a1 = 5 < 6 && 4 < 6; //&& - и
//        boolean a2 = 5 > 6 && 4 < 6;
//        boolean a3 = 5 < 6 && 4 > 6;
//        boolean a4 = 5 > 6 && 4 > 6;
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        System.out.println(a4);

//        boolean a1 = 5 < 6 || 4 < 6; // || - или
//        boolean a2 = 5 > 6 || 4 < 6;
//        boolean a3 = 5 < 6 || 4 > 6;
//        boolean a4 = 5 > 6 || 4 > 6;
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        System.out.println(a4);

//        System.out.println(!true);
//        System.out.println(!false);
//        System.out.println(!(4 < 6));

//        int age;
//        System.out.print("Введитесвой возраст: ");
//        age = imput.nextInt();
//        if (age >= 18){
//            System.out.println("Доступ на сайт разрешен");
//            System.out.println("Добро пожаловать");
//        } else {
//            System.out.println("Доступ на сайт запрещен");
//            System.out.println("Можно попасть на сайт с 18 лет");
//        }

//        int num1 = 35;
//        int num2 = 25;
//        if (num1 > num2) {
//            System.out.println("Первое число больше второго");
//        }
//         if (num2 > num1){
//            System.out.println("Второе число больше первого");
//        }
//         if (num1 == num2){
//            System.out.println("Числа равны");
//        }

        int num1 = 35;
        int num2 = 25;
        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        }
        else if (num2 > num1){
            System.out.println("Второе число больше первого");
        }
        else {
            System.out.println("Числа равны");
        }

    }
}
