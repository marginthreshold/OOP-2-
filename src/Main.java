import animals.Lion;
import animals.Snake;
import cage.LionCage;
import animals.Wolf;
import cage.SnakeCage;
import cage.WolfCage;
import terminal.command.ParseCommand;
import terminal.TerminalReader;
import zoo.Zoo;


import java.util.List;


import static factory.LionsFactory.lionsCollection;
import static factory.SnakesFactory.snakesCollection;
import static factory.WolvesFactory.wolvesCollection;

public class Main {
    public static void main(String[] args) {
        List<Lion> lions = lionsCollection(2);
        LionCage lionsInCage = new LionCage(lions);
//        System.out.println(lionsInCage);

        lionsInCage.sortLions();
        System.out.println(lionsInCage);
//        lionsInCage.getAnimalFromCage();
//        lionsInCage.sortByLionMane();
//        System.out.println(lionsInCage);

        List<Snake> snakes = snakesCollection(2);
        SnakeCage snakesInCage = new SnakeCage(snakes);
        snakesInCage.sortSnakes();
        System.out.println(snakesInCage);


        List<Wolf> wolves = wolvesCollection(2);
        WolfCage wolvesInCage = new WolfCage(wolves);
//        System.out.println(wolvesInCage);

        wolvesInCage.sortWolves();
        System.out.println(wolvesInCage);
//        wolvesInCage.getAnimalFromCage();
//        wolvesInCage.sortByAgeAndWeight();
//        System.out.println(wolvesInCage);
//
//        sortAnimalByAge(wolves);

        Zoo zoo = new Zoo(lionsInCage, wolvesInCage, snakesInCage);
        TerminalReader terminalReader = TerminalReader.newTerminalReader(new ParseCommand(),zoo);
        terminalReader.endless();

    }
}
