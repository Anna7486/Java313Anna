package dz;

import java.nio.channels.CancelledKeyException;
import java.util.Arrays;

public class dz14 {
    public static void main(String[] args) {
//        int[] array = {-2, 3, 8, -11, -4, 6};
//        System.out.println("вычислить количество отрицательных чисел в массиве:");
//        System.out.println(Arrays.toString(array));
//        int n = 0;
//        for (int i = 0; i < array.length ; i++) {
//            if (array[i] < 0){
//                n++;
//            }
//        }
//        System.out.println("n = " + n);


    //другой вариант
        int[] arr = {-2,3,8,-11,-4,6};
        System.out.println("n = " + Calc(arr, 0));
    }
    public static int Calc(int[] numbers, int index){
        if (index == numbers.length){
            return 0;
        }
        return (numbers[index] < 0 ? 1 : 0) + Calc(numbers,index + 1);
    }
}
