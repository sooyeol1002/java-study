package ch00.course;

public class Main {
    public static void main(String[] args) {
        Course course1 = new LectureCourse("Java", "00001", "고대근", 707, 9);
        Course course2 = new LectureCourse("Go", "00002", "김성우", 705, 8);
        Course course3 = new OnlineCourse("Kotlin", "00003", "남소나", "naver");
        Course course4 = new OnlineCourse("Javascript", "00004", "양수열", "kakao");
        Course course5 = new Course("ahf","00005", "몰라");

        CourseManager courseManager = new CourseManager();

        courseManager.addCourse(course1);
        courseManager.addCourse(course3);
        courseManager.addCourse(course5);

        courseManager.printCourses();
        System.out.println("--------------------");
        courseManager.displayOnlineCourse();
    }
}
