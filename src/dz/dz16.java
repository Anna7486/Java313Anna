package dz;

public class dz16 {
    public static void main(String[] args) {
        System.out.println("в строке вставить после каждого символа 'a' символ !");
        String name = "Java";
        System.out.println("исходная строка - " + name);
        name = name.replace("a", "a!");
        System.out.println("измененная строка - " + name);

    }
}

