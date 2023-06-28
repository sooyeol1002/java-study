// src/com/myuniversity/student/Student.java

// 회사(com), 비영리조직(org)
// 1차
// com.----
// org.----

// 2차
// 회사명, 조직명
// com.naver, com.wooahan
// org.apache, org.mozilla

// 3차
// 제품명, 서비스명, 도메인명(비즈니스범위명)
// com.naver.search, com.naver.blog, com.naver.news

// 그 하위
// com.naver.spoorts.baseball

package com.myuniversity.students;


public class Student {

    private String name;           // 과목이름
//    private int student;                  // 학생

    public Student(String name) {// 생성자의 이름은 클래스 이름과 동일합니다.
        this.name = name;
//        this.student = student;
    }

    public String getName() {
        return name;
    }

//    public int getStudent() {
//        return student;
//    }

    // 과목 객체에 학생추가
//    public void participate(int participant) { // 참가인만큼 과목객체에 학생 추가
//        this.student += participant;
//    }

    // 과목 객체에 학생제거
//    public void withdrawalPerson(int participant) {
//        if(this.student >= participant) {
//            this.student -= participant;
//        } else {
//            System.out.println("-- 학생의 수는 0 미만이 될 수 없습니다.--");
//        }
//    }
}
