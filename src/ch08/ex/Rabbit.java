package ch08.ex;

public class Rabbit implements Runnable{
    @Override
    public  void run() {
        System.out.println("The rabbit is running fast!");
    }
}

