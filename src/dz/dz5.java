package dz;

import java.util.Scanner;

public class dz5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите количество часов: ");
        int a = input.nextInt();

        switch (a >= 0 && a <= 5 ? 1 :
                a >= 6 && a <= 12 ? 2 :
                a >= 13 && a <= 16 ? 3 :
                a >= 17 && a <= 23 ? 4 : 0){
            case 1 -> System.out.println("Доброй ночи");
            case 2 -> System.out.println("Доброе утро");
            case 3 -> System.out.println("Добрый день");
            case 4 -> System.out.println("Добрый вечер");
            case 0 -> System.out.println("Введено некорректное значение!");
        }

        input.close();
    }
}
