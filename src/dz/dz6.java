package dz;

import java.util.Scanner;

public class dz6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE,sum = 0, count = 0;
        do {
            System.out.print("введите число: ");
            do {
                a = input.nextInt();
                if (a < 0){
                    System.out.print("введите положительное число: ");
                }
            }while (a < 0);
            if (a < min && a != 0){
                min = a;
            } if (a > max){
                max = a;
            }
            sum += a;
            if (a != 0){
                count++;
            }
        }while (a != 0);
        if (sum != 0){
            System.out.printf("среднее арифметическое: %.2f\n", (double) sum / count);
            System.out.println("минимальное число: " + min);
            System.out.println("максимальное число: " + max);
        }
    }
}
