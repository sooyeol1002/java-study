package ch06.map;

import java.util.*;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    static Map<String, Student> students = new HashMap<>();

    public static void main(String[] args) {

        students.put("e-01-00001", new Student("James", 25));
        students.put("e-01-00002", new Student("Emma", 26));
        students.put("e-01-00003", new Student("William", 27));
        students.put("e-01-00004", new Student("Olivia", 28));
        students.put("e-01-00005", new Student("Benjamin", 29));

//        for (String key : students.keySet()) { // 모든 학생 출력
//            System.out.println("학번: " + key + ", 학생명: " + students.get(key).getName()
//                    + ", 나이: " + students.get(key).getAge());
//        }
//        students.remove("e-01-00005"); // 특정 학번 제거
//        for (String key : students.keySet()) {
//            System.out.println("학번: " + key + ", 학생명: " + students.get(key).getName()
//                    + ", 나이: " + students.get(key).getAge());
//        }
//        Student st = students.get("e-01-00003"); // 특정학번의 학생 검색
//        System.out.println(st.getName());

//        int ageAvg = 0; // 나이의 평균 구하기
//        int sum = 0;
//        for (Student key : students.values()) {
//            sum += key.getAge();
//            ageAvg = sum/students.size();
//        }
//        System.out.println("나이의 합:" + sum);
//        System.out.println("나이의 평균: " + ageAvg);

//        int max = 0; // 나이가 가장 많은 학생
//        for (String key : students.keySet()) {
//            if (students.get(key).getAge() > max){
//                max = students.get(key).getAge();
//            }
//        }
//        for (Student student : Student.students.values()){
//            if (student.getAge() == max){
//                System.out.println(student.getName());
//                break;
//            }
//        }

//        String name1 = "i";
//        for (Student name : students.values()) {
//            if(name.name.contains(name1)){
//                System.out.println(name.getName());
//            }
//        }

//        String findName = "James";
//        for (Student name : students.values()) {
//            if(name.name.equals(findName)) {
//                System.out.println(name.getName() + " " + name.getAge());
//            }
//        }

        ArrayList<Student> studentList = new ArrayList<>(students.values());
        Collections.sort(studentList, Comparator.comparing(Student::getName));
        for (Student key : studentList) {
            System.out.println(key.getName());
        } // students맵의 값을 ArrayList로 변환(students.values()) -> studentList에 저장

    }
}