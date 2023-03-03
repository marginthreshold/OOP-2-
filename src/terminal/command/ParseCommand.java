package terminal.command;

import java.util.List;

import static terminal.messages.ExceptionMessage.parsingExceptionMessage;

public class ParseCommand implements CommandParser {

    public static Integer parseToInt(String input) {
        Integer result = null;
        int check = -1;
        do {

            try {
                Integer.parseInt(input);
                result = Integer.parseInt(input);
                check = 1;
            } catch (Exception e) {
                parsingExceptionMessage();
            }
        } while (check != 1);
        return result;
    }

    @Override
    public Command parseCommand(List<Integer> parser) {
        return new Command(parser);
    }
}
