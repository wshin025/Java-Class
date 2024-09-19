package ex08_08;

import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.printf("계좌번호입력(5자리) : ");
        String accnumber = scanner1.nextLine();
        System.out.printf("성명입력 : ");
        String name = scanner1.nextLine();
        System.out.printf("* 비밀번호입력(4자리) : ");
        String pwd = scanner1.nextLine();
        System.out.printf("*입금할금액 : ");
        int balance = scanner2.nextInt();

//        처음통장 개설했을때

        Account account = new Account(accnumber, name, pwd, balance);
        System.out.println(account);

//        통장에 2600000원 입금 후 잔액표기
        System.out.printf("*입금할금액 : ");
        int deposit = scanner2.nextInt();
        account.deposit(deposit);
//      통장에서 200000원 출금 후 잔액표기
        System.out.printf("*출금할 금액 : ");
        int withdrow = scanner2.nextInt();
        account.withdraw(withdrow);

        System.out.printf("%s님의 통장 잔액은  %d 입니다. \n",account.getName(),account.getBalance());
        scanner1.close();
        scanner2.close();
    }
}
