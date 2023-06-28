package ch08.shape;

public class Square implements Shape{
    private double side;
    public Square(int side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
