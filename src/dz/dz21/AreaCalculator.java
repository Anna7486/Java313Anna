package dz.dz21;

public class AreaCalculator {
    public static void main(String[] args) {
        double triangleArea1 = AreaCalculator.calculateTriangleAreaHeron(3, 4, 5);
        System.out.println("Площадь треугольника по формуле Герона (3, 4, 5): " + triangleArea1);

        double triangleArea2 = AreaCalculator.calculateTriangleAreaBaseHeight(6, 7);
        System.out.println("Площадь треугольника по основанию и высоте (6, 7): " + triangleArea2);

        double squareArea = AreaCalculator.calculateSquareArea(7);
        System.out.println("Площадь квадрата (7): " + squareArea);

        double rectangleArea = AreaCalculator.calculateRectangleArea(2, 6);
        System.out.println("Площадь прямоугольника (2, 6): " + rectangleArea);

        int calculationCount = AreaCalculator.getCount();
        System.out.println("Количество подсчетов площади: " + calculationCount);
    }
    private static int count = 0; // переменная для отслеживания количества подсчетов

    public static double calculateTriangleAreaHeron(double side1, double side2, double side3) {
        count++;
        double perimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
    }

    public static double calculateTriangleAreaBaseHeight(double base, double height) {
        count++;
        return 0.5 * base * height;
    }

    public static double calculateSquareArea(double side) {
        count++;
        return side * side;
    }

    public static double calculateRectangleArea(double length, double width) {
        count++;
        return length * width;
    }

    public static int getCount() {
        return count;
    }
}




