package terminal.factory;

import terminal.command.Command;
import terminal.executables.*;
import zoo.Zoo;


public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    private CommandExecutable commandExecutable;

    public CommandExecutable getCommandExecutable() {
        return commandExecutable;
    }

    public void createCommandExecutable(Zoo zoo, Command command) {

        switch (command.getParameterAddDellAnimal()) {
            case 11:
                this.commandExecutable = new CreateLionExecutable(zoo, command);
                break;
            case 12:
                this.commandExecutable = new DeleteLionExecutable(zoo, command);
                break;
            case 21:
                this.commandExecutable = new CreateWolfExecutable(zoo, command);
                break;
            case 22:
                this.commandExecutable = new DeleteWolfExecutable(zoo, command);
                break;
            case 31:
                this.commandExecutable = new CreateSnakeExecutable(zoo, command);
                break;
            case 32:
                this.commandExecutable = new DeleteSnakeExecutable(zoo, command);
                break;

        }
    }

}
