package lesson5;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.time.chrono.MinguoDate;
import java.util.Date;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int a, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE,sum = 0, count = 0;
//        do {
//            System.out.println("введите число: ");
//            do {
//                a = input.nextInt();
//                if (a < 0){
//                    System.out.println("вы ввели отрицательное число\nвведите положительное число: ");
//                }
//            }while (a < 0);
//            if (a < min && a != 0){
//                min = a;
//            } if (a > max){
//                max = a;
//            }
//            sum += a;
//            if (a != 0){
//                count++;
//            }
//        }while (a != 0);
//        if (sum != 0){
//            System.out.println("минимальное число: " + min);
//            System.out.println("максимальное число: " + max);
//            System.out.printf("среднее арифметическое: %.2f", (double) sum / count);
//        } else {
//            System.out.println("вы вводили только отрицательные числа");
//        }


//        int i = 1;
//        while (i < 5){
//            System.out.println("внешний цикл: i = " + i);
//            int j = 1;
//            while (j < 4){
//                System.out.println("\tвнутренний цикла: j = " +j);
//                j++;
//            }
//            i++;
//        }


//        int i = 1;
//        while (i < 10){
//            int j = 1;
//            while (j < 10){
//                System.out.print(i + "*" + j + "=" + i * j + "\t\t");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        int i = 0;
//        while (i < 3){
//            int j = 0;
//            while (j < 6){
//                System.out.print("^");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        int i = 0;
//        while (i < 5){
//            int j = 0;
//            while (j < 16){
//                if (i % 2 == 0) {
//                    System.out.print("+");
//                } else{
//                    System.out.print("-");
//                }
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        int i = 0;
//        while (i < 5){
//            int j = 0;
//            while (j < i){
//                System.out.print(" ");
//                j++;
//            }
//            System.out.println("*");
//            i++;
//        }


//        for (int i = 0; i < 5; i++){
//            System.out.println(i);
//        }


//        int count = 0;
//        for (int i = 0; i < 6; i++){
//            System.out.print("-> ");
//            if (input.hasNextInt()){
//                count++;
//            }
//            input.nextLine();
//        }
//        System.out.println("вы ввели чисел: " + count);


//        System.out.println("Введите кол-во символов: ");
//        int a = input.nextInt();
//        for (int i = 0; i < a; i++) {
//            System.out.print("*");
//        }


//        int i, num;
//        System.out.print("Введите целое число: ");
//        num = input.nextInt();
//        for (i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                System.out.println("Делится на" + i);
//            }
//        }


//        int i = 10;
//        for (;;){ //i < 100
//            System.out.print(i + " ");
//            if (i == 90){
//                break;
//            }
//            i += 10;
//        }


//        int n, res = 1;
//        for (;true;){
//            System.out.print("-> ");
//            n = input.nextInt();
//            if (n == 0){
//                break;
//            }
//            res *= n;
//        }
//        System.out.println("произведение введенных чисел: " + res);


//        for (int i = 5, a = 1; i > 0; i--, a++){
//            System.out.println( a + ") значения: " + i);
//        }


//        for (int x = 0, y = 0; x < 5; x++, y--){
//            System.out.println("x: "+ x +", y: " + y);
//        }


//        for (int i = 10; i <= 100; i++) {
//            if (i % 11 == 0) {
//                System.out.print(i + " ");
//            }


//        for (int i = 10; i <= 100; i++) {
//            if (i % 10 == i / 10) {
//                System.out.print(i + " ");
//            }

//        for (int i = 0; i < 3; i++) {
//            System.out.println("+++" + i);
//            for (int j = 0; j < 2; j++) {
//                System.out.println("----" +j);
//            }
//        }


//        int w, h;
//        System.out.print("введите ширину прямоугольника: ");
//        w = input.nextInt();
//        System.out.print("введите высоту прямоугольника: ");
//        h = input.nextInt();
//
//        for (int i = 0; i < h; i++){
//            for (int j = 0; j < w; j++){
//                if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//        int size = 8;
//        for (int i = 0; i < size; i++){
//            for (int j = 0; j < size; j++){
//                if (j <= i){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }


