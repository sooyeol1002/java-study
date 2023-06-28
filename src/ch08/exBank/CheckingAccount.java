package ch08.exBank;

public class CheckingAccount implements BankAccount{
    private double balance;
    private double dep;
    private double wit;
    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit() {
        balance += dep;
    }

    @Override
    public double withdraw() {
        if (balance >= wit) {
            return balance -= wit;
        } else {
            System.out.println("잔액부족");

        }
        return 0;
    }
}
