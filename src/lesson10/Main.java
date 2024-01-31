package lesson10;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*String str1 = "hello";
        String  str2 = "world";
        String message = str1 + " " + str2;
        System.out.println(message);

        char[] helloArray = {'п', 'р', 'и', 'в', 'е', 'т', '.'};
        String helloString = new String(helloArray);
        System.out.println(helloString);*/

        /*String str = "hello";
        int a = 5;
        String newStr = a + str;
        System.out.println(newStr);

        int b = 3;
        String st = b + " ";
        System.out.println(st);

        String str = "2";
        int a = Integer.parseInt(str);
        System.out.println(a);

        int b = Integer.parseInt("789");
        System.out.println(b);*/

        /*String name = "hello";
       int count = (name + 57).length(); // длина строки
        System.out.println(count); // 5

        int count1 = "".length();
        System.out.println(count1);*/

        /* String name = "Nikita";
//        String name2 = name.toLowerCase(); //преобразование символов в строке в нижний регистр
//        String name2 = name.toUpperCase(); //преобразование символов в строке в верхний регистр
//        System.out.println(name.toUpperCase());
//        System.out.println(name);
        char res = name.charAt(2); // возвращает символ, расположенный по указанному индексу в строке
        System.out.println(res);*/

        /*String text = "частотный словарь буквы русского алфавита. " +
                "создадим массив нужной длины и будем хранить в соответствующих " +
                "позициях количество вхождений символов";
        String text = "привет";
        System.out.println(text);
        text = text.toLowerCase();
        int[] result = new int['я' - 'а' + 1];
        System.out.println(result);
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'а' && ch <= 'я'){
                result[ch - 'а']++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println((char) (i + 'а') + " = " + result[i]);
        }*/

        /* String s1 = "";
        if (s1.isEmpty()){  //s1.length() == 0 строка является пустой
            System.out.println("пустая строка");
        }*/

        /*String str = "ABC";
        char[] res = str.toCharArray(); // преобразование строки в массив символа

        for (int i = 0; i < res.length; i++) {
            System.out.println("элемент [" + i +"]: " + res[i]);
        }*/

        Scanner input = new Scanner(System.in);

        /*System.out.print("введите адрес сайта: ");
        String path = input.nextLine();

        char[] chars = path.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '/') {
                chars[i] = '\\';
            }
        }
        String  res = new String(chars);
        System.out.println(res);*/

        /*String str = "i learning java";
        System.out.println(str);
        System.out.println(str.indexOf('a')); //ищет первое вхождение символа или подстроки и возвращает -1, если совпадение не найдено
//        System.out.println(str.indexOf("java1"));
        System.out.println(str.lastIndexOf('a', 5)); //с конца
        System.out.println(str.indexOf('a', 5)); // с начала
        System.out.println("   hello world".trim()); // убирает пробельные символы и слева и справа */

        /*String str = "i java learning java program";
//        System.out.println(str.substring(2)); //получение подствроки из строки
//        System.out.println(str.substring(2, 10));
        String[] words = str.split("java");
        for (String word : words){
            System.out.println(word);
        }*/

        /*System.out.print("введите ФИО: ");
        String fio = input.nextLine();
        String[] res = fio.split(" ");
        System.out.println(res[0] + " " + res[1].charAt(0) + "."  + res[2].charAt(0) + ".");*/

        /*String res = String.join(":", "00", "23", "30");
        System.out.println(res);

        String[] text = new String[]{"hello", "world"};
        String str = String.join(" ", text);
        System.out.println(str);

        String text = "я изучаю c++. мне нравится c++";
        System.out.println(text);
        String[] array = text.split("c\\+\\+");
        String res = String.join("java", array);
        System.out.println(res);
        String tx = text.replace("c++", "java");
        System.out.println(tx);*/

        /*String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HELLO";
        System.out.println(s1.equals(s2)); //сравнение строк на равенство (регистронезависимое)
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println("I learning Java".endsWith("Java")); //заканчивается ли строка заданной подстрокой
        System.out.println("I learning Java".startsWith("I")); //начинается ли строка на заданную подстроку
        System.out.println("I learning Java".contains("ing")); //содержит ли строка заданную подстроку*/

        /* System.out.println("введите название документа: ");
        String path = input.nextLine();
        if (path.endsWith(".jpg") || path.endsWith(".jpeg") || path.endsWith(".png")){
            System.out.println("это изображение");
        } else if (path.endsWith(".docx") || path.endsWith(".doc")) {
            System.out.println("это документ Word");
        } else {
            System.out.println("это неизвестный формат");
        }*/

        /*String s = "I learning Java";
        int n;
        n = s.codePointAt(5); //код символа по его индексу в строке
        System.out.println(n);
        n = s.codePointBefore(5); //код символа, который идет перед указанным символом
        System.out.println(n);
*/

        /* String s;
//        double d = 3.8567;
//        int d = -3982;
//        char d = '+';
        boolean d = true;
        s = String.valueOf(d);
        System.out.println(s);*/

        /*  String str = "1";
        System.out.println("1 > 2 : " + str.compareTo("2")); // -1 // лексикографическое сравнение двух строк
        str = "2";
        System.out.println("2 > 1 : " + str.compareTo("1")); // 1
        System.out.println("2 == 2 : " + str.compareTo("2")); // 0*/

        /*StringBuilder sb = new StringBuilder();
//        sb.append('a');
//        sb.append(10);
//        sb.append(1565849L);
//        sb.append(15.23);
//        sb.append(15.23f);
        sb.append("Hello").append("_").append("World");
        System.out.println(sb);
        sb.insert(5, "_!");
        System.out.println(sb);
        sb.delete(5, 7);
        System.out.println(sb);
        sb.replace(5, 10, "Java");
        System.out.println(sb);
        String st = sb.substring(5, 6);
        System.out.println(st);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.indexOf("l", 7));*/

        /*StringBuilder sb1 = createStr(5, 3);
        modifeStr(sb1, "=", "равно");
        modifeStr(sb1, "+", "плюс");
        modifeStr(sb1, "-", "минус");
        modifeStr(sb1, "*", "умножить");
        System.out.println(sb1);
    }
    public static StringBuilder createStr(int a, int b){
        StringBuilder res = new StringBuilder();
        res.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        res.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
        res.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return res;
    }
    public static StringBuilder modifeStr(StringBuilder stBuild, String oldStr, String newStr){
        int pas;
        while ((pas = stBuild.indexOf(oldStr)) != -1) {
            stBuild.replace(pas,pas + 1, newStr);
        }
        return stBuild;
    }*/

        /*StringBuilder modStr = getStringBuilder();
        System.out.println("измененная строка - \"" + modStr + "\"");

    }
    public static StringBuilder getStringBuilder() {
        System.out.print("исходная строка = \"");
        String str = " текст с повторяющимися символами ";
        System.out.println(str + "\"");
        StringBuilder modify = new StringBuilder(str.replace(" ", ""));
        for (int i = 0; i < modify.length(); i++) {
            for (int j = modify.length() - 1; j > i; j--) {
                if (modify.charAt(i) == modify.charAt(j)){
                    modify.deleteCharAt(j);
                }
            }
        }
        return modify;
    }*/
    }
}
