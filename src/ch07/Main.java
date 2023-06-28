package ch07;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("양수열", 27);
        p.introduce();

        Student s = new Student("양수열", 27, "00000001");
        s.introduce();
        s.study();


        // 업캐스팅
        // Student 객체를 Person 타입으로 업캐스팅(부모타입으로변환)
        Person p2 = s;

        // 부모 객체의 재정의된 메서드 호출
        // 자식 객체의 메서드가 호출
          // Student에 study()
        System.out.println("-------------------");
        p2.introduce();  // Person 타입으로 호출하더라도 Student 객체의 introduce가 호출되었음.
        // 자식 객체의 추가한 메서드/필드는 접근불가
        // p2.study() // 호출불가

        Person p3 = new Lecturer("양수열", 27, 1);
         // Lecturer에 teach()
        System.out.println("-------------------");
        PersonManager personManager = new PersonManager();
        personManager.work(p2);
        personManager.work(p3);
        personManager.work(p);
        System.out.println("--------------------");


        // 부모 객체를 자식 객체에 대입,
        // 명시적 형변환
        // 그냥 형변환 하면 에러발생 가능성이 존재함.
        // 부모객체변수 instanceof 자식클래스타입
        // Student -> Person, Person, Lecturer -> Person
        // 다형성(polymorphism)
        if (p2 instanceof Student) {
            Student s2 = (Student) p2;
            s2.study();
        }

        if (p3 instanceof Student) {
            Student s3 = (Student) p3;
            ;
            s3.study();
        } else {
            System.out.println("---Student 클래스가 아님");
        }
    }
}
