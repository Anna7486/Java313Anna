package lesson12.rect;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
        setLength(length);
        setWidth(width);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("'" + length + "' должно быть положительным");
        }
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("'" + length + "' должно быть положительным");
        }
    }

    public int getArea(){
        return this.length * this.width;
    }

    public int getPerimeter(){
        return  2 * (this.length + this.width);
    }

    public double getHypotenuse(){
        return Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2)); //Math.pow - возведение в степень
    }

    public void getDraw(){
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
