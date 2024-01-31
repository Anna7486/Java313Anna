package lesson11;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        /*String s = "я ищу совпадения в 2024 году. и я их найду в 2 счёта.";
        String pattern = "[^А-яЁё]"; // [^...] - все кроме заданных символов
                                    // [a-g&&[k-n]] - пересечение символов
                                    // [a-g&&[^k-n]] - вычитание символов (все кроме [k-n])
//        String pattern = "[А-яЁё\\]\\[-]"; // [А-Яя-яЁё]
//        String pattern = "[2024]"; // [...] - один символ из перечисленных
//        String pattern = "[0 - 9]"; // [0 - 9] - диапазон символов
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
//        System.out.println(matcher.find());
        while (matcher.find()){
//            System.out.println("шаблон совпадения найден с " + matcher.start() + " по " + matcher.end());
//            System.out.println(s.substring(matcher.start(), matcher.end()));
            System.out.println(matcher.group());
        }
        String str = "ЁАЯфяё";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + ": " + str.codePointAt(i));
        }
        char a = 1025;
        System.out.println(a);*/

       /* try {
            String s = "Час в 24-часовом формате от 00 до 23. 2021-06-15Т21:45. Минуты, в диапазоне от 00 до 59. 2021-06-15Т01:09";
            String pattern = "[0-2][0-9]:[0-5][0-9";
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(s);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException pse){
            System.err.println("неправильное регулярное выражение: " + pse.getMessage());
            System.err.println("описание: " + pse.getDescription());
            System.err.println("позиции: " + pse.getIndex());
            System.err.println("неправильный шаблон: " + pse.getPattern());
        }*/

        /*
//        String s = "Я ищу совпадение в 2024 году. И я их найду в 2 счёта. 198765 Ели[-ели]. Hello_World";
//        String s = "цифры: 7, +17, -42, 0013, 0.3";
        String s = "ghghgh=fhfhfh f.f.; fjff=fjfjf fhfh; fhfhf=200; hfhf=1830";
        String pattern = "\\w+\\s*=\\s[^;]+";
//        String pattern = "[+-]?[\\d.]+";
//        String pattern = "20?";
        // + - от 1 до бесконечности (\d+)
        // * - от 0 до бесконечности
        // ? - от 0 до 1
        // \\d == [0-9] - одна любая цифра
        // \\s == [ ] - один пробельный символ
        // \\w == [A-Za-z0-9_] - один символ - буквы(только англ., регистронезависимые), цыфры и символ подчеркивания
        // \\A - поиск шаблона от начала строки
        // \\Z - поиск шаблона в конце строки
        Pattern regax = Pattern.compile(pattern);
        Matcher matcher = regax.matcher(s);
        while (matcher.find()){
            System.out.print(matcher.group() + "    ");
        }*/

      /*  String s = "12 сентября 2024 года";
        String pattern = "\\d{2,4}";
        // {4} - 4 повторений
        // {2,} - 2 повторений до бесконечности
        // {2,4} - от 2 повторений до 4(включительно)
        Pattern regax = Pattern.compile(pattern);
        Matcher matcher = regax.matcher(s);
        while (matcher.find()){
            System.out.print(matcher.group() + "    ");
        }*/

        /*String s = "";
        String pattern = "\\+?7\\d{10}";
        Pattern regax = Pattern.compile(pattern);
        Matcher matcher = regax.matcher(s);
        while (matcher.find()){
            System.out.print(matcher.group() + "    ");
        }*/

        Scanner input = new Scanner(System.in);
//        String s = "I learning Java";
//        String pattern = "\\w+\\s\\w+$";
        // ^ - строка должна начинаться с заданного шаблона
        // $ - строка должна заканчиваться на заданный шаблон
//        String s = "Java_master!!!";
//        String pattern = "^[\\w-]{3,16}$"; // буквы, цифры, _ , - , от 3 до 16
//        String s = "fiidkvbdkb biehi eiebfbd 83737 jfhbd";
//        String pattern = "h";

