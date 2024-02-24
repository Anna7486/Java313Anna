package lesson12;

// ПЕРЕГРУЗКА МЕТОДОВ
public class Calc {
    public static void main(String[] args) {
       Calculator obj = new Calculator();
       // 1.по количеству параметров
        obj.calculate(1,2);
        obj.calculate(1,2,3);
        // 2.по типам параметров
        obj.calculate(2.5, 3.4);
        // 3.по порядку параметров
        obj.calculate(2.5,2);
        obj.calculate(2,2.5);
    }
}

class Calculator{
    public void calculate(int a, int b){
        System.out.println("сумма двух чисел: " + (a +b));
    }
    public void calculate(int a, int b, int c){
        System.out.println("сумма трех чисел: " + (a + b + c));
    }
    public void calculate(double a, double b){
        System.out.println("сумма двух вещественных чисел: " + (a + b));
    }
    public void calculate(double a, int b){
        System.out.println("в результате вещественное число: " + (a + b));
    }
    public void calculate(int a, double b){
        System.out.println("в результате целое число: " + (int)(a + b));
    }
}
