package terminal.command;


import terminal.executables.CommandExecutable;

import java.util.List;


public class Command {
    private CommandExecutable animalExecutable;


    private List<Integer> commandParameters;

    public Command(List<Integer> commandParameters) {
        this.commandParameters = commandParameters;
    }

    public List<Integer> getCommandParameters() {
        return commandParameters;
    }

    public CommandExecutable getAnimalExecutable() {
        return animalExecutable;
    }

    public void setAnimalExecutable(CommandExecutable animalExecutable) {
        this.animalExecutable = animalExecutable;
    }
}

