package lesson14.shape;

public class Rectangle extends Figure{
    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
//        this.width = width;
//        this.height = height;
        setWidth(width);
        setHeight(height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        if (width < 0){
            throw new IllegalArgumentException("необходимо задать положительное число");
        }
        this.width = width;
    }

    public void setHeight(int height) {
        if (height > 0)
            this.height = height;
        else
            System.out.println("необходимо задать положительное число");
    }

    int area(){
        return this.width * this.height;
    }
}
