package Indificator;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class CheckFormat {

    private static final List<String> extensions = Arrays.asList("txt", "txt");

    public static boolean checkFile(String fileName) {
        boolean result = false;
        File file = new File(fileName);
        if (file.exists()) {
            if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
                String estension = fileName.substring(fileName.lastIndexOf(".") + 1);
                if (extensions.contains(estension)) {
                    result = true;
                } else {
                    System.out.println("Разрешение файла не поддерживается");
                }
            } else {
                System.out.println("Некоректное название файла");
                result = false;
            }
        } else {
            System.out.println("Файл не найден");
            result = false;
        }
        return result;
    }
}
