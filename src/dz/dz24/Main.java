package dz.dz24;

public class Main {
    public static void main(String[] args) {
            Shape3D sphere = new Sphere(5);
            sphere.displayVolume();

            Shape3D cylinder = new Cylinder(2, 4);
            cylinder.displayVolume();

            Shape3D pyramid = new Pyramid(10, 8, 25);
            pyramid.displayVolume();
    }
}

abstract class Shape3D {
    protected String name;

    public Shape3D(String name) {
        this.name = name;
    }

    public abstract double calculateVolume();

    public void displayVolume() {
        System.out.printf("Фигура: %s | Объем фигуры: %.2f%n", name, calculateVolume());
    }
}
