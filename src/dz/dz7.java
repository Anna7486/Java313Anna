package dz;

import java.util.Scanner;

public class dz7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int height = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == height - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
