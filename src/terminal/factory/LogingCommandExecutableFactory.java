package terminal.factory;

import terminal.command.Command;
import zoo.Zoo;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl{

    @Override
    public void createCommandExecutable(Zoo zoo, Command command) {
        System.out.println("Start");
        super.createCommandExecutable(zoo, command);
        System.out.println("End");

    }
}
