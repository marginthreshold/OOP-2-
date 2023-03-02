package factory;

import terminal.Command;
import terminal.CommandExecutable;


import zoo.Zoo;


public class CommandExecutableFactory {


    public CommandExecutable createExecutable(Zoo zoo, Command command) {

        return command.getAnimalExecutable();
    }
}
