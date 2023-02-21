package factory;


import animals.Wolf;

import java.util.ArrayList;

public class WolvesFactory {


    public static int randomParam(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public static ArrayList<Wolf> wolvesCollection(int countWolves) {
        ArrayList<Wolf> createWolves = new ArrayList<>();
        for (int i = 0; i < countWolves; i++) {
            createWolves.add(new Wolf(randomParam(1, 4), randomParam(30, 55), 4, randomParam(0, 5)));
        }
        return createWolves;
    }
}
