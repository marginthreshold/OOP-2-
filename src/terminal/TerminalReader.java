package terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static terminal.CommandMenu.*;
import static terminal.ExceptionMessage.menuExceptionMessage;
import static terminal.ParseCommand.parseToInt;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;

    private Command terminalCommand;

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    public Command getTerminalCommand() {
        return terminalCommand;
    }

    public void endless() {
        Scanner sc = new Scanner(System.in);
        int userCommandAddDel = 0;
        int chosenAnimal = 0;
        int additionalParameter = 0;
        List<Integer> comandParameters = new ArrayList<Integer>();
            try {
                chooseAddDelMenu();
                userCommandAddDel = parseToInt(sc.next());
                chooseAnimalMenu();
                chosenAnimal = parseToInt(sc.next());
                comandParameters.add(chosenAnimal);
                comandParameters.add(userCommandAddDel);
                requestAdditionalParameterMenu(chosenAnimal);
                additionalParameter = parseToInt(sc.next());
                comandParameters.add(additionalParameter);

                if (userCommandAddDel == 1) {
                    requestAnimalAgeMenu();
                    comandParameters.add(parseToInt(sc.next()));
                    requestAnimalWeightMenu();
                    comandParameters.add(parseToInt(sc.next()));
                    requestAnimalCountLimbsMenu();
                    comandParameters.add(parseToInt(sc.next()));

                }

            } catch (Exception e) {
                menuExceptionMessage();
            }
        sc.close();
        this.terminalCommand = this.commandParser.parseCommand(comandParameters);
        this.terminalCommand.setAdditionalParameter();
    }
}
