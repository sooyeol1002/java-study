package ch08.ex2;

public class Student implements Gradable, Studyable{
    private int score;
    public void study() {
        System.out.println("학생이 공부중입니다.");
    }
    @Override
    public String calculateGrade() {
        if (score >= 90 ) {
            return "A+";
        } else if (score >= 80) {
            return "A";
        } else if (score >= 70 ) {
            return "B+";
        } else if (score >= 60) {
            return "B";
        } else if (score >= 50) {
            return "C+";
        } else if (score >= 40) {
            return "C";
        } else if (score >= 30) {
            return "D+";
        } else if (score >= 20) {
            return "D";
        } else {
            return "F";
        }
    }
}
