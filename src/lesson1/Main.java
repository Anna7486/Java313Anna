package lesson1;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        int a = 3;
//        int b = 5;
//        System.out.println(a);
//        System.out.println(b);
//        a = a * b / a;
//        b = a * b / a;
//        System.out.println(a); // a = 5
//        System.out.println(b); // b = 3


//        float a =8.5F;
//        System.out.println(a);
//        double b = 8.5;
//        System.out.println(b);

//        System.out.println(((Object)512).getClass().getSimpleName());
//        int a = 512;
//        System.out.println(a);
//        long b = 12345678901L;
//        System.out.println(b);

//        int num2 = 0b10010;
//        System.out.println(num2);
//        int num8 = 022;
//        System.out.println(num8);
//        int num16 = 0x12;
//        System.out.println(num16);
//        System.out.println(num2 + num16);

//        int x = 123_456__789;
//        System.out.println(x);
//        double y = 243_567.798__102;
//        System.out.println(y);

//        double d1 = 0.512;
//        double d2 = .512;
//        double d3 = 512.;
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(d3);
//        float f1 = 512.F;
//        System.out.println(f1);

//        String text = "\tHello \nWorld";
//        System.out.println(text);
//        System.out.println("    Путь к каталогу \"folder\" находиться D:\\folder\\file.txt");
//
//        System.out.print("2 + 2 = 5");  //2 + 2 = 5
//        System.out.print("\b"); //2 + 2 =
//        System.out.print("4"); //2 + 2 + 4
//        System.out.print("\r"); //перепечатали новый текст на строке
//        System.out.print("Новый текст");

//        System.out.print("5 + 3 = ");
//        System.out.println(5 + 3);
//        System.out.println("5 + 3 = " + (5 + 3));
//        System.out.printf("5 + 3 = %d %n", 5 + 3); //%d используется для целочисленных значений
//        int a = 5;
//        int b = 6;
//        System.out.printf("a = %d, b = %d %n", a, b);
//        System.out.printf("a = " + a + ", b = " + b);

//        String name = "Irina";
//        int age = 25;
//        double height = 1.7;
//        System.out.printf("Меня зовут %s. Мне %d лет. Мой рост %.2f", name,
//                age, height); //%s используется для вывода строк, %c для отдельного символа(char), %f для вещественных чисел

//        System.out.println(5 + 2);
//        System.out.println(5 - 2);
//        System.out.println(5 * 2);
//        System.out.println(5 / 2);
//        System.out.println(5. / 2);
//        System.out.println(5 / 2.);
//        System.out.println(5 % 2); //остаток от деления 1
//
//        int num = 4321;
//        int a, b, c, d, res;
//        System.out.printf("Исходное число: %d %n", num);
//        a = num % 10;
//        System.out.println(a);
//        num = num / 10;
////        System.out.println(num);
//        b = num % 10;
//        System.out.println(b);
//        num = num / 10;
////        System.out.println(num);
//        c = num % 10;
//        System.out.println(c);
//        num = num / 10;
////        System.out.println(num);
//        d = num % 10;
//        System.out.println(d);
//
//        res = a * 1000 + b * 100 + c * 10 + d;
//        System.out.printf("Обратное число: %d", res);

//        int a = 8;
//        int b = 8;
//        a++; //++a,a++ - инкремент - добавление 1, b--, --b - декремент - вычитание 1
//        ++b;
//        System.out.println(a);
//        System.out.println(b);

//        int a = 8;
//        int b = a++;
//        System.out.println(a);
//        System.out.println(b);

//        int a = 1;
//        int b = 1;
//        int c = a++ + 3; // c = 1 + 3 = 4  a = 2
//        int d = ++b + 3; // d = 2 +3 = 5  b = 2
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);

//        int a = 2;
//        int b = a++;
//        int c = b + 3 + a; //2 + 3 + 3 = 8
//        System.out.println(c);

//        int a = 2;
//        int b = ++a;
//        int c = b + 3 + a; //3 + 3 + 3 = 8
//        System.out.println(c);

//        int a = 1;
//        int b = 2;
//        int c = (a + 5) * ++b; //(1 + 5) * 3
//        System.out.println(c); //18
//        System.out.println(b); //3

//        System.out.printf("%8d%n", 123);
//        System.out.printf("%4d%5d%n", 123, 456);
//        System.out.printf("%4d%n", 123456789);
//        System.out.printf("%6.2f%n", 123.45789);
//        System.out.printf("%-6s%5d%n", "num =", 456);

        System.out.printf("-------------------------------------------%n");
        System.out.printf("      JAVA PRIMITIVE TYPES    %n");

        System.out.printf("| %-10s | %-8s | %4s |%n", "CATEGORY", "NAME", "BITS");
        System.out.printf("-------------------------------------------%n");
        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "double", 64);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "float", 32);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "long", 64);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "int", 32);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "short", 16);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "byte", 8);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "char", 16);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "boolean", 1);
        System.out.printf("-------------------------------------------%n");

        //Преобразование базовых типов данных
//        int x = 5;
//        byte y = (byte)x;
//        System.out.println(y);
//        byte x = 5;
//        int y = x;
//        System.out.println(y);
//        int x = 7654321;
//        float y = x;
//        System.out.println(y);
//        int x = 258;
//        byte y = (byte) x;
//        System.out.println(y);
//        long x = 5;
//        int y = (int)x;
//        System.out.println(y);
//        double x = 18.9848;
//        int y = (int)Math.round(x);
//        System.out.println(y);

//        int a = 5, b = 10, c = 7, sum, proiz;
//        double crarif;
//        sum = a + b + c;
//        System.out.println(sum);
//        proiz = a * b * c;
//        System.out.println(proiz);
//        crarif = (double)(a + b + c)/3;
//        System.out.printf("%.2f", crarif);

//        int a = 5;
//        double b = 4.7;
//        double c = a + b;
//        System.out.println(c);
//
//        int d = 'a' + 3;
//        System.out.println(d);











    }
}