package ch05.statics;

public class Counter {
    // static 필드
    // 클래스의 모든 객체에 값이 공유된다.
    private static int count = 0; // 정적 변수(static 변수)

    public Counter() {
        count++; // 정적 변수 값 증가
    }

    // static 메서드
    public static int getCount() { // 정적 메서드(static 메서드)
        return count++; // 정적 변수 반환
    }
}
