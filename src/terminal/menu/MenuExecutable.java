package terminal.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static terminal.menu.CommandMenu.*;
import static terminal.menu.CommandMenu.requestAnimalCountLimbsMenu;
import static terminal.messages.ExceptionMessage.menuExceptionMessage;
import static terminal.command.ParseCommand.parseToInt;

public class MenuExecutable {


    public static List<Integer> callMenu() {

        List<Integer> commandParameters = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

            chooseAddDelMenu();
            int userCommandAddDel = parseToInt(sc.next());
            if (userCommandAddDel > 2) {
                menuExceptionMessage();
                sc.close();
                System.exit(1);
            }
            chooseAnimalMenu();
            int chosenAnimal = parseToInt(sc.next());
            commandParameters.add(chosenAnimal);
            commandParameters.add(userCommandAddDel);
            requestAdditionalParameterMenu(chosenAnimal);
            commandParameters.add(parseToInt(sc.next()));

            if (userCommandAddDel == 1) {
                requestAnimalAgeMenu();
                commandParameters.add(parseToInt(sc.next()));
                requestAnimalWeightMenu();
                commandParameters.add(parseToInt(sc.next()));
                requestAnimalCountLimbsMenu();
                commandParameters.add(parseToInt(sc.next()));

            }

        return commandParameters;
    }
}
