package com.myuniversity.courses;

// 다른 패키지에 있는 클래스를 가져다 쓰는 방법
// import 패키지명....클래스명;
// import 패키지명....*; // 해당패키지 모든 클래스
// import com.myuniversity.students.*;

import java.util.Scanner;

import com.myuniversity.students.Student;

import com.myuniversity.students.GraduateStudent;

import com.myuniversity.students.UndergraduateStudent;

public class Course {
    private Scanner scanner;
    private Student name;
    private Student[] students; // 배열은 복수
    // final 변수
    // 상수(constant): 초기화만 가능하고, 변경 불가능한 값
    // 상수는 대문자 snake-case 많이 사용한다.(관례, convention)
    private final int MAX_STUDENT = 20;
    private int numOfStudents = 0; // 현재 과목에 몇명의 학생이 있는지
    private Student[] studentsList;



    public Course(int maxStudent) {
        studentsList = new Student[maxStudent];
        numOfStudents = 0;
        scanner = new Scanner(System.in);
    }

    // 해당 과목에 학생 참가(추가)
//    public void JoinStudent(String subjectName, int student) {
//        Student participation = new Student(subjectName, student);
//        students[numOfStudents] = participation;
//        System.out.println(students[numOfStudents].getSubjectName());
//        numOfStudents++;
    }




//    public void run() {
//        while (true) {
//            // 기능출력
//            System.out.println("\n=== 학생 관리 프로그램 ===");
//            System.out.println("1. 반 생성");
//            System.out.println("2. 학생 목록 조회");
//            System.out.println("3. 참가");
//            System.out.println("4. 탈퇴");
//            System.out.println("0. 종료");
//            System.out.print("원하는 기능을 선택하세요: ");
//        }
//        int choice = scanner.nextInt();
//        scanner.nextLine(); // 개행 문자 제거
//
//        if (choice == 0) {
//            System.out.println("프로그램을 종료합니다.");
//            break;
//        }

//        switch (choice) {
//            case 1:
//                System.out.print("과목: ");
//                String subjectName = scanner.nextLine();
//                System.out.print("학생: ");
//                double balance = scanner.nextDouble();
//                scanner.nextLine(); // 개행 문자 제거
//                joinStudent(subjectName, student);
//                break;
//            case 2:
//                showAccountList();
//                break;
//            case 3:
//                System.out.print("과목: ");
//                accountNumber = scanner.nextLine();
//                System.out.print("참가인원: ");
//                double depositAmount = scanner.nextDouble();
//                scanner.nextLine(); // 개행 문자 제거
//                deposit(accountNumber, depositAmount);
//                break;
//            case 4:
//                System.out.print("과목: ");
//                accountNumber = scanner.nextLine();
//                System.out.print("탈퇴인원: ");
//                double withdrawAmount = scanner.nextDouble();
//                scanner.nextLine(); // 개행 문자 제거
//                withdraw(accountNumber, withdrawAmount);
//                break;
//            default:
//                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
//                break;
//        }
//    }


