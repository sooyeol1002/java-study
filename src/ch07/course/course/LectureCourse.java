package ch07.course.course;

public class LectureCourse extends Course {
    private int room;
    private int time;


    public int getRoom() {
        return room;
    }

    public int getTime() {
        return time;
    }

    public LectureCourse(String courseName, String courseCode,
                         String instructor, String platform, int room,
                  int time) {
        super(courseName, courseCode, instructor, platform);
        this.room = room;
        this.time = time;
    }

}
