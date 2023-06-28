package ch06.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>();// List<자료형> 변수형 = new ArrayList<자료형>();
//        List<Integer> listInt = new ArrayList<Integer>();
//        String longestString = null;
//        String shortestString = null;;
//        list.add(new String("apple"));
//        list.add(new String("strawberry"));
//        list.add(new String("banana"));
//        list.add(new String("cherry"));
//        list.add(1, new String("orange")); // 인덱스 지정, 객체 삽입

//        System.out.println(list.size()); // 요소의 개수 출력

//        System.out.println(list.get(1)); // 두번째 요소 출력

//        list.remove(1);                  // 요소 삭제

//        System.out.println(list);        // 리스트가 비었는지 확인
//            if(list.isEmpty()){
//                System.out.println("List is empty");
//            } else {
//                System.out.println("List is not empty");
//            }

//        Collections.sort(list);          // 알파벳 순으로 정렬

//        for (String name : list) {       // 가장 긴, 짧은 문자열 찾아서 출력
//            if (longestString == null || name.length() > longestString.length()) {
//                longestString = name;
//            } if (shortestString == null || name.length() < shortestString.length()) {
//                shortestString = name;
//            }
//        }
//        System.out.println("과일 목록: " + list);
//        System.out.println("가장 긴 과일 이름: " + longestString);
//        System.out.println("가장 짧은 과일 이름: " + shortestString);

//        for (String name : list) {      // 대문자 변환
//            String uppercaseStr = name.toUpperCase();
//            System.out.println(uppercaseStr);
//        }

//        System.out.println("원본 List: " + list);
//        Collections.reverse((list));    // 순서 반전 메서드
//        System.out.println("거꾸로 뒤집힌 List: " + list);

//        String find = "cherry";
//        int index = list.indexOf(find); // 메서드를 사용하여 find변수에 저장된 값을 찾는다.
//        if (index != -1) { // if 문을 사용하여 변수의 값이 -1이 아닌지 확인, 메서드에 찾는 요소가 없을때 반환되는값 -1.
//            System.out.println("요소를 찾았습니다. 인덱스: " + index);
//        } else {
//            System.out.println("요소를 찾지 못했습니다.");
//        }

//        list.remove(list.size() - 1);  // 마지막 요소 제거
//        System.out.println(list);
    }
}