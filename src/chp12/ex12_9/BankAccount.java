package chp12.ex12_9;

public class BankAccount {
    private final String username;
    private final String accountNumber;
    private long balance;

    public BankAccount(long balance, String accountNumber, String username) {

        this.accountNumber = accountNumber;
        this.username = username;
        this.balance = balance;

    }

    @Override
    public String toString(){
        return String.format("%s / %s / %d", username, accountNumber, balance);
    }
}
