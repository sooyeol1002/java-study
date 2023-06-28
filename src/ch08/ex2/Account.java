package ch08.ex2;

public class Account implements Taxable, Bankable, Loanable {
    private double balance;
    private double dep;
    private double wit;
    private double loan;

    @Override
    public double calculateTax() {
        return balance * 0.1;
    }

    @Override
    public void deposit() {
        balance += dep;
    }

    public double withdraw() {
        if (balance >= wit) {
            return balance -= wit;
        } else {
            System.out.println("잔액부족");

        }
        return 0;
    }
    public double calculateInterest() {
        return loan * 0.01;
    }


}
