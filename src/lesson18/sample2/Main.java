package lesson18.sample2;

public class Main {
    public static void main(String[] args) {
        String inSt = "Лямбда выражения в Java";
        System.out.println("Исходная строка: " + inSt);
        String outSt = stringOp(str -> str.toUpperCase(), inSt);
        System.out.println("Строка в верхнем регистре: " + outSt);

        outSt = stringOp(str -> {
            String res = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' '){
                    res += str.charAt(i);
                }
            }
            return res;
        }, inSt);
        System.out.println("Строка с удаленными пробелами: " + outSt);

        outSt = stringOp(str -> {
            String res = "";
            for (int i = (str.length() - 1); i >= 0; i--) {
                res +=str.charAt(i);
            }
            return res;
        }, inSt);
        System.out.println("Перевернутая строка: " + outSt);
    }

    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }
}

interface StringFunc{
    String func(String n);
}
