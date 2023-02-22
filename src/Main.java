import animals.Lion;
import cage.LionCage;
import animals.Wolf;
import cage.WolfCage;

import java.util.ArrayList;

import static animalUtils.AnimalUtils.sortAnimalByAge;
import static factory.LionsFactory.lionsCollection;
import static factory.WolvesFactory.wolvesCollection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lion> lions = lionsCollection(10);
        LionCage lionsInCage = new LionCage(lions);
        System.out.println(lionsInCage);

        lionsInCage.sortLions();
        System.out.println(lionsInCage);
        lionsInCage.getAnimalFromCage();
        lionsInCage.sortByLionMane();
        System.out.println(lionsInCage);

        ArrayList<Wolf> wolves = wolvesCollection(10);
        WolfCage wolvesInCage = new WolfCage(wolves);
        System.out.println(wolvesInCage);

        wolvesInCage.sortWolves();
        System.out.println(wolvesInCage);
        wolvesInCage.getAnimalFromCage();
        wolvesInCage.sortByAgeAndWeight();
        System.out.println(wolvesInCage);

        sortAnimalByAge(wolves);

    }
}
