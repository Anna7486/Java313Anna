package dz;
import java.util.Arrays;
public class dz9 {
    public static void main(String[] args) {
        int [] array = new int[10];
        int c;
        for (int i = 0; i < array.length; i++) {
            c = (int) (Math.random() * 10);
            int j = 0;
            while (j<i){
                if (c !=array[j]){
                    j++;
                }else {
                    c = (int) (Math.random() * 10);
                    j = 0;
                }
            }

            array[i] = c;
        }
        System.out.println(Arrays.toString(array));
    }
}
