package dz;
import java.util.Scanner;
public class dz11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Выберите фигуру (1 - треугольник, 2 - прямоугольник, 3 - круг): ");
        int num = input.nextInt();
        double area = 0;
        switch (num) {
            case 1:
                System.out.print("Введите сторону a: ");
                double sideA = input.nextDouble();
                System.out.print("Введите сторону b: ");
                double sideB = input.nextDouble();
                System.out.print("Введите сторону c: ");
                double sideC = input.nextDouble();
                double s = (sideA + sideB + sideC) / 2; // Полупериметр
                area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Формула Герона для площади треугольника
                break;
            case 2:
                System.out.print("Введите сторону a: ");
                double sideD = input.nextDouble();
                System.out.print("Введите сторону b: ");
                double sideE = input.nextDouble();
                area = sideD * sideE; // Формула площади прямоугольника
                break;
            case 3:
                System.out.print("Введите радиус круга: ");
                double radius = input.nextDouble();
                area = Math.PI * Math.pow(radius, 2); // Формула площади круга
                break;
            default:
                System.out.println("Некорректный выбор фигуры!");
        }
        if (num >= 1 && num <= 3) {
            System.out.printf("Площадь фигуры: %.2f", area);
        }
    }
}
