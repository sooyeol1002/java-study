package ch06.map;

import com.myuniversity.students.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // 해시맵: HashMap, 추가할 때 정렬x, 성능이 좀 더 좋겠지
        // 트리맵: TreeMap, 추가할 때 이진트리로 정렬, 성능이 떨어지지만 키값으로 정렬
        Map<String, Student> students = new HashMap<>();

        // 객체추가
        // 키(key, 유일값): 학번
        // 값(value): 학생정보
        // 맵변수.put(엔트리(k,v))
        students.put("e-01-00001", new Student("강애진"));
        students.put("e-01-00002", new Student("김소현"));
        students.put("e-01-00003", new Student("양수열"));
        students.put("e-01-00004", new Student("조정빈"));


        // 객체검색/조회
        // 맵변수.keySet() -> key 목록을 반환함(키는 중복이 안 됨)
        // set: 집합, 원소의 중복이 없는 자료구조
        // 일반적으로 Map, 연관배열, dictionary, key-value pair
        // 자료구조는 정렬해서 저장하지 않음
//        for (String key : students.keySet()) {
            // 맵변수.get(키값) -> 값 객체
//            System.out.println("학번: " + key + ", 학생명: " + students.get(key).getName());

        // 맵변수.values() -> 값 목록을 반환함
//        for (Student s: students.values()) {
//            System.out.println(s.getName());
//        }
        // 키 값 존재여부 확인
        boolean result = students.containsKey("e-01-00003");
        System.out.println("-----------------");
        Map<String, Student> sortedStudents = new TreeMap<>(students);

        // 해시맵을 정렬된 트리맵으로 변환
        for (String key : new TreeMap<>(students).keySet()) {
            System.out.println("학번: " + key + ", 학생명: " + students.get(key).getName());
            // 맵변수.get(키값) -> 값 객체
        }
        // 객체의 값 수정
        // 맵변수.get(키값): 키값으로 조회후 뭔가를 처리할 수 있음
        Student s = students.get("e-01-00002");
        // setter 등으로 값 수정

        // 객체삭제
        // 맵변수.remove(키값): 특정 키값의 엔트리(key-value쌍)를 삭제
        students.remove("e-01-00003");
        // 모두 다 밀어버려
        students.clear();

    }
}
