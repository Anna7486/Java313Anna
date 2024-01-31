package dz;

import java.util.Scanner;

public class dz12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Выберите фигуру (1 - прямоугольник, 2 - треугольник, 3 - круг): ");
        int choice = input.nextInt();
        double area = 0;
        switch (choice) {
            case 1:
                System.out.print("Введите ширину прямоугольника: ");
                double width = input.nextDouble();
                System.out.print("Введите высоту прямоугольника: ");
                double height = input.nextDouble();
                area = calculateRectangleArea(width, height);
                break;

            case 2:
                System.out.print("Введите длину основания треугольника: ");
                double base = input.nextDouble();
                System.out.print("Введите высоту треугольника: ");
                double triangleHeight = input.nextDouble();

                area = calculateTriangleArea(base, triangleHeight);
                break;

            case 3:
                System.out.print("Введите радиус круга: ");
                double radius = input.nextDouble();

                area = calculateCircleArea(radius);
                break;

            default:
                System.out.println("Некорректный выбор фигуры!");
        }

        if (choice >= 1 && choice <= 3) {
            System.out.println("Площадь фигуры: " + area);
        }
    }

    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}


