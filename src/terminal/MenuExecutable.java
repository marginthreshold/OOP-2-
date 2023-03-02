package terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static terminal.CommandMenu.*;
import static terminal.CommandMenu.requestAnimalCountLimbsMenu;
import static terminal.ExceptionMessage.menuExceptionMessage;
import static terminal.ParseCommand.parseToInt;

public class MenuExecutable {


    public static List<Integer> callMenu() {

        List<Integer> comandParameters = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

            chooseAddDelMenu();
            int userCommandAddDel = parseToInt(sc.next());
            if (userCommandAddDel > 2) {
                menuExceptionMessage();
                System.exit(1);
            }
            chooseAnimalMenu();
            int chosenAnimal = parseToInt(sc.next());
            comandParameters.add(chosenAnimal);
            comandParameters.add(userCommandAddDel);
            requestAdditionalParameterMenu(chosenAnimal);
            comandParameters.add(parseToInt(sc.next()));

            if (userCommandAddDel == 1) {
                requestAnimalAgeMenu();
                comandParameters.add(parseToInt(sc.next()));
                requestAnimalWeightMenu();
                comandParameters.add(parseToInt(sc.next()));
                requestAnimalCountLimbsMenu();
                comandParameters.add(parseToInt(sc.next()));

            }
        sc.close();
        return comandParameters;
    }
}
