package factory;

import animals.Lion;
import animals.LionCage;

import java.util.ArrayList;

public class LionsFactory {

    public static void main(String[] args) {

        ArrayList<Lion> lions = lionsCollection(10);
        LionCage lionsInCage = new LionCage(lions);
        System.out.println(lionsInCage);
        lionsInCage.getAnimalFromCage();


    }

    public static int randomParam(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public static ArrayList<Lion> lionsCollection(int lionCount) {
        ArrayList<Lion> createLions = new ArrayList<>();
        for (int i = 0; i < lionCount; i++) {
            createLions.add(new Lion(randomParam(2, 5), randomParam(190, 250), 4, 1));
        }
        return createLions;
    }
}



