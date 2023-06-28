package ch08.ex3;

public class MP3Player implements MusicPlayer{
    @Override
    public Object play() {
        System.out.println("---재생중---");
        return null;
    }

    @Override
    public void pause() {
        System.out.println("---일시정지---");
    }

    @Override
    public void stop() {
        System.out.println("---정지---");
    }
}
