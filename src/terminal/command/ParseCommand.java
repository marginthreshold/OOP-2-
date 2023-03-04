package terminal.command;

import java.util.List;

public class ParseCommand implements CommandParser {

    @Override
    public Command parseCommand(List<Integer> parser) {
        return new Command(parser);
    }


}
