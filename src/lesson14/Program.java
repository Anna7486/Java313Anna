package lesson14;

public class Program {
    public static void main(String[] args) {
        final int N = 3;
        Shape s[] = new Shape[N];
        s[0] = new Circle();
        s[1] = new Triangle1();
        s[2] = new Square();

        for (int i = 0; i < N; i++) {
            System.out.println(s[i].draw());
            System.out.println(s[i].erase() + "\n");
        }
    }
}

class Shape{
    public String draw(){
        return "рисуем фигуру";
    }
    public String erase(){
        return "стираем фигуру";
    }
}

class Circle extends Shape{
    @Override
    public String draw() {
        return "рисуем круг";
    }

    @Override
    public String erase() {
        return "стираем круг";
    }
}

class Triangle1 extends Shape{
    @Override
    public String draw() {
        return "рисуем треугольник";
    }

    @Override
    public String erase() {
        return "стираем треугольник";
    }
}

class Square extends Shape{
    @Override
    public String draw() {
        return "рисуем квадрат";
    }

    @Override
    public String erase() {
        return "стираем квадрат";
    }
}