//        String s = input.nextLine();
//        String pattern = "\\d #поиск цифр";
//        Pattern regax = Pattern.compile(pattern, Pattern.COMMENTS);//CASE_INSENSITIVE | Pattern.UNICODE_CASE);
//        Matcher matcher = regax.matcher(s);
//        int count = 0;
//        while (matcher.find()) {
//            count++;
//        }
//        System.out.println("кол-во цифр во введенном тексте: " + count);

       /* String s = "one\ntwo";
//        String pattern = "one.\\w+";
        String pattern = "one$";
//        Pattern reges = Pattern.compile(pattern, Pattern.DOTALL);
        Pattern reges = Pattern.compile(pattern, Pattern.MULTILINE);
        Matcher matcher = reges.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group() + "\t\t");
        }*/

        /*String s = "Goods - $500";
        String pattern = "$500";
        Pattern reges = Pattern.compile(pattern, Pattern.LITERAL);
        Matcher matcher = reges.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group() + "\t\t");
        }*/

       /* String s = "Java,\njava,\nJAVA";
        String pattern = "(?i)^java";
        Pattern reges = Pattern.compile(pattern);
        Matcher matcher = reges.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group() + "\t\t");
        }
        */

       /* String s = "123456@i.ru, 123_456@ru.name.ru, login@i.ru, логин-1@i.ru, login.3@i.ru, login.3-67@i.ru,";
        String pattern = "[а-я\\w.-]+@[\\w.]+.ru";
        Pattern reges = Pattern.compile(pattern);
        Matcher matcher = reges.matcher(s);
        while (matcher.find()){
            System.out.print(matcher.group() + "\t\t");
        }*/

        /*String s = "Егорова Алиса Александровна";
        String pattern = "А.+?а";
//        String s = "12 сентября 2024 года 2345668";
//        String pattern = "\\d{2,4}?";
//        String s = "<body>Пример жадного соответствия регулярных выражений</body>";
//        String pattern = "<.*>";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()){
            System.out.print(matcher.group() + "\t\t");
        }*/

        /*String s = "Word2016, PS6, AI5";
        String pattern = "([a-z]+)(\\d*)";
        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group() + "\t\t");
            System.out.println(matcher.group(1)); // 1 скобки
            System.out.println(matcher.group(2)); // 2 скобки
        }*/

        /*String s = "abc";
        String pattern = "(.(.(.)))";
        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = regex.matcher(s);
        matcher.find();
        System.out.println(matcher.groupCount());
        for (int i = 0; i < matcher.groupCount(); i++) {
            System.out.println(i + ": " + matcher.group(i));
        }*/

        /*
//        String s = "Ольга и Виталий отлично учатся!";
//        String pattern = "Пётр|Ольга|Виталий";
        String s = "int = 4, float = 4.0f, double = 8.0";
//        String pattern = "\\w+\\s*=\\s*\\d[.\\w]*";
//        String pattern = "int\\s*=\\s*\\d[.\\w]*|float\\s*=\\s*\\d[.\\w]*";
//        String pattern = "int|float\\s*=\\s*\\d[.\\w]*";
        String pattern = "(int|float)\\s*=\\s*(\\d[.\\w]*)";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }*/

        /*String s = "127.168.255.255";
        String pattern = "(\\d{1,3}.){3}\\d{1,3}";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
        }*/

        /*String s = "18-10-2024";
        String pattern = "(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(19[0-9][0-9]|20[0-9][0-9])";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
        }*/

        /*String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта.";
        String[]arr = s.split("\\.");
        for (String temp:arr) {
            System.out.println(temp);
        }*/

//        String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта.";
//        String[]arr = s.split("[.2]");
//        for (String temp:arr) {
//            System.out.println(temp);
//        }
//        Pattern p = Pattern.compile("");
//        String[]arr = p.split("Суворова Виктория, Россия, г.Сочи, +7 999 555-77-33");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        String s = "05-03-1987 // дата рождения";
//        String s2 = s.replaceAll("\\s*//.*","");
//        String s2 = s.replaceAll("\\s*//.*","").replaceAll("-",".");
//        System.out.println("Дата рождения: " + s2);
//        System.out.println("Дата рождения: " + s2);


        /*//побитовые операторы

        //побитовое И
        System.out.println(0b111 & 0b000); // 7 & 0 =>0
        System.out.println(0b111 & 0b001); // 7 & 1 =>1
        System.out.println(0b111 & 0b010); // 7 & 2 =>2

        System.out.println(7 & 0);
        System.out.println(7 & 1);
        System.out.println(7 & 2);

        //побитовое ИЛИ
        System.out.println(0b101 | 0b010); // 5 | 2 (0b111) =>7
        System.out.println(0b011 | 0b100); // 3 | 4 (0b111) =>7
        System.out.println(0b010 | 0b100); // 2 | 4 (0b110) =>6

        //исключающее побитовое ИЛИ
        System.out.println(0b110 ^ 0b101); // 6 ^ 5 (0b011) => 3
        System.out.println(0b101 ^ 0b010); // 5 ^ 2 (0b111) => 7
        System.out.println(0b100 ^ 0b111); // 4 ^ 7 (0b011) => 3

        // побитовое НЕ
        System.out.println(~0b0);
        System.out.println(~0b1);
        System.out.println(~0);
        System.out.println(~1);*/

        /*System.out.println("Введите число: ");
        int number = input.nextInt();
        if ((number & 1) == 0){
            System.out.println(number + " - четное число");
        }
        if ((number & 1) == 1){
            System.out.println(number + " - нечетное число");
        }*/

        /*int x = 1;
        double y = 3.1515d;
//        x = (int)(x + y);
        x += y;
        System.out.println(x);*/

        /*int x = 5, y = 7;
        System.out.println("x = " + x + ", y = " + y);

//        x = x ^ y;
//        y = x ^ y;
//        x = x ^ y;

        y ^= (x ^= y);
        x ^= y;
        System.out.println("x = " + x + ", y = " + y);

        System.out.println(0b101 >> 1);
        System.out.println(5 >> 2);*/

        System.out.println("Проверка изменений на GitHub");






    }
}