//        int h = 7;
//        int w = h * 2 - 1; // -1 добавим позже
//        int m = w / 2; // середина строки
//        for (int i = 0, l = m, r = m; i < h; i++, r++, l--) {
//            for (int j = 0; j < w; j++) {
//                if (j >= l && j <= r) {
//                    System.out.print("*");
//                } else {
//                    System.out.print("-");
//                }
//            }
//            System.out.println();
//        }


//        int size = 7;
//        for (int i = 0; i < size; i++){
//            for (int j = 0; j < size; j++){
//                if (j >= i){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }


//        int mas[] = new int [] { 2, 7, 5, 3};
//        int mas[] = { 2, 7, 5, 3};

//        int mas[] = new int[5];
//        mas[0] = 5;
//        mas[1] = 2;
//        mas[2] = 7;
//        mas[3] = mas[1] + mas[2];
//       /* System.out.println(mas[0]);
//        System.out.println(mas[1]);
//        System.out.println(mas[2]);
//        System.out.println(mas[3]);
//        System.out.println(mas.length);
//        int last = mas[mas.length - 1]; // mas[3]
//        System.out.println(last);*/
//        for (int i = 0; i < mas.length; i++){
//            System.out.println(mas[i]);
//        }


//        int n = 100;
//        int[] a = new int[n * 2 + 3];
//        System.out.println(a.length);


//        int n = 10;
//        int[] a = new int[n];
//        a[n - 1] = 2; // a[9] = 2
//        a[n - 2] = 3; // a[8] = 3
//        a[n /5] = a[n - 1] + a[n - 2]; // a[2] = a[9] + a[8] => 5
//        for (int i = 0; i < a.length; i++){
//            System.out.println(a[i]);
//        }


//        int[] array = new int[4];
//        System.out.print("-> ");
//        array[0] = input.nextInt();
//        System.out.print("-> ");
//        array[1] = input.nextInt();
//        System.out.print("-> ");
//        array[2] = input.nextInt();
//        System.out.print("-> ");
//        array[3] = input.nextInt();
//
//        for (int i = 0; i < array.length; i++){
//            System.out.print(array[i] + " ");
//        }

//        for (int i = 0; i < array.length; i++){
//            System.out.print("=> ");
//            array[i] = input.nextInt();
//        }
//
//        for (int i = 0; i < array.length; i++){
//            System.out.print(array[i] + " ");
//        }


//        int a;
//        System.out.print("введите кол-во массива: ");
//        a = input.nextInt();
//
//        int[] array;
//        if (a > 5) {
//            array = new int[a];
//
//        } else {
//            array = new int[a];
//            for (int i = 0; i < array.length; i++) {
//                System.out.print("-> ");
//                array[i] = input.nextInt();
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }


//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//        }


//        int[] array = {1, 4, 6, 3, 8};
//        System.out.println(Arrays.toString(array));


