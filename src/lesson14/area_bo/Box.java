package lesson14.area_bo;

public class Box {
    private double widht;
    private double hight;

    public Box(double widht, double hight) {
        this.widht = widht;
        this.hight = hight;
    }

    public double getWidht() {
        return widht;
    }

    public double getHight() {
        return hight;
    }

    public void setWidht(double widht) {
        if (widht > 0)
            this.widht = widht;
    }

    public void setHight(double hight) {
        if (hight > 0)
            this.hight = hight;
    }
    public double getArea(){
        return this.widht * this.hight;
    }
}
