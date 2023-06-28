package ch07;

// 인간 정보
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 개인정보 출력
    public void introduce() {
        System.out.println("안녕하세요. 제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
    }
    //Person만의 메소드 () {

    // 다형성을 이용해서
    // 현재객체가 Student일 수도 있고, Lecturer 일 수도 있음.
}
