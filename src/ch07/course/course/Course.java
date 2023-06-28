package ch07.course.course;

public class Course {
    String courseName;
    String courseCode;
    String instructor;

    public Course(String courseName, String courseCode, String instructor, String platform) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }

    public Course() {
    }

    public Course(String courseName, String courseCode, String instructor, String platform, int room, int time) {
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return  courseCode;
    }
    public String getInstructor() {
        return  instructor;
    }

}
