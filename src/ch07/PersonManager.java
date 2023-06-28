package ch07;

public class PersonManager {
    Person p = new Person("양수열", 27);
    // 다형성을 이용해서
    // 현재객체가 Student일 수도 있고, Lecturer 일 수도 있음.

    public void work(Person p) {
        if(p instanceof Student) {
            ((Student) p).study();  //this.study를 형변환해줌
        } else if(p instanceof Lecturer) {
            ((Lecturer) p).teach();
        } else if(p instanceof Person) {
            System.out.println("난 태생이 Person이야");
        }
    }
}
