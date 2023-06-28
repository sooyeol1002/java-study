package ch08.shape;

public interface Shape {
    // 값만 return 하고싶을때는 void, this 사용
    // 면적 계산
    double calculateArea();
    // 둘레 계산
    double calculatePerimeter();
}
