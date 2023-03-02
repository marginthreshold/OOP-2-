package factory;

import animals.Lion;

import java.util.ArrayList;
import java.util.List;

public class LionsFactory {


    public static int randomParam(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public static List<Lion> lionsCollection(int lionCount) {
        List<Lion> createLions = new ArrayList<>();
        for (int i = 0; i < lionCount; i++) {
            createLions.add(new Lion(randomParam(2, 5), randomParam(190, 250), 4, randomParam(1, 5)));
        }
        return createLions;
    }
}



