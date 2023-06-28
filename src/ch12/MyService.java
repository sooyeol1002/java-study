package ch12;

public class MyService extends Thread {
    private String name;

    public MyService(String name) {
        this.name = name;
    }

    // Thread 클래스를 상속받고, run 메서드를 구현
    // run메서드가 실행될 때 추가적인 스레드가 생성
    // 샘플에서는 60회 출력을 하고, 1초(1000ms)마다 멈춤.
    // 출력 횟수 밒 일시정지 시간을 랜덤으로 처리함
    @Override
    public void run() {
        for (int i = 1; i <= (int) (Math.random() * 1000); i++) {
            System.out.println("스레드 " + name + ": " + i);
            try {
                Thread.sleep((int) (Math.random() * 1000)); // 스레드 일시 정지
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