//        int n, sum = 0;
//        System.out.print("n = ");
//        n = input.nextInt();
//
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++){
//            System.out.print("=> ");
//            array[i] = input.nextInt();
//            if (array[i] < 0){
//                sum += array[i];
//            }
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("сумма отр значений: " + sum);


//        int n;
//        System.out.print("n = ");
//        n = input.nextInt();
//
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++){
//            System.out.print("=> ");
//            array[i] = input.nextInt();
//        }
//        int min = array[0];
//        for (int i = 0; i < array.length; i++){
//            if (array[i] != min){
//                min = array[i];
//            }
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("мин элемент массива: " + min);


//        System.out.print("введите начало диапазона: ");
//        int k = input.nextInt();
//        System.out.print("введите конец диапазона: ");
//        int n = input.nextInt();
//
//        int [] array = new int[n - k + 1];
//        for (int i = 0, j = k; i <= n - k; i++, j++){
//            array[i] = j;
//            System.out.print(array[i] + "\t");
//        }
//        System.out.println(Arrays.toString(array));


//        int[] a1 = {1, 2, 3, 4};
//        int[] a2 = new int[a1.length + 5];
//        for (int i=0; i< a1.length; i++){
//            a2[i] = a1[i];
//        }
//        a1[0] = 5;
//        System.out.println("\n" + Arrays.toString(a1));
//        System.out.println("\n" + Arrays.toString(a2));


//        Math.random() * (max-min) + min формула не включительно
//        Math.random() * (max-min) + 1 + min формула включительно
//
//        double a = Math.random() * 3; //ot 0 go 9
//        System.out.println(a);
//        double b = 2 + Math.random() * 5; // ot 2 go 7
//        System.out.println(b);
//        double c = 2 + Math.random() * 10 - 5; // ot -5 go 5
//        System.out.println(c);

//        int a = (int) (Math.random() * 3);
//        System.out.println(a);
//        int b = (int) (Math.random() * 2 + 3);
//        System.out.println(b);
//        int c = (int) (Math.random() * 10 + 1 - 5); // ot -5 go 5
//        System.out.println(c);
//        int d = (int) (Math.random() * 6 + 1 - 2);
//        System.out.println(d);

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++){
////            array[i] = (int) (Math.random() * 10);
////            array[i] = (int) (Math.random() * 12 + 2);
//            array[i] = (int) (Math.random() * 31 - 15);
//        }
//        System.out.println(Arrays.toString(array));


//        int sum = 0, count = 0;
//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 40 + 10);
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++){
//            if (array[i] % 2 == 0){
//               count++;
//            }else{
//                sum += array[i];
//            }
//        }
//        System.out.println("кол-во четных элементов: " + count);
//        System.out.println("сумма нечетных элементов: " + sum);


//        int [] numbers = {10, 20, 30, 40, 50};
//        for (int i = 0; i < numbers.length; i++){
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//        for (int x:numbers) {
//            System.out.println("Элемент массива: " + x);
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(numbers));


//        String[] names = {"Олег", "Иван", "Дима", "Юля"};
//        for (String name:names) {
//            System.out.println(name);
//        }


//        String[] cities = {"Брянск", "Минск", "Саратов", "Хабаровск"};
//
//        String[] cities2 = new String[cities.length + 1];
//        for (int i = 0; i < cities.length; i++) {
//            cities2[i] = cities[i];
//        }
//        cities2[cities.length] = "Красноярск";
//        cities[0] = "Сочи";
//        System.out.println(Arrays.toString(cities));
//        System.out.println(Arrays.toString(cities2));

//        ArrayList <String> cities = new ArrayList<>();
//        cities.add("Брянск"); //добавляет элемент в массив
//        cities.add("Красноярск");
//        cities.add("Иркутск");
//        cities.add("Армавир");
//        cities.add(1,"Владивосток");
//        cities.add("Армавир");
//
//        System.out.print(cities.get(2)); // получает значение по заданному индексу
//
//        for (String city : cities){
//            System.out.println(city);
//        }
//        System.out.print("\n" + cities.indexOf("Владивосток")); //получаем индекс элемента по заданному значению
//
//        cities.set(2, "Курск"); //устанавливаем новое значение
//
//        cities.remove(1);
//        for (String city : cities){
//            System.out.println(city);
//        }
//
//        if (cities.contains("Курск")){ // проверка на существование элементов в массиве ArrayList
//            System.out.println("ArrayList содержит Курск");
//        }
//        System.out.println(cities.contains("Курск"));
//
//        System.out.println(cities.size());
//
//        for (int i = 0; i < cities.size(); i++) {
//            System.out.println(cities.get(i));
//        }
//        cities.remove("Красноярск");


//        int n, k;
//        ArrayList<Integer> mas = new ArrayList<>();
//        System.out.println("Введите элементы списка. Условие выхода 0 или отрицательное число:");
//        while ((n = input.nextInt()) > 0){
//            mas.add(n);
//        }
//        System.out.print("введите индекс: ");
//        k = input.nextInt();
//        mas.remove(k);
//
//        for (int m:mas) {
//            System.out.print(m + "\t");
//        }


