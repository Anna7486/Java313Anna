package dz;

import java.util.Scanner;

public class dz15 {
    public static void main(String[] args) {
        /*String str = "Замените в этой строке все появления буквы о на букву О, кроме первого и последнего вхождения.";
        System.out.println(str);
        String a = str.substring(0, str.lastIndexOf('о'));
        String b = str.substring(str.indexOf('о') + 1, str.lastIndexOf('о')).replace("о", "О");
        String c = str.substring(str.lastIndexOf('о'));
        System.out.println(a + b + c);
    // при выводе дублируется предложение не знаю почему и как это исправить
*/

        Scanner input = new Scanner(System.in);
        System.out.print("введите два слова через пробел: ");
                String str = input.nextLine();
                int spaceIndex = str.indexOf(" ");
                if (spaceIndex == -1) {
                    System.out.println("Строка должна содержать ровно два слова");
                    return;
                }
                String word1 = str.substring(0, spaceIndex);
                String word2 = str.substring(spaceIndex + 1).trim();
                String result = word2 + " " + word1;
                System.out.println(result);

    }
}



