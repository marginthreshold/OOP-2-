package terminal.menu;

import java.util.ArrayList;
import java.util.List;
import static terminal.menu.CommandMenu.*;
import static terminal.menu.CommandMenu.requestAnimalCountLimbsMenu;
import static terminal.menu.InputValidation.returnCorrectMenuNumber;
import static terminal.messages.ExceptionMessage.menuExceptionMessage;

public class FillParametersFromMenu {

    public static List<Integer> callMenu() {

        List<Integer> commandParameters = new ArrayList<>();

        chooseAddDelMenu();
        int userCommandAddDel = returnCorrectMenuNumber(1, 3);
        if (userCommandAddDel == 3) {
            menuExceptionMessage();
            System.exit(1);
        }
        chooseAnimalMenu();
        int chosenAnimal = returnCorrectMenuNumber(1, 3);
        commandParameters.add(chosenAnimal);
        commandParameters.add(userCommandAddDel);
        requestAdditionalParameterMenu(chosenAnimal);
        commandParameters.add(returnCorrectMenuNumber(0, 10));

        if (userCommandAddDel == 1) {
            requestAnimalAgeMenu();
            commandParameters.add(returnCorrectMenuNumber(0, 70));
            requestAnimalWeightMenu();
            commandParameters.add(returnCorrectMenuNumber(0, 400));
            requestAnimalCountLimbsMenu();
            commandParameters.add(returnCorrectMenuNumber(0, 4));
        }

        return commandParameters;
    }
}
