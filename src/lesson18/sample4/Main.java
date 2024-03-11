package lesson18.sample4;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        Predicate<Integer> isPositive = x -> x > 0;
//        System.out.println(isPositive.test(5));
//        System.out.println(isPositive.test(-5));

        Predicate<String> isPalindrome = str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        };

        String world1 = "Мадам";
        boolean res = isPalindrome.test(world1);
        System.out.println(world1 + " Это палиндром: " + res);

        String word2 = "радар";
        res = isPalindrome.test(word2);
        System.out.println(word2 + " Это палиндром: " + res);
    }
}


