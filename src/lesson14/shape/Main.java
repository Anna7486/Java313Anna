package lesson14.shape;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(-10, -20, "green");
//        rect.setWidth(-30);
//        rect.setHeight(-40);
        System.out.println("ширина: " + rect.getWidth());
        System.out.println("высота: " + rect.getHeight());
        System.out.println("цвет: " + rect.getColor());
        System.out.println("площадь: " + rect.area());
    }
}
