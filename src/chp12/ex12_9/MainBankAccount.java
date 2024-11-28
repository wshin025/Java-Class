package chp12.ex12_9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount b1= new BankAccount(1000000, "111-22-3333","손예진");
        BankAccount b2= new BankAccount(1000000, "111-22-3333","현빈");

        try {
            File file =new File("result_account.txt");
            FileWriter fw = new FileWriter(file);
            fw.write(b1.toString());
            fw.write(b2.toString());
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
