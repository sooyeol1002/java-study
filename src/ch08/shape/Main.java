package ch08.shape;

public class Main {
    public static void main(String[] args) {
        // 인터페이스 객체 생성이 불가하다.
        // Shape s = new Shape();
        // 구현체로만 객체 생성이 가능하다.
        Shape s = new Circle(5);
        System.out.println("원의 넓이: " + s.calculateArea());
        System.out.println("원의 둘레: " + s.calculatePerimeter());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("사각형의 넓이: " + rectangle.calculateArea());
        System.out.println("사각형의 둘레: " + rectangle.calculatePerimeter());

        // 회사 경영진이 야, 원으로 하니까 후져, 사각형으로 바꿔
        // 인터페이스를 쓰는 이유 1번째가 갈아끼우기 쉽다.
        s = new Rectangle(10,10);
        // Shape s = new Circle(5);
        System.out.println(s.calculateArea());
        System.out.println(s.calculatePerimeter());
    }
}

