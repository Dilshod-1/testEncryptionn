package Indificator;

import java.util.Scanner;

public class UserPerson {
    public static String[] getUser(){
        String[] loginAndPassword = new String[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин : ");
        loginAndPassword[0] = scanner.nextLine();
        System.out.println("Введите пароль : ");
        loginAndPassword[1] = scanner.nextLine();
        return loginAndPassword;
    }
}