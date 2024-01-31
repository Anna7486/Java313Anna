package dz;
import java.util.Arrays;
public class dz10 {
    public static void main(String[] args) {
        int[][] array = new int[6][6];
        int[] arr = new int[6];
        System.out.println("двумерный массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 11);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("одномерный массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 11);
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n");
        for (int i = 0; i < array.length; i++) {
                if ((i + 1) % 2 == 0) {
                    array[i] = arr.clone();
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j] + "\t");
                    }
                }else{
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j] + "\t");
                    }
                }
                System.out.println();
            }
        }
    }
