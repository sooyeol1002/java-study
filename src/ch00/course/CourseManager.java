package ch00.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseManager {

    List<Course> courses; // Course배열


    public CourseManager() {
        this.courses = new ArrayList<>();
    }



    public void addCourse(Course course) {
        this.courses.add(course);
        System.out.println("강의가 개설되었습니다.");
    }



    public void printCourses() {
        for (Course course: this.courses){
            if(course instanceof OnlineCourse) {
                OnlineCourse onlineCourse = (OnlineCourse) course;
                System.out.println("온라인 강의 : "+ onlineCourse.getCourseName());
            } else if (course instanceof  LectureCourse) {
                LectureCourse lectureCourse = (LectureCourse) course;
                System.out.println("오프라인 강의 : " + lectureCourse.getCourseName());
            } else  if (course instanceof Course) {
                System.out.println("나는 태생 Course라 못나와");
            }
        }
    }
    public Course getCourseByInstructor(String instructor) {
        for (Course course : this.courses) {
            if (course.getInstructor().equals(instructor)){
                return course;
            }
        }
        return null;
    }

    public List<Course> getOnlineCourses() {
        List<Course> onlineCourses = new ArrayList<>();

        for (Course course : this.courses) {
            if (course instanceof OnlineCourse) {
                onlineCourses.add(course);
            }
        }
        return onlineCourses;
    }

    public List<Course> getLectureCourses() {
        List<Course> lectureCourses = new ArrayList<>();

        for (Course course : courses) {
            if (course instanceof LectureCourse) {
                lectureCourses.add(course);
            }
        }

        return lectureCourses;
    }

    public void displayOnlineCourse() {
        List<Course> onlineCourses = getOnlineCourses();
        for ( Course course:onlineCourses) {
            System.out.println("온라인 강의 : " + course.getCourseName());
        }
    }

}

