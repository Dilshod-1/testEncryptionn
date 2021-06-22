package Indificator;

import java.io.IOException;
import java.util.Scanner;

class EncryptionFile implements Encryption {
    private int encryptLevel = 0;

    @Override
    public void encrypt(String fileName) throws IOException {
        boolean authenticate = false;
        while (!authenticate) {
            String[] loginAndPassword = UserPerson.getUser();
            String userName = loginAndPassword[0];
            String password = loginAndPassword[1];
            if (ValidLoginAndPass.logOk(userName) && ValidLoginAndPass.pswOk(password)) {
                encryptLevel = Tolerance.authorization(userName, password);
            }
            if (encryptLevel > 0) {
                authenticate = true;
            }
        }
        if (CheckFormat.checkFile(fileName)) {
            System.out.println(Encrypt.encryptFile(fileName, encryptLevel));
        }
    }
}