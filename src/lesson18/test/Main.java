package lesson18.test;

import lesson12.Calc;

public class Main {
    public static void main(String[] args) {
        int x = 5, y = 3;
        Calcs sum = new Calcs();
        sum.calculate(x,y);


//        CalcElse mul = new CalcElse();
//        mul.calculate(x,y);
    }
}

class Calcs{
    public void calculate(int a, int b){
        System.out.println(a + b);
    }
}

class CalcElse extends Calcs{
    @Override
    public void calculate(int a, int b){
        System.out.println(a * b);
    }
}
