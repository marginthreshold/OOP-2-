package factory;

import terminal.command.Command;
import terminal.executables.CommandExecutable;
import zoo.Zoo;

public interface CommandExecutableFactory{
    public CommandExecutable createExecutable(Zoo zoo, Command command);
    public void chooseCommandExecutable(Zoo zoo, Command command);
}
