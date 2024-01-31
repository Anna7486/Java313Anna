package lesson8;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        /*System.out.print("на каком вы этаже: ");
        int n1 = input.nextInt();
        elevator(n1);

    }
    public static void elevator(int n){
        if(n == 0){
            System.out.println("вы в подвале");
            return;
        }
        System.out.println("=> " + n);
        elevator(n - 1);
        System.out.print(n + " ");*/

        /*int[] mas = {1,3,5,7,9};
        System.out.println(sumList(mas));
    }
    public static int sumList(int[] arr){
        int sum = 0;
        for (int i:arr) {
            sum += i;
        }
        return sum;*/

        /*int[] mas = {1,3,5,7,9};
        System.out.println(sumList(0,mas));
    }
    public static int sumList(int i, int[] arr) {
        if (i == (arr.length - 1)) { //0 == 5(длина массива) - 1
            return arr[i];
        }
        return arr[i] + sumList(i + 1, arr); //1 + 3 + 5 + 7 + 9*/

        /*System.out.println(toStr(254, 10));
    }
    public static String toStr(int n, int base){ // 25
        String[] convert = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        if (n < base){ // 254 < 10
            return convert[n];
        }else{
            return toStr(n/base, base) + convert[n % base]; // convert[4] = "4"
        }*/

        int size;
        System.out.print("введите размер массива: ");
        size = input.nextInt();
        int[] list = new int[size];

        int option;
        do {
            System.out.println("меню:");
            System.out.println("1. ввод элементов массива");
            System.out.println("2. отображение массива");
            System.out.println("3. поиск элементов в массиве");
            System.out.println("4. сортировка массива");
            System.out.println("5. выход");
            System.out.print("сделайте свой выбор: ");
            option = input.nextInt();

            switch (option){
                case 1:
                    readArray(list);
                    break;
                case 2:
                    displayArray(list);
                    break;
                case 3:
                    System.out.print("введите номер, который вы хотите найти: ");
                    int item = input.nextInt();
                    int index = searchArray(list, item);
                    if (index == -1){
                        System.out.println("элемент не найдет");
                    }else {
                        System.out.println("элемент найдет на позиции " + (index + 1));
                    }
                    break;
                case 4:
                    System.out.println("отсортированный массив: ");
                    sortArray(list);
                    displayArray(list);
                    break;
            }
        }while (option != 5);
    }
    public static void readArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("-> ");
            array[i] = input.nextInt();
        }
    }
    public static void displayArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " \n");
        }
    }
    public static int searchArray(int[] array, int data){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data){
                return i;
            }
        }
        return -1;
    }
    public static void sortArray(int[] array){
        for (int i = 0; i < array.length -1; i++) { //[8,6,7] i=0 i<3 => [6,8,7]
            for (int j = 0; j < array.length - i - 1; j++) { //j=0 j<2
                if (array[i] > array[j + 1]){
                    int temp = array[j]; //8
                    array[j] = array[j + 1]; //6
                    array[j + 1] = temp; //8
                }
            }
        }
    }
}
