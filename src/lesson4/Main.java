package lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n, res;
//        System.out.println("Введите число от 1 до 100: ");
//        n = input.nextInt();
//        res = n;
//        if (n >=11 && n<=14){
//            System.out.println(n + " копеек");
//        }else {
//            res = res % 10;
//            if (res == 1){
//                System.out.println(n + " копейка");
//            } else if (res >= 2 && res <=4){
//                System.out.println(n + " копейки");
//            } else {
//                System.out.println(n + " копеек");
//            }
//        }

//        int manth, year, numDays = 0;
//        System.out.print("Введите номер месяца: ");
//        manth = input.nextInt();
//
//        switch (manth){
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                numDays = 31;
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                numDays = 30;
//                break;
//            case 2:
//                System.out.print("Введите год: ");
//                year = input.nextInt();
//                if (year % 4 == 0){
//                    numDays = 29;
//                } else {
//                    numDays = 28;
//                }
//                break;
//
//            default:
//                System.out.println("Такого месяца не существует");
//        }
//        System.out.println("Количество дней: " + numDays);

//        int manth, num = 0;
//        System.out.print("Введите номер месяца: ");
//        num = input.nextInt();
//
//        switch (num){
//            case 1, 2, 12 -> System.out.println("Зима");
//            case 3, 4, 5 -> System.out.println("Весна");
//            case 6, 7, 8 -> System.out.println("Лето");
//            case 9, 10, 11 -> System.out.println("Осень");
//            default -> System.out.println("Такого месяца не существует");
//        }

//        int manth, num = 0;
//        System.out.print("Введите номер месяца: ");
//        num = input.nextInt();
//        String s = switch (num){
//            case 1, 2, 12 -> "Зима";
//            case 3, 4, 5 -> "Весна";
//            case 6, 7, 8 -> "Лето";
//            case 9, 10, 11 -> "Осень";
//            default -> "Такого месяца не существует";
//        };
//        System.out.println(s);

//        System.out.print("введите балл по 12 бальной системе оценивания: ");
//        int num = input.nextInt();
//
//        System.out.print("ваш балл по 5 бальной системе оценивания: ");
//        switch ((num >= 1 && num <= 3) ? 2 :
//                (num >= 4 && num <= 6) ? 3 :
//                (num >= 7 && num <= 9) ? 4 :
//                (num >= 10 && num <= 12) ? 5 : 0){
//            case 2 -> System.out.println(2);
//            case 3 -> System.out.println(3);
//            case 4 -> System.out.println(4);
//            case 5 -> System.out.println(5);
//            case 0 -> System.out.println("такого значения нет");
//        }


//ЦИКЛЫ
//        while (условие){
//        тело цикла;
//    }
//        int a = 0; //переменная счетчик
//        while (a < 5){
//            System.out.println("a = " + a);
//            a++;//шаг цикла
//        }

//        int a = 5;
//        while (a > 0){
//            System.out.println(a);
//            a--;
//        }

//        int a = 1;
//        while (a <= 20){
//            if (a % 2 ==0) {
//                System.out.println(a);
//            }
//            a++;
//        }

//        int count = 3;
//        int n, sum = 0;
//        while (count > 0){
//            System.out.println("введите число: ");
//            n = input.nextInt();
//            sum += n;
//            count--;
//        }
//        System.out.println("сумма введенных чисел: " + sum);

//        int n, sum = 0;
//        System.out.println("введите число: ");
//        while (input.hasNextInt()){
//            System.out.println("введите число: ");
//            n = input.nextInt();
//            sum += n;
//        }
//        System.out.println("сумма введенных чисел: " + sum);

//        int a, b, sum = 0;
//        System.out.println("введите начало диапазона: ");
//        a = input.nextInt();
//        System.out.println("введите конец диапаона: ");
//        b = input.nextInt();
//
//        while (a <= b){
//            if (a % 2 != 0){
//                sum += a;
//            }
//            a++;
//        }
//        System.out.println("сумма нечетных чисел: " + sum);






//        int n, arient;
//        System.out.print("введите число: ");
//        n = input.nextInt();
//        String symbol;
//        System.out.print("тип символа: ");
//        symbol = input.next();
//        System.out.print("0 - горизонтальная линия\n1 - вертикальная линия\nориентация линии: ");
//        arient = input.nextInt();
//        while (n > 0){
//            if (arient == 0){
//                System.out.print(symbol + " ");
//            } else if (arient == 1) {
//                System.out.println(symbol);
//            }
//                n--;
//        }

//        int n;
//        String str;
//        System.out.print("введите число: ");
//        n = input.nextInt();
//        System.out.println(n);
//        input.nextLine();
//        System.out.print("введите сроку: ");
//        str = input.nextLine();
//        System.out.println(str);

//        int i = 1, sum = 0;
//        while (i <= 20){
//            if (i % 2 == 0){
//                sum += i;
//            }
//            i++;
//        }
//        System.out.println(sum);



//        int i = 0;
//        do {
//            System.out.println("i = " + i);
//            i++;
//        }while (i > 5);

//        while (i > 5){
//            System.out.println("i = " + i);
//            i++;
//        }


//        int a, sum = 0, count = 0;
//        double avarage;
//        do {
//            System.out.println("введите число: ");
//            a = input.nextInt();
//            if (a < 0){
//              sum += a;
//              count++;
//            }
//        }while (a != 0);
//        avarage = sum / (double)count;
//        System.out.printf("среднее арифметическое отрицательных чисел: %.2f", avarage);








//        int a, b, c = 0, d;
//        System.out.print("введите число: ");
//        a = input.nextInt();
//        b = a;
//        do {
//            d = b % 10;
//            c = d * 10;
//            c = c * 10 + d;
//            b /= 10;
//        }while (b > 0);
//        System.out.println(c);
//        System.out.println("число " + a + (a == c ? " " : "не") + " палиндром");





//        int i = 0;
//        while (i < 10){
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//            i++;
//        }
//        System.out.println("end");

//        int i = 0;
//        while (i < 10){
//            if (i == 3) {
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            if (i == 5){
//                break;
//            }
//            i++;
//        }
//        System.out.println("end");

//        int i = 0;
//        while (true){
//            System.out.println(i);
//            if (i == 5){
//                break;
//            }
//            i++;
//        }

//        int n;
//        while (true){
//            System.out.print("введите положительное число: ");
//            n = input.nextInt();
//            if (n < 0){
//                break;
//            }
//        }

        int a, res = 1;
        while (true){
            System.out.println("введите число: ");
            a = input.nextInt();
            if (a == 0){
                break;
            }
            res = res * a;
        }
        System.out.println("произведение чисел: " + res);





    }
}
