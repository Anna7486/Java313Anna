package lesson16.ganecs;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {2,1,5,3,4};
        Double[] doubleArray = {3.3,2.2,1.1,4.4};
        Character[] charArray = {'G', 'e', 'n', 'e', 'r', 'i', 'c'};
        System.out.println("массив integerArray содержит: ");
        printArray(intArray);
        System.out.println("массив doubleArray содержит: ");
        printArray(doubleArray);
        System.out.println("массив charArray содержит: ");
        printArray(charArray);
    }

    public static <T> void printArray(T[]inputArray){
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
