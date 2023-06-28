package ch06.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// comparable 인터페이스를 구현한다.
// implements 구현
// 자바 객체를 특정 필드로 정렬하는 방법(chatgpt)
// java sort by specific field
public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    // Collections.sort(리스트)
    // 객체별로 compareTo 메서드를 실행하여 정렬해줌
    public  int compareTo(Student o) {
        return  this.name.compareTo(o.name);
    }
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", 15, 10));
        studentList.add(new Student("Alice", 14, 9));
        studentList.add(new Student("Bob", 11, 11));
        studentList.add(new Student("Eve", 10, 8));
        studentList.add(new Student("Carol", 9, 17));

//        for (Student student : studentList) { // equals를 통해 요소 찾기
//            if ("John".equals(student.getName())){
//                System.out.println(student);
//            }
//        }
//        for (Student student : studentList) { getter를 사용해서 요소 출력
//            if (student.getGrade() > 10) {
//                System.out.println(student.getName());
//            }
//        }

//        Scanner scanner = new Scanner(System.in); // 스캐너를 사용해서 입력받고 출력
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Enter name: ");
//            String name = scanner.nextLine();
//            System.out.print("Enter age: ");
//            int age = scanner.nextInt();
//            System.out.print("Enter grade: ");
//            int grade = scanner.nextInt();
//            scanner.nextLine();
//            studentList.add(new Student(name, age, grade));
//        }
//        System.out.println(studentList);

//        for (Student student : studentList) { // equals를 사용해서 찾은 뒤 나이설정.
//            if ("Alice".equals(student.getName())) {
//                student.setAge(5);
//            }
//        }
//        System.out.println(studentList);
    }
}
