package ch05;

public class Utils {
    // 05. 클래스-연습문제.02 메서드 5개를 작성
    int a;
    int b;

    public void SumEx() {

    }

    public int Sum(int a, int b) {
        int Sum1 = 0;
        Sum1 = a + b;
        return Sum1;


    }

    public int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    
}
