package Indificator;

public class Tolerance {
    private static String[] login = {"user-1", "user-2", "user-3"};
    private static String[] password = {"111111", "222222", "333333"};
    private static int[] level = {1, 2, 3};

    public static int authorization(String username, String password2) {
        int lev = 0;

        if (username.equals(login[0]) && password2.equals(password[0])) {
            lev = level[0];
        } else if (username.equals(login[1]) && password2.equals(password[1])) {
            lev = level[1];
        } else if (username.equals(login[2]) && password2.equals(password[2])) {
            lev = level[2];
        } else System.out.println("Нет такого пользователя");
        return lev;
    }
}