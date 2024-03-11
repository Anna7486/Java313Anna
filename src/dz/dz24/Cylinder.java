package dz.dz24;

public class Cylinder extends Shape3D{
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("цилиндр");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
