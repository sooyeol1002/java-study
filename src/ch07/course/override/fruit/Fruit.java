package ch07.course.override.fruit;

public class Fruit {
    String getColor() {
        return "Unknown color";
    }
}

class Apple extends Fruit {
    @Override
    String getColor() {
        return "Red";
    }
}

class Banana extends Fruit {
    @Override
    String getColor() {
        return "Yellow";
    }
}
