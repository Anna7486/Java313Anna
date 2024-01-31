package lesson9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*try {
            System.out.println("введите первое число: ");
            int a = input.nextInt();
            System.out.println("введите второе число: ");
            int b = input.nextInt();
            System.out.println(a / b);
        } catch (InputMismatchException | ArithmeticException e){
            System.out.println("вы ввели не целое число или делить на 0 нельзя");
        } finally {
            System.out.println("конец программы");
        }

//        catch (InputMismatchException e){
//            System.out.println("вы ввели не целое число");
//        } catch (ArithmeticException e){
//            System.out.println("делить на 0 нельзя");
//        }*/

        /*try {
            int[] numbers = new int[3];
            numbers[4] = 9;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("введен некорректный индекс");
        }*/

        int res = getFactorial(-5);
        System.out.println(res);
    }
    public static int getFactorial(int num){
        int res = 1;
        try {
            if (num < 1) {
                throw new Exception("число меньше единицы указывать нельзя");
            }
            for (int i = 1; i <= num; i++) {
                res *= i;
            }
        } catch (Exception e){
            System.out.println(e.getMessage()); //получить сообщение
            res = num;
        }
        return res;
    }
}
