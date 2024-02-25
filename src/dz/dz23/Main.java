package dz.dz23;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure();
        Triangle triangle = new Triangle(10, 20);
        Rectangle rectangle = new Rectangle(10, 20);

        System.out.println("площадь фигуры не определена: " + figure.calculateArea());
        System.out.println("площадь прямоугольника: " + rectangle.calculateArea());
        System.out.println("площадь треугольника: " + triangle.calculateArea());
    }
}
