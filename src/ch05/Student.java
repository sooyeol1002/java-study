package ch05;

public class Student {
    String name;
    int grade;
    int age;

    public Student(){

    }

    public Student(String name, int grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setGrade(int newGrade) {
        grade = newGrade;

    }

    public void setAge(int newAge) {
        age = newAge;
    }
    int getAge(){
        return age;
    }
    public void promoteGrade() {
        grade++;
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name + ", Grade: " + grade + ", Age: " + age);


    }
}