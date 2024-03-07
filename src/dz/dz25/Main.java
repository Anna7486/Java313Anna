package dz.dz25;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(100, 150);
        System.out.println("Width: " + rectangle.getWidth() + ", Height: " + rectangle.getHeight());

        rectangle.resizeWidth(250);
        rectangle.resizeHeight(300);
        System.out.println("Width: " + rectangle.getWidth() + ", Height: " + rectangle.getHeight());
    }
}