//        int max, ind;
//        ArrayList<Integer> mas = new ArrayList<>();
//        for (int i = 0; i < 10; i++){
//            mas.add((int)(Math.random() * 100));
//        }
//        for (int m:mas) {
//            System.out.print(m + "\t");
//        }
//        max = mas.get(0);
//
//        for (int i = 0; i < 10; i++) {
//            if (mas.get(i) > max){
//                max = mas.get(i);
//            }
//        }
//        System.out.println("\nMax: " + max);
//        ind = mas.indexOf(max);
//        System.out.println("index: " + ind);
////        mas.remove(ind);
//        mas.remove(max);
//        mas.add(0,max);
//
//        for (int m:mas) {
//            System.out.print(m + "\t");
//        }


//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55));
//        ArrayList<Integer> c = new ArrayList<>();
//
//        if (a.size() > b.size()) {
//            for (int i = 0; i < a.size(); i++) {
//                c.add(a.get(i));
//                c.add(b.get(i));
//            }
//        }else {
//            for (int i = b.size(); i < a.size(); i++) {
//                c.add(b.get(i));
//            }
//        }
//
//            for (int m : c) {
//                System.out.print(m + "\t");
//            }


//        int[][] num = {{0,1,2,3}, {4,5,6,7}, {8,9,10,11}};
//        System.out.println(num.length); // 3
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(Arrays.toString(num[i]));
//        }
//        System.out.println(num[1][3]);
//        for (int i = 0; i < num.length; i++) { // i=0, i<3
//            for (int j = 0; j < num[i].length; j++) { // j<4
//                System.out.print(num[i][j] + "\t"); // num[0][0]
//            }
//            System.out.println();
//        }


