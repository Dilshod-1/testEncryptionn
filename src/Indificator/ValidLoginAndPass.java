package Indificator;

public class ValidLoginAndPass {

    public static boolean pswOk(String password){
        if (password == null) {
            System.out.println("Поле не может быть пустым");
            return false;
        }
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Пароль должен содержать от 6 до 10 символов");
            return false;
        }
        return true;

    }
    public static boolean logOk(String login){
        if (login == null) {
            System.out.println("Поле не может быть пустым");
            return false;
        }
        if (login.length() < 6 || login.length() > 10) {
            System.out.println("Логин должен содержать от 6 до 10 символов");
            return false;
        }
        return true;
    }
}