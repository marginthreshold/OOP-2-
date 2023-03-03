package terminal.command;

import java.util.List;
import java.util.Scanner;

import static terminal.messages.ExceptionMessage.parsingExceptionMessage;

public class ParseCommand implements CommandParser {

    public static Integer parseToInt(String input) {
        Integer result = null;
        try {
            Integer.parseInt(input);
            result = Integer.parseInt(input);
            if (result < 0) {
                result = -1;
            }
        } catch (Exception e) {
            parsingExceptionMessage();
            result = -1;
            //System.exit(1);
        }
        return result;
    }

    @Override
    public Command parseCommand(List<Integer> parser) {
        return new Command(parser);
    }

    public static Integer returnCorrectMenu(int command, int limitNumbers) {
        Scanner sc = new Scanner(System.in);
        while (command == -1 || command > limitNumbers) {
            try {
                command = parseToInt(sc.next());
                if (command > limitNumbers) {
                    System.out.println("Значение должно быть меньше введенного, попробуйте ввести еще раз");
                    command = -1;
                } else if (command < 0) {
                    System.out.println("Значение должно быть не меньше 0,попробуйте ввести еще раз");
                }
            } catch (Exception e) {
                parsingExceptionMessage();
                command = -1;
            }
        }
        return command;
    }

}
