package ch00.course;

public class OnlineCourse extends Course {
    public String platform;


    public OnlineCourse(String courseName, String courseCode, String instructor, String platform) {
        super(courseName, courseCode, instructor);
        this.platform = platform;
    }

    public String getPlatform(){
        return platform;
    }
}
