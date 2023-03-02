package factory;

import animals.Snake;


import java.util.ArrayList;
import java.util.List;

public class SnakesFactory {
    public static int randomParam(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public static List<Snake> snakesCollection(int countSnakes) {
        List<Snake> createSnakes = new ArrayList<>();
        for (int i = 0; i < countSnakes; i++) {
            createSnakes.add(new Snake(randomParam(1, 4), randomParam(3, 15), 0, randomParam(3, 5)));
        }
        return createSnakes;
    }
}
