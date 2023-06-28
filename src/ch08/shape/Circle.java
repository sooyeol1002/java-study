package ch08.shape;

public class Circle implements Shape{
    private double radius; // 반지름 필드

    public Circle(double radius) {
        this.radius = radius;
    }

    // 인터페이스에서 선언된 추상 메서드를 구현해야 합니다.
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
