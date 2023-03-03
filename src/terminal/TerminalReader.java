package terminal;

import factory.CommandExecutableFactory;
import terminal.command.Command;
import terminal.command.CommandParser;
import terminal.executables.CommandExecutable;
import zoo.Zoo;

import static terminal.menu.MenuExecutable.callMenu;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;
    private Zoo zoo;

    private Command terminalCommand;

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser, Zoo zoo) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        terminalReader.zoo = zoo;
        return terminalReader;
    }


    public void endless() {
        while(true) {
            this.terminalCommand = this.commandParser.parseCommand(callMenu());
            CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory();
            commandExecutableFactory.chooseCommandExecutable(this.zoo, this.terminalCommand);
            CommandExecutable commandExecutable = commandExecutableFactory.createExecutable(this.zoo, this.terminalCommand);
            commandExecutable.execute();
            System.out.println(this.zoo);
        }
    }
}
