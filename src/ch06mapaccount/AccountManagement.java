package ch06mapaccount;

import ch06.map.Student;

import java.util.*;

public class AccountManagement {
    // ArrayList로 변경
//    private List<Account> accountList = new ArrayList<>();
//    private Account[] accountList;  // 계좌 목록 배열
    private int numAccounts;        // 계좌의 개수
    private Scanner scanner;        // 사용자 키보드 입력 객체

    Map<String, Account> accounts = new HashMap<>();

    // 최대 입력 가능한 계좌개수를 매개변수를 입력받는 생성자
    public AccountManagement(int maxSize) {
        //accountList = List.of(new Account[0]);// 계좌 목록 배열을 생성
//        accountList = new ArrayList<>(maxSize);
        numAccounts = 0;                   // 현재 생성된 계좌의 개수
        scanner = new Scanner(System.in);  // 사용자 입력 객체 생성
    }


    public void addAccount(String accountNumber, double balance) {
        // **코드 작성
        // 계좌번호와 초기 입금액을 입력 받고
        // 계좌객체를 생성한 후 배열의 앞에서부터 가장 처음 빈 공간에 추가한다.
        // 단, 배열에 추가한 후 numAccounts를 증가시킨다.
        Account add = new Account(accountNumber, balance);
        accounts.put(accountNumber, add); // 뒤에 값 추가
//        accountList.set(numAccounts, add); // 사용의미가 없음

        System.out.println("계좌가 추가되었습니다.");
//        this.numAccounts = accountList.size();
        // Account ac = new Account(accountNumber, balance);
        /*accountList.set(numAccounts, ac);
        System.out.println(accountList.get(numAccounts).getAccountNumber()); // 제대로 들어갔는지 확인
        numAccounts++;*/
    }


    public void showAccountList() {
        // **코드 작성
        // 계좌 목록을 출력
        // 예시 출력 형태
        // ------------------------------------
        // 계좌번호: [계좌번호1], 잔액: [잔액1]
        // 계좌번호: [계좌번호2], 잔액: [잔액2]
        // ...
        // ------------------------------------
        for (String key : accounts.keySet()) {
            System.out.println(key + " : [계좌번호" + accounts.get(key).getAccountNumber()  + "], " + accounts.get(key).getBalance() + " : [계좌 " + accounts.get(key).getAccountNumber() + "의 잔액]");
        }
        /*for(Account sc : accountList){
            System.out.println(sc.getAccountNumber());
            if (sc != null) {
                System.out.println("계좌번호" + sc.getAccountNumber() + ", " + "잔액: " + sc.getBalance());
            } else {
                System.out.println("계좌가 더 이상 없습니다.");
                break;
            }
        }*/
        /*for (Account ac : accountList) {
            if (ac != null) {
                System.out.println("계좌번호" + ac.getAccountNumber() + ", " + "잔액: " + ac.getBalance());
            } else {
                System.out.println("계좌가 더 이상 없습니다.");
                break;
            }
        }*/
    }

    public void deposit(String accountNumber, double amount) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾고 입금 금액 만큼 잔액을 추가한다.
        // 단, Account 클래스의 deposit 메서드를 사용하여야 한다.
        Account ac = findAccount(accountNumber);
        for (String key : accounts.keySet()) {
            if (ac != null) {
                ac.deposit(amount);
            }

            System.out.println("계좌번호 " + accounts.get(key).getAccountNumber()
                    + "에 입금되었습니다." + " 잔액 :" + accounts.get(key).getBalance());
            break;
        }
    }
    public void withdraw(String accountNumber, double amount) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾고 출금 금액 만큼 잔액을 차감한다.
        // 단, Account 클래스의 withdraw 메서드를 사용하여야 한다.
        Account ac = findAccount(accountNumber);
        for (String key : accounts.keySet()) {
            if (ac != null) {
                ac.withdraw(amount);
            }
            System.out.println("계좌번호 " + accounts.get(key).getAccountNumber() + "에서 출금 되었습니다."
            + " 잔액 : " + accounts.get(key).getBalance());
            break;
        }
    }
    private Account findAccount(String accountNumber) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾아서 리턴(get)하는 메서드 작성
        for (String key : accounts.keySet()) {
            if (accounts.get(key).getAccountNumber().equals(key)) {
                return accounts.get(key);
            }
        }
        return null;
    }

    public void run() {
        while (true) {
            //기능 출력
            System.out.println("\n=== 계좌 관리 프로그램 ===");
            System.out.println("1. 계좌 추가");
            System.out.println("2. 계좌 목록 조회");
            System.out.println("3. 입금");
            System.out.println("4. 출금");
            System.out.println("0. 종료");
            System.out.print("원하는 기능을 선택하세요: ");

            // 메뉴번호 받기
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("계좌번호: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("잔액: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    addAccount(accountNumber, balance);
                    break;
                case 2:
                    showAccountList();
                    break;
                case 3:
                    System.out.print("계좌번호: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("입금액: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    deposit(accountNumber, depositAmount);
                    break;
                case 4:
                    System.out.print("계좌번호: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("출금액: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    withdraw(accountNumber, withdrawAmount);
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
    }
