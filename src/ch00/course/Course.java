package ch00.course;

public class Course {
    String courseName;
    String courseCode;
    String instructor;

    public Course(String courseName, String courseCode, String instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
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
