package dz.dz24;

public class Pyramid extends Shape3D{
    private double baseLength;
    private double baseWidth;
    private double height;

    public Pyramid(double baseLength, double baseWidth, double height) {
        super("пирамида");
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * baseLength * baseWidth * height;
    }
}
