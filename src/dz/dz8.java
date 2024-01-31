package dz;

import java.util.Arrays;
import java.util.Scanner;

public class dz8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int n;
        System.out.print("введите элементы массива: \nn = ");
        n = input.nextInt();
        int[] array = new int[n];
        System.out.print("-> ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
            System.out.print("-> ");
            }

        for (int i = 1; i < n; i++) {

            if (array[i] > array[i - 1]){
                System.out.print(array[i] + "\t");
            }
        }



    }
}
