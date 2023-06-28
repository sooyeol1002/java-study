package ch08.ex;

public class Human implements Walkable, Runnable{
    public void run() {
        System.out.println("Human is running fast!");
    }
    public void walk() {
        System.out.println("Human is walking slow!");
    }
}
