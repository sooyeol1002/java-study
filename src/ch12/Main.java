package ch12;

public class Main {
    public static void main(String[] args) {
        MyService thread1 = new MyService("수강 관리 서비스");
        MyService thread2 = new MyService("학생 정보 관리 서비스");

        thread1.start(); // 스레드 시작
        thread2.start(); // 다른 스레드 시작 1
        //test
    }
}
