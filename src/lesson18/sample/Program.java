package lesson18.sample;

public class Program {
    public static void main(String[] args) {
        String text = "Лямбда выражения";
        System.out.println("Исходная строка: " + text);
        WordCounter wordCounter = (s) -> s.split("\\s+").length;
        int ctr = wordCounter.countWords(text);
        System.out.println("кол-во слов: " + ctr);

        text ="Программа, которая подсчитывает количество слов в предложении ";
        wordCounter = (s) -> s.split("о+").length - 1;
        System.out.println("\nИсходная строка: " + text);
        ctr = wordCounter.countWords(text);
        System.out.println("кол-во слов: " + ctr);
    }
}

interface WordCounter{
    int countWords(String tx);
}
