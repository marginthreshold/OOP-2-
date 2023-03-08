package terminal.menu;

import static terminal.menu.ReturnInput.returnInput;
import static terminal.messages.ExceptionMessage.*;

public class InputValidation {
    public static Integer returnCorrectMenuNumber(int min, int max) {
        int command = -1;
        while (command == -1 || command > max) {
            try {
                command = returnInput();
                if (command > max) {
                    menuExceptionMaxValue(max);
                    command = -1;
                } else if (command < min) {
                    menuExceptionMinValue(min);
                    command = -1;
                }
            } catch (Exception e) {
                parsingExceptionMessage();
                command = -1;
            }
        }

        return command;
    }
}

