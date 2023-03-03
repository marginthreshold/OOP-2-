package terminal.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static terminal.command.ParseCommand.returnCorrectMenu;
import static terminal.menu.CommandMenu.*;
import static terminal.menu.CommandMenu.requestAnimalCountLimbsMenu;

import static terminal.messages.ExceptionMessage.menuExceptionMessage;
import static terminal.command.ParseCommand.parseToInt;

public class MenuExecutable {


    public static List<Integer> callMenu() {

        List<Integer> commandParameters = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
            chooseAddDelMenu();
            int userCommandAddDel = returnCorrectMenu(parseToInt(sc.next()),3);
            if (userCommandAddDel == 3) {
                menuExceptionMessage();
                sc.close();
                System.exit(1);
            }
            chooseAnimalMenu();
            int chosenAnimal = returnCorrectMenu(parseToInt(sc.next()),3);
            commandParameters.add(chosenAnimal);
            commandParameters.add(userCommandAddDel);
            requestAdditionalParameterMenu(chosenAnimal);
            commandParameters.add(returnCorrectMenu(parseToInt(sc.next()),10));

            if (userCommandAddDel == 1) {
                requestAnimalAgeMenu();
                commandParameters.add(returnCorrectMenu(parseToInt(sc.next()),70));
                requestAnimalWeightMenu();
                commandParameters.add(returnCorrectMenu(parseToInt(sc.next()),400));
                requestAnimalCountLimbsMenu();
                commandParameters.add(returnCorrectMenu(parseToInt(sc.next()),4));

            }

        return commandParameters;
    }
}
