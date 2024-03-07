package lesson18.test;

import lesson13.calc.Calculation;

public class Program {
    public static void main(String[] args) {
        int x = 5, y = 3;
        CalcInterface sum = new Calc();
        sum.calculate(x, y);
    }
}

interface CalcInterface{
    void calculate(int a, int b);
}

class Calc implements CalcInterface{
    @Override
    public void calculate(int a, int b) {
        System.out.println(a + b);
    }
}
