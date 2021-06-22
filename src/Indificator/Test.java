package Indificator;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Encryption encryption = new EncryptionFile();
        encryption.encrypt("d:/test.txt");
    }
}