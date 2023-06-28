package ch07.course.course;

public class OnlineCourse extends Course {
    public String platform;

    public String getPlatform(){
        return platform;
    }
    public OnlineCourse(String courseName, String courseCode, String instructor, String platform) {
        super(courseName, courseCode, instructor, platform);
        this.platform = platform;
    }
}
