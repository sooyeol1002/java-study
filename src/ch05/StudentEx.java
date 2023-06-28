package ch05;

public class StudentEx {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setGrade(10);
        student.setAge(18);
        student.printStudentInfo();

        Student student1 = new Student("Lisa", 11, 16);

        student1.promoteGrade();

        student1.printStudentInfo();


    }
}
