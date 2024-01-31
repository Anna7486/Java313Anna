package lesson6;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*//        hello("Irina");
//        hello("Igor");
//        getSum(2,5);
//        int a = 1;
//        int b = 7;
//        getSum(a,b);
//        int n1 = 3;
//        int n2 = 7;
//        getSum(n1,n2);

//        symbolDraw(9, '+', '-');
//        symbolDraw(7, 'x', '0');

//        int a = 30;
//        int b = 45;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        swapFunction(a,b);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);


//        int a = 11;
//        int b = 6;
//        int c = min(a, b);
//        System.out.println("минимальное значение: " + c);

//        System.out.print("a = ");
//        int a = input.nextInt();
//        System.out.print("b = ");
//        int b = input.nextInt();
//        int c = res(a,b);
//        System.out.println("результат: " + c);

//        for (int i = 1; i < 11; i++) {
//            System.out.println(i + " в кубе = " + cub(i));
//        }


//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            printLine(1,i);
//        }
//        for (int i = n - 1; i > 0 ; i--) {
//            printLine(1, i);
//        }

    }

//    public static void printLine(int start, int end){
//        for (int i = start; i <= end; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }

//    public static int cub(int a){
//        return a * a * a;
//    }


//    public static int res(int n, int m){
//        if (n > m){
//            return n - m;
//        }else{
//            return n + m;
//        }
//    }

//    public static int res(int n, int m){
//        int res;
//        if (n > m){
//            res = n - m;
//        }else{
//            res = n + m;
//        }
//        return res;
//    }


//    public static int min(int n1, int n2){
//        int min;
//        if (n1 > n2){
//            min = n2;
//        }else {
//            min = n1;
//        }
//        return min;
//    }

//    public static void swapFunction(int n,int m){
//        System.out.println("n = " + n);
//        System.out.println("m = " + m);
//        int c = n;
//        n = m;
//        m = c;
//        System.out.println("-------------");
//        System.out.println("n = " + n);
//        System.out.println("m = " + m);
//    }


//    public static void symbolDraw(int count,char a, char b){
//        for (int i = 0; i < count; i++) {
//            if (i % 2 ==0) {
//                System.out.print(a);
//            }else {
//                System.out.print(b);
//            }
//        }
//        System.out.println();
//    }

//    public static void getSum(int a, int b){
//        System.out.println(a + b);
//    }

//    public static void hello(String name){
//        System.out.println("hello, " + name + "!");
//    }*/
//        sum(1,2,3);
//        sum(1,2,3,4,5);
//        sum();
//
//        sum( 10,"welcome","20");
//        sum(1,"hello","a","b");
//        sum(1);
//    }
//
//        public static void sum( int nums,String ...massage) {
//            System.out.println(massage);
////        int res = 0;
////            for (int n:nums) {
////                res+=n;
////            }
////            System.out.println(res);


//       func_num(2,7,0,3,1,5,-13);
//       func_num(2,7,0,3,1,5,-13,13);
//       func_num(26);
//       func_num(99,99,100,34,-93);
//       func_num(99,39,99,100,34);
//       func_num();
//        }
/*//    public static void func_num(int ...args){
//        int max = args[0];
//        for (int i:args) {
//            if (i % 13 ==0  && i > 0) {
//                max = i;
//            }else {
//
//            }
//        }
//       if (args[0] % 13 != 0 && max == args[0])
//           System.out.println("число не найдено");
//        else
//        System.out.println(max);
//    }*/

//    public static void func_num(int ...args){
//        int max = args[0];
//        for (int i:args) {
//            if (i % 13 ==0  && i > 0) {
//                max = i;
//            }
//        }
//        if (args[0] % 13 != 0 && max == args[0])
//            System.out.println("число не найдено");
//        else
//           System.out.println(max);
//    }


        System.out.println(ch(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(ch(3, 6, 1, 9, 5));

    }

    public static ArrayList ch(int... args) {
        ArrayList<Integer> mas = new ArrayList<>();
        int sum = 0;
        int count = 0;
        double average;
        for (int i: args){
            sum += i;
            count += 1;
        }
        average = (double) sum / count;
        System.out.println("среднее арифметическое: " + average);
        for (int i:args) {
            if (i < average){
                mas.add(i);
            }
        }
        return mas;
    }
}