//        int  [][] num = {{1,2,3,4},{5,6,7,8},{9,10,11,12} };
//
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                System.out.print(num[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                System.out.print(num[i][j]*num[i][j]+ " ");
//            }
//            System.out.println();
//        }


//        int n = 5, m = 7;
//        char[][] graph = new char [n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                graph[i][j] = '*';
//                System.out.print(graph[i][j] + "  ");
//            }
//            System.out.println();
//        }


//        int n = 3, m = 4, count = 0;
//        int[][] mas = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                mas[i][j] = (int)(Math.random() * 31 - 20);
//                if (mas[i][j]<0){
//                    count++;
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        System.out.println("кол-во отрицательных элементов: " + count);


//        int [] array = new int[10];
//        int c;
//        for (int i = 0; i < array.length; i++) {
//            c = (int) (Math.random() * 10);
//            int j = 0;
//            while (j<i){
//                if (c !=array[j]){
//                    j++;
//                }else {
//                    c = (int) (Math.random() * 10);
//                    j = 0;
//                }
//            }
//
//            array[i] = c;
//        }
//        System.out.println(Arrays.toString(array));


//        int sum = Integer.MAX_VALUE;
//        int tm = 0, n = 1;
//        int arr[][] = new int[3][5];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = (int) (Math.random() * 100);
//                System.out.print(arr[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                tm += arr[i][j];
//            }
//            if (sum > tm){
//                sum = tm;
//                n = i;
//            }
//            System.out.println("Сумма элементов " + (i + 1) + " строки: " + sum);
//            tm = 0;
//        }
//        System.out.println("\nСтрока с минимальной суммой элементов: " + sum + " имеет номер " + (n+1));


//        int[][] mas = new int[3][];
//        mas[0] = new int[2];
//        mas[1] = new int[3];
//        mas[2] = new int[4];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = input.nextInt();
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();



//        int[][] mas = new int[3][];
//        mas[0] = new int[] {1,2};
//        mas[1] = new int[] {3,4,5};
//        mas[2] = new int[] {6,7,8,9};
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }


//        int[][] mas1 = new int[][] {{1,2}, {3,4,5}, {6,7,8,9}};
//        for (int i = 0; i < mas1.length; i++) {
//            for (int j = 0; j < mas1[i].length; j++) {
//                System.out.print(mas1[i][j] + "\t\t");
//            }
//            System.out.println();
//        }


//        int n = 5;
//        int arr[][] = new int[n][];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new int[i + 1];
//        }
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = count++;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t\t");
//            }
//            System.out.println();
//        }



//        int n = 5;
//        int arr[][] = new int[n][];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new int[(arr.length - i)];
//        }
//        int count = 10;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = count++;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t\t");
//            }
//            System.out.println();
//        }


//        int n = 5;
//        int tp[][] = new int[n][];
//        for (int i = 0; i < n; i++) {
//            tp[i] = new int[i + 1];
//            tp[i][0] = 1;
//            tp[i][i] = 1;
//            for (int j = 1; j < i; j++) {
//                tp[i][j] = tp[i-1][j-1] + tp[i-1][j];
//            }
//        }
//        for (int i = 0; i < tp.length; i++) {
//            for (int j = 0; j < n - i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < tp[i].length; j++) {
//                System.out.print(tp[i][j] + "   ");
//            }
//            System.out.println();
//        }












//        float num = 5.55f;
//        System.out.println(Math.PI);
//        System.out.println(Math.round(num));
//        System.out.println(Math.ceil(num));
//        System.out.println(Math.floor(num));
//        System.out.println(Math.sqrt(4));
//        System.out.println(Math.pow(4, 2));


//        System.out.print("Введите радиус окружности: ");
//        int radius = input.nextInt();
//        System.out.printf("Длина окружности: %.2f", + 2 * Math.PI * radius);


//        System.out.print("катет 1: ");
//        int rat1 = input.nextInt();
//        System.out.print("катет 2: ");
//        int kat2 = input.nextInt();
//        System.out.println("гипотенуза: " + Math.hypot(rat1,kat2));


//        Date current = new Date(105, 2, 21, 15, 3, 0);
//        System.out.println(current);
//        System.out.println(current.getYear());
//        System.out.println(current.getMonth());
//        current.setMonth(5);
//        System.out.println(current);
//        System.out.println(current.getTime());
//        System.out.printf("%1$s %2$td %2$tB %2$tY %n","дата:", current);
//        System.out.printf("%s %te %<tB %<tY %n","дата:", current);
//        current.setTime(Date.parse("Jul 06 12:15:00 2021"));
//        System.out.println(current);






//        Calendar calendar = new GregorianCalendar(2022, 03, 12);
////        System.out.println(calendar);
//        System.out.println(calendar.get(Calendar.ERA));
//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.MONTH));
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(calendar.get(Calendar.HOUR));
//
//        GregorianCalendar calendar1 = new GregorianCalendar(2024,03,12);
//        int year = calendar1.get(Calendar.YEAR);
//        System.out.println(calendar1.isLeapYear(year));
//        System.out.println(calendar1.get(Calendar.MONTH));
//        System.out.println(calendar1.getActualMaximum(Calendar.DAY_OF_MONTH));


//        Calendar date1 = new GregorianCalendar();
//        Calendar date2 = new GregorianCalendar();
//        date1.set(Calendar.YEAR, 2000);
//        int year1 = date1.get(Calendar.YEAR);
//        int year2 = date2.get(Calendar.YEAR);
//        System.out.println(year2 - year1);


//        Calendar calendaar = new GregorianCalendar(2024,Calendar.FEBRUARY,28);
////        calendaar.add(Calendar.DAY_OF_MONTH,2);
////        calendaar.add(Calendar.DAY_OF_MONTH,-2);
//        calendaar.roll(Calendar.MONTH,-2);
//        System.out.println(calendaar.getTime());


//        Calendar calendar = new GregorianCalendar();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE,d MMMM,YYYY");
//        System.out.println(dateFormat.format(calendar.getTime()));

//        long start = System.currentTimeMillis();
//        System.out.println(start);
//
//        for (int i = 0; i <= 100; i++) {
//            System.out.println("случайное число: " + i + ": " + (int)(Math.random() * 10));
//        }
//
//        long timeWorkProgram = System.currentTimeMillis() - start;
//        System.out.println("скорость выполнения программы: " + timeWorkProgram + " миллисекунд");







    }
}
