package factory;

import terminal.command.Command;
import terminal.executables.CommandExecutable;
import zoo.Zoo;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl{
    @Override
    public CommandExecutable createExecutable(Zoo zoo, Command command) {
        System.out.println("Start");
        CommandExecutable newCE = super.createExecutable(zoo, command);
        System.out.println("End");
        return newCE;
    }
}
