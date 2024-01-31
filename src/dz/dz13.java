package dz;

import java.util.Arrays;

public class dz13 {
    public static void main(String[] args) {
        int[] array1 = {3, 8, 9, 4, 1, 2, 5};
        int[] array2 = {1, 2, 5};

        int max1 = findMax(array1);
        int max2 = findMax(array2);

        System.out.println("напишите метод нахождения максимального числа из массива. Тестовые значения:");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println();
        System.out.println(max1);
        System.out.println(max2);
    }
    public static int findMax(int[] array){
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
