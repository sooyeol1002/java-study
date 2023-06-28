package ch05.accessModifier;

public class BankAccount {
    private int balance;  // private 필드

    // private 메서드
    // 클래스 만든 사람만 가져다 쓰려고 한 겁니다.
    private void deductFunds(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Funds deducted: " + amount);
        } else {
            // insufficient: 불충분
            System.out.println("Insufficient funds!");
        }
    }
}
