package ch05.singleton;

public class Operator {
    // private static 클랫스 객체
    private static Operator instance;

    // 외부에서 객체 생성 안 됨.
    // private 생성자
    private Operator() {
    }

    // 오버로딩
//    public Singleton(Singleton instance) {
//        this.instance = instance;
//    }

    // getInstance 메서드로 처음에 생성한 객체만 접근하게 하느느 방법
    // 객체 생성은 첫번째 메서드 호출시에 1번만
    public static Operator getInstance() {
        if (instance == null) {
            instance = new Operator();
            System.out.println("객체가 생성되었습니다.");
        }
        return instance;
    }
    public double multiply(double x, double y) {
        System.out.println("(double, double)");
        return x * y;
    }
    public int multiply(int x, int y) {
        System.out.println("(int , int)");
        return x * y;
    }
    public int multiply(double x, double y, int z) {
        System.out.println("(double, double)");
        return (int) (x * y) * z;
    }
}
