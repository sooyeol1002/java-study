package ch07.override.instrument;

public class Instrument {
    private String test;

    public Instrument(String test) {
        this.test = test;
    }

    public void play() {
        System.out.println("악기를 연주합니다.");
    }
}

    class Guitar extends Instrument {
        public Guitar(String test) {
            super(test);
        }

        @Override
        public void play() {
            super.play();
            System.out.println("띠리리링");
        }
    }

    class Piano extends Instrument {
        public Piano(String test) {
            super(test);
        }
        @Override
        public void play() {
            super.play();
            System.out.println("피아노피아노~");
        }

    }
