package lesson14.area_bo;

public class Box3D extends Box{
    private double depth;

    public Box3D(double widht, double hight, double depth) {
        super(widht, hight);
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        if (depth > 0)
            this.depth = depth;
    }

    public String get3DInfo(){
        return "объект Box3D (ширина = " + getWidht() + ", высота = " + getHight() + ",глубина = " + this.depth;
    }

    public double get3DArea(){
        double area2D = getArea();
        System.out.print("объем: ");
        return area2D * this.depth;
    }
}
