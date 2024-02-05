package dz;

import java.util.Scanner;

public class dz18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("введите количество символов: ");
        int size = input.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0){
                    System.out.print("X  ");
                }else {
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
    }
}
