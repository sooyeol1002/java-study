package ch08.ex3;

public class Main {
    public static void main(String[] args) {
        MusicPlayer mp3Player = new MP3Player();
        MusicPlayer streamingPlayer = new StreamingMusicPlayer();

        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();
        System.out.println("--------------");
        streamingPlayer.play();
        streamingPlayer.pause();
        streamingPlayer.stop();
    }
}
