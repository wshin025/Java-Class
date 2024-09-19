package ex08_08;

public class Account {
    private int balance;
    private String Accnumber;
    private String name;
    private String pwd;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccnumber() {
        return Accnumber;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }


    public Account(String accnumber, int balance, String name, String pwd) {
        Accnumber = accnumber;
        this.balance = balance;
        this.name = name;
        this.pwd = pwd;
    }

//입금하는 메소드 deposit
    public void deposit(int money) {
        balance += money; //balance= balance + money
    }
// 출금하는 메소드 withdraw
    public void withdraw(int money) {
        balance -= money; //balance= balance - money
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

