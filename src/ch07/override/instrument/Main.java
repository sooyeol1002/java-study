package ch07.override.instrument;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("qwe");
        guitar.play();

        Piano piano = new Piano("qwewqe");
        piano.play();

    }

}
