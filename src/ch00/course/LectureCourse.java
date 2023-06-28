package ch00.course;

public class LectureCourse extends Course {
    private int room;
    private int time;


    public LectureCourse(String courseName, String courseCode, String instructor, int room, int time) {
        super(courseName, courseCode, instructor);
        this.room = room;
        this.time = time;
    }

    public int getRoom() {
        return room;
    }

    public int getTime() {
        return time;
    }

}
