package ch08.shape;

public class Rectangle implements Shape, Drawable {
    private double width; // 가로 길이 필드
    private double height; // 세로 길이 필드

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 인터페이스에서 선언된 추상 메서드를 구현해야 합니다.
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void drawLines() {

    }
}
