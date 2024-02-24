package lesson15.shape;

public class Ractangle extends Shape{
    private int wight;
    private int height;

    public Ractangle(String color, int wight, int height) {
        super(color);
        this.wight = wight;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (this.wight + this.height) * 2;
    }

    @Override
    public double getArea() {
        return this.wight * this.height;
    }

    @Override
    public void draw() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.wight; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    @Override
    public void info() {
        System.out.printf("=== Прямоугольник ===%nШирина: %d%nВысота: %d%nЦвет: %s%nПлощадь: %.1f%nПериметр: %.1f%n", this.wight, this.height, getColor(),getArea(),getPerimeter());
        draw();
    }
}
