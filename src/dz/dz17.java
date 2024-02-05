package dz;

import java.util.Scanner;

public class dz17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ВАРИАНТ 1
        String password = "my-p@ssw0rd";
        System.out.println("Пароль: ['" + password + "']");
        boolean a = password.matches("^[a-zA-Z0-9@_\\-]{6,18}$");
        if (a){
            System.out.println("пароль соответствует требованиям");
        }else {
            System.out.println("пароль не соответствует требованиям");
        }

        //ВАРИАНТ 2
        System.out.println("введите пароль: ");
        String password2 = input.nextLine();
        System.out.println("Пароль: ['" + password2 + "']");

        boolean b = password.matches("^[a-zA-Z0-9@_\\-]{6,18}$");
        if (b){
            System.out.println("пароль соответствует требованиям");
        }else {
            System.out.println("пароль не соответствует требованиям");
        }


    }
}
