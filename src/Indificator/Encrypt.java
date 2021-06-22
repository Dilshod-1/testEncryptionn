package Indificator;

import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

public class Encrypt {

    public static String encryptFile(String fileName, int encryptLevel) throws IOException {
        int symbolCount = 0;
        switch (encryptLevel) {
            case (1):
                symbolCount = 4;
                break;
            case (2):
                symbolCount = 5;
                break;
            case (3):
                symbolCount = 6;
                break;
        }
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String fileEncryptName = fileName.substring(0, fileName.lastIndexOf("."))+"encrypt"+fileName.substring(fileName.lastIndexOf("."));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileEncryptName));
        while(reader.ready()){
            String temp = reader.readLine()+"\n";
            String[] arrayWordAndSymbolInText = temp.split("\\b");
            String[] arrayWordInText = temp.replaceAll("[,.]", " ").split("\\s+");
            HashSet<String> wordInText = new HashSet<>(Arrays.asList(arrayWordInText));
            for (String word : wordInText) {
                int count = 0;
                for (String s : arrayWordInText) {
                    if (s.equalsIgnoreCase(word)) count++;
                }
                for (int i = 0; i < arrayWordAndSymbolInText.length; i++) {
                    if (arrayWordAndSymbolInText[i].equalsIgnoreCase(word) & (word.length() < symbolCount & count < 2)) {
                        String replaceWord = arrayWordAndSymbolInText[i].replaceAll(".", "x");
                        arrayWordAndSymbolInText[i] = replaceWord;

                    }
                }
            }
            StringBuilder fileEncrypt = new StringBuilder();
            for (String s : arrayWordAndSymbolInText) {
                fileEncrypt.append(s);
            }
            writer.write(String.valueOf(fileEncrypt));
        }
        reader.close();
        writer.close();
        Date date = new Date();

        return "Файл зашифрован c уровнем шифрования: " + encryptLevel + " Дата шифрования: " + date;
    }


}