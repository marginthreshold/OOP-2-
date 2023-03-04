package terminal.factory;

import terminal.command.Command;
import terminal.executables.CommandExecutable;
import zoo.Zoo;

public interface CommandExecutableFactory{
    public void createCommandExecutable(Zoo zoo, Command command);

    public CommandExecutable getCommandExecutable();
}
