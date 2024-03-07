package lesson16.ganecs.sample9;

public class Ractangle extends Figure{
    private double width, height;

    public Ractangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}
