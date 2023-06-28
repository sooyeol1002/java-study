package ch01;

public class CastingEx {
    public static void main(String[] args) {
        double x = 3.14;
        int y = (int) x; // 오류 발생
        System.out.println(y);
        char c = 'A';
        int num = c;
        System.out.println(num);
    }
}
