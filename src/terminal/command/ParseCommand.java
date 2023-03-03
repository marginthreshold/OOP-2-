package terminal.command;

import java.util.List;

import static terminal.messages.ExceptionMessage.parsingExceptionMessage;

public class ParseCommand implements CommandParser {

    public static Integer parseToInt(String input) {
        Integer result = null;
            try {
                Integer.parseInt(input);
                result = Integer.parseInt(input);
            } catch (Exception e) {
                parsingExceptionMessage();
                result=-1;
                //System.exit(1);
            }
        return result;
    }

    @Override
    public Command parseCommand(List<Integer> parser) {
        return new Command(parser);
    }
}
