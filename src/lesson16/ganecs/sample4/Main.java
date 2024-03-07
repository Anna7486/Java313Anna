package lesson16.ganecs.sample4;

public class Main {
    public static void main(String[] args) {
        Short ar[] = {1,2,3,4};
        Short val = 4;
        boolean flIn = Math.isInt(val, ar);
        System.out.println(flIn);

    }
}

class Math{
    public static <T> boolean isInt(T val, T[] ar){
        for (T v : ar) {
            if (v.equals(val)){
                return true;
            }
        }
        return false;
    }
}
