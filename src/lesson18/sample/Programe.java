package lesson18.sample;

import lesson12.Calc;

public class Programe {
//    static int x = 10;
//    static int y = 20;

    public static void main(String[] args) {
//        int x = 10;
//        int y = 20;
//        Calcs operation = () -> {
//        x = 30;
//        return x + y;
//    };
//        System.out.println(x);
//        System.out.println(operation.calculate());
//
//        Calcs operation = (int x, int y) -> {
//            if (y == 0){
//                return 0;
//            }else {
//                return x / y;
//            }
//        };
//        System.out.println(operation.calculate(20,10));
//        System.out.println(operation.calculate(3,2));
//    }

        Calcs<Integer> operation1 = (x, y) -> x + y;
        Calcs<String> operation2 = (x, y) -> x + y;
        System.out.println(operation1.calculate(20, 10));
        System.out.println(operation2.calculate("Hello", "World"));
    }
}

interface Calcs<T>{
    T calculate(T x, T y);
}

//interface Calcs{
//    int calculate(int x, int y);
//}

//interface Calcs{
//    int calculate();
//}
