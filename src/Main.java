import animals.Lion;
import animals.Snake;
import cage.LionCage;
import animals.Wolf;
import cage.SnakeCage;
import cage.WolfCage;

import factory.CommandExecutableFactory;
import terminal.CommandExecutable;
import terminal.CommandParser;
import terminal.ParseCommand;
import terminal.TerminalReader;
import zoo.Zoo;


import java.util.List;


import static factory.LionsFactory.lionsCollection;
import static factory.SnakesFactory.snakesCollection;
import static factory.WolvesFactory.wolvesCollection;

public class Main {
    public static void main(String[] args) {
        List<Lion> lions = lionsCollection(10);
        LionCage lionsInCage = new LionCage(lions);
//        System.out.println(lionsInCage);

        lionsInCage.sortLions();
        System.out.println(lionsInCage);
//        lionsInCage.getAnimalFromCage();
//        lionsInCage.sortByLionMane();
//        System.out.println(lionsInCage);

        List<Snake> snakes = snakesCollection(10);
        SnakeCage snakesInCage = new SnakeCage(snakes);
        snakesInCage.sortSnakes();
        System.out.println(snakesInCage);


        List<Wolf> wolves = wolvesCollection(10);
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
        CommandParser parseCommand = new ParseCommand();
        TerminalReader terminalReader = TerminalReader.newTerminalReader(parseCommand);
        terminalReader.endless();
        terminalReader.getTerminalCommand().chooseCommandExecutable(zoo);

        CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory();
        CommandExecutable commandExecutable = commandExecutableFactory.createExecutable(zoo,terminalReader.getTerminalCommand());

        commandExecutable.execute();

        lionsInCage.sortLions();
        snakesInCage.sortSnakes();
        wolvesInCage.sortWolves();
        System.out.println(lionsInCage);
        System.out.println(snakesInCage);
        System.out.println(wolvesInCage);


    }
}
