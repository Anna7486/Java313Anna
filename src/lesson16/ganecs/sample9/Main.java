package lesson16.ganecs.sample9;

public class Main {
    public static void main(String[] args) {
        Ractangle[] arr1 = new Ractangle[3];
        arr1[0] = new Ractangle(1,1);
        arr1[1] = new Ractangle(10,10);
        arr1[2] = new Ractangle(5,5);

        System.out.println("Площади прямоугольников:");
        for (Ractangle ractangle : arr1) {
            System.out.println(ractangle.getArea());
        }

        FigureStats <Ractangle> rs = new FigureStats<>(arr1);
        System.out.println("=== Прямоугольники ===\nСуммарная площадь: " + rs.getSumArea() + "\nМаксимальная площадь: " + rs.getMaxArea() + "\nМинимальная площадь: " + rs.getMinArea());

        Circle[] arr2 = new Circle[5];
        arr2[0] = new Circle(1);
        arr2[1] = new Circle(10);
        arr2[2] = new Circle(4);
        arr2[3] = new Circle(100);
        arr2[4] = new Circle(0.1);

        System.out.println("Площади кругов:");
        for (Circle circle : arr2) {
            System.out.println(circle.getArea());
        }

        FigureStats <Circle> cs = new FigureStats<>(arr2);
        System.out.println("===Круги ===\nСуммарная площадь: " + cs.getSumArea() + "\nМаксимальная площадь: " + cs.getMaxArea() + "\nМинимальная площадь: " + cs.getMinArea());
    }
}
