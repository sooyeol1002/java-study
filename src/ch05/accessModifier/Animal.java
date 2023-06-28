package ch05.accessModifier;

public class Animal {
    // go(long)
    // var name string;  // protected
    // var Name string;  // public
    protected String name; // protected 멤버 변수
    protected void eat(){ // protected 메서드
        System.out.println(("The animal is eating"));
    }
}
