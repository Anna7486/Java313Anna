package lesson18.test;

import lesson13.calc.Calculation;

public class Program {
    public static void main(String[] args) {
        int x = 5, y = 3;
        CalcInterface sum = (a, b) -> a + b;
        CalcInterface sub = (a, b) -> a - b;
        CalcInterface mul = (a, b) -> a * b;

        int res = sum.calculate(x, y);
        int res2 = sub.calculate(x, y);
        int res3 = mul.calculate(x, y);

        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
}

interface CalcInterface{  //функциональный интерфейс
    int calculate(int a, int b);
}

//class Calc implements CalcInterface{
//    @Override
//    public void calculate(int a, int b) {
//        System.out.println(a + b);
//    }
//}
