package factory;


import animals.Wolf;
import animals.WolfCage;

import java.util.ArrayList;

public class WolvesFactory {
    public static void main(String[] args) {
        ArrayList<Wolf> wolves = wolvesCollection(10);
        WolfCage wolvesInCage = new WolfCage(wolves);
        System.out.println(wolvesInCage);
        wolvesInCage.getAnimalFromCage();
    }

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
