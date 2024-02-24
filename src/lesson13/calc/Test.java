package lesson13.calc;

public class Test {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        MyCalculation calc = new MyCalculation();
        System.out.println(calc.z);
        calc.multiplication(a,b);
        calc.addition(a,b);
        calc.subtraction(a,b);
        System.out.println(calc.z);
    }
}
