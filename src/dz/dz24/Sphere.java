package dz.dz24;

public class Sphere extends Shape3D{
    private double radius;

    public Sphere(double radius) {
        super("шар");
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
