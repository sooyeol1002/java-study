package ch06.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<String>();
        lst.add("사과");
        lst.add("바나나");
        lst.add("체리");
        // 내부적으로 구버전 자바이면 merge-sort, 현재 자바버전이면 tim-sort
        lst.sort(null);

        System.out.println(lst);

        Collections.sort(lst);
        for (String elm : lst) {
            System.out.println(elm);
        }
        System.out.println("--------");
        Collections.reverse(lst);
        for (String elm : lst) {
            System.out.println(elm);
        }
        System.out.println("--------------------");
        System.out.println("학생 리스트");
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("조정빈", 21, 1));
        studentList.add(new Student("김성우", 22, 2));
        studentList.add(new Student("양수열", 23, 3));
        Collections.sort(studentList);
        System.out.println(studentList);

        // @: at mark
        // kdkcom@naver.com
        // 클래스명::필드명(getter)
        // 해당 클래스의 필드로 뭔가를 하겠다.
        // 컬렉션s.sort(studentList, Comparator)
        Collections.sort(studentList, Comparator.comparing(Student::getName));
        for (Student s : studentList) {
            System.out.println(s.getName());
        }
    }
}
