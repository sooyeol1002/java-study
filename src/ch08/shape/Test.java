package ch08.shape;

public class Test {
    static void testArea(Shape s) {
        // 1기능: 둘레 구하기 테스트
        double expectedResult = 100; // 예상 결과
        double actualResult = s.calculateArea();  // 실제 결과

        if(actualResult == expectedResult) {
            System.out.println("1. 너비 구하기 테스트 성공(success)");
        } else {
            System.out.println("1. 너비 구하기 테스트 실패(fail)");
        }
    }
    static void testperimeter(Shape s) {
        // 2기능: 둘레 구하기 테스트
        double expectedResult = 40; // 예상 결과
        double actualResult = s.calculatePerimeter();  // 실제 결과

        if(actualResult == expectedResult) {
            System.out.println("2. 둘레 구하기 테스트 성공(success)");
        } else {
            System.out.println("2. 둘레 구하기 테스트 실패(fail)");
        }
    }

    public static void main(String[] args) {
        // TDD 스타일로 개발
        Shape s = new Square(10);

        testArea(s);
        testperimeter(s);
    }
}
