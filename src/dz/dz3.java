package dz;

import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//        System.out.print("What is your name? ");
//        String name = input.nextLine();
//        System.out.print("How old are you? ");
//        int age = input.nextInt();
//        System.out.print("Where are you live? ");
//        Scanner sc = new Scanner (System.in);
//        String live = sc.nextLine();
//        System.out.printf("This is %s %nIt is %d %nHe lives in %s", name, age, live);
//        input.close();

        System.out.printf(" %10s %4s %-8s %8s %1d %4s %6s %-3s %3s %8s %1s %9s %8s %1s %9s %2s %-20s %2s %-20s %n",
                "Переменная", "типа", "byte", "занимает", 1, "Байт", "памяти", "(8", "бит", "памяти),", "и", "принимает",
                "значения", "в", "диапазоне", "от", Byte.MIN_VALUE, "до", Byte.MAX_VALUE);
        System.out.printf(" %10s %4s %-8s %8s %1d %4s %6s %-2s %3s %8s %1s %9s %8s %1s %9s %2s %-20s %2s %-20s %n",
                "Переменная", "типа", "short", "занимает", 2, "Байт", "памяти", "(16", "бит", "памяти),", "и", "принимает",
                "значения", "в", "диапазоне", "от", Short.MIN_VALUE, "до", Short.MAX_VALUE);
        System.out.printf(" %10s %4s %-8s %8s %1d %4s %6s %-2s %3s %8s %1s %9s %8s %1s %9s %2s %-20s %2s %-20s %n",
                "Переменная", "типа", "int", "занимает", 4, "Байт", "памяти", "(32", "бит", "памяти),", "и", "принимает",
                "значения", "в", "диапазоне", "от", Integer.MIN_VALUE, "до", Integer.MAX_VALUE);
        System.out.printf(" %10s %4s %-8s %8s %1d %4s %6s %-2s %3s %8s %1s %9s %8s %1s %9s %2s %-20s %2s %-20s %n",
                "Переменная", "типа", "long", "занимает", 8, "Байт", "памяти", "(64", "бит", "памяти),", "и", "принимает",
                "значения", "в", "диапазоне", "от", Long.MIN_VALUE, "до", Long.MAX_VALUE);
        System.out.printf("                                                                                                %n");
        System.out.printf(" %10s %4s %-8s %8s %1d %4s %6s %-2s %3s %8s %1s %9s %8s %1s %9s %2s %-20s %2s %-20s %n",
                "Переменная", "типа", "float", "занимает", 4, "Байт", "памяти", "(32", "бит", "памяти),", "и", "принимает",
                "значения", "в", "диапазоне", "от", Float.MIN_VALUE, "до", Float.MAX_VALUE);
        System.out.printf(" %10s %4s %-8s %8s %1d %4s %6s %-2s %3s %8s %1s %9s %8s %1s %9s %2s %-20s %2s %-20s %n",
                "Переменная", "типа", "double", "занимает", 8, "Байт", "памяти", "(64", "бит", "памяти),", "и", "принимает",
                "значения", "в", "диапазоне", "от", Double.MIN_VALUE, "до", Double.MAX_VALUE);
    }
}
