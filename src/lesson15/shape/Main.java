package lesson15.shape;

public class Main {
    public static void main(String[] args) {
        final int N = 3;
        Shape[] shapes = new Shape[N];
        shapes[0] = new Square(3,"red");
        shapes[1] = new Ractangle("green", 7, 3);
        shapes[2] = new Triangle(5, "yellow");

        for (Shape shape: shapes){
            shape.info();
        }
    }
}
