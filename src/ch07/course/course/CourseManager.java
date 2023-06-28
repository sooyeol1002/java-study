package ch07.course.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseManager extends Course{

    List<Course> courses = new ArrayList<>();


    private int numCourses;
    private Scanner scanner;


    private CourseManager(int maxSize) {
        courses = new ArrayList<>(maxSize);
        numCourses = 0;
        scanner = new Scanner(System.in);
    }



    public void addCourse(String courseName, String courseCode, String instructor, String platform, int room,
                          int time) {
        courses.add(new Course(courseName, courseCode, instructor, platform, room, time));
        scanner.nextLine();
        System.out.println("강의가 개설되었습니다.");
        numCourses++;
    }

    public void printCourses() {
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses.get(i).getCourseName() + " : 과목이름" +
                    courses.get(i).getCourseCode() + " : 과목 코드" +
                    courses.get(i).getInstructor() + " : 강사 이름");
        }

    }
    public Course getCourseByInstructor(String instructor) {
        for (int i = 0; i < numCourses; i++) {
            if (courses.get(i).getInstructor().equals(instructor)) {
                return courses.get(i);
            }
        }
        return null;
    }
    public OnlineCourse[] getOnlineCourses(Course onlineCourse) {
        List<OnlineCourse> onlineCourses = new ArrayList<>();

        for (Course course : courses) {
            if (course instanceof OnlineCourse) {
                onlineCourses.add((OnlineCourse) course);
            }
        }

        return onlineCourses.toArray(new OnlineCourse[0]);
        }

    public LectureCourse[] getLectureCourses(Course lectureCourse) {
        List<LectureCourse> lectureCourses = new ArrayList<>();

        for (Course course : courses) {
            if (course instanceof LectureCourse) {
                lectureCourses.add((LectureCourse) course);
            }
        }

        return lectureCourses.toArray(new LectureCourse[0]);
    }

}

