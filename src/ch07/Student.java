package ch07;

// extends 부모클래스
// 부모클래스의 필드 및 메서드를 상속 받는다.
// inheritance(상속): 프로그래밍언어에서 상속은 자식이 부모를 선택해서 물려 받음
// SE(SW공학) -> generalization(일반화) -> inheritance(상속)
/* 여러 개의 클래스를 구현하는데, 일반적인 속성(attribute)과 기능(operation)이 있더라.
   그거를 부모 클래스로 만들고, 나머지 클래스들은 상속받고 필요한 것만 추가하자.
*/

public class Student extends Person {
    // Student는 name, age 필드, introduce 메서드를 그냥 사용할 수 있습니다.
    // 부모의 필드 외에 다른 필드를 추가했다.
    private String studentId; // 학번을 추가

    // 빈 생성자는 자동으로 상속받음
    // 하지만 매개변수가 있는 생성자는 상속할 때 별도로 선언해줘야함

    public Student(String name, int age, String studentId) {
        // 부모 클래스인 Person의 생성자를 호출
        // super(...);
        // 부모 객체도 실제로 생성이 됨
        super(name, age);
        this.studentId = studentId;
    }

    // 학생 연구(공부) 기능
    // 부모의 메서드 외에 다른 메서드를 추가했다.
    public void study() {
        System.out.println(name + "이(가) 공부를 시작합니다.");
    }

    // introduce 메서드를 오버라이딩(재정의)
    // override: 재정의한다.
    @Override
    public void introduce() {
        // 기존에 Person의 introduce는 그대로 쓰고
        // 뭔가 추가를 하겠다.
        // super(부모)
        // 부모 클래스의 introduce 메서드 호출
        super.introduce();
        System.out.println("제 학번은 " + studentId + "입니다.");
    }
}
