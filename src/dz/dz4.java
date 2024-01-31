package dz;

import java.util.Scanner;

public class dz4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, res;
        System.out.print("Введите число от 1 до 99: ");
        n = input.nextInt();
        res = n;
        if (n >=11 && n<=14){
            System.out.println(n + " копеек");
        }else {
            res = res % 10;
            if (res == 1){
                System.out.println(n + " копейка");
            } else if (res >= 2 && res <=4){
                System.out.println(n + " копейки");
            } else {
                System.out.println(n + " копеек");
            }
        }
        input.close();
    }
}
