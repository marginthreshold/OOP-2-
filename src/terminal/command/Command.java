package terminal.command;

import java.util.List;

public class Command {

    private List<Integer> commandParameters;

    private int parameterAddDellAnimal;
    public Command(List<Integer> commandParameters) {
        this.commandParameters = commandParameters;
        this.parameterAddDellAnimal=commandParameters.get(0) * 10 + commandParameters.get(1);
    }

    public List<Integer> getCommandParameters() {
        return commandParameters;
    }

    public int getParameterAddDellAnimal() {
        return parameterAddDellAnimal;
    }
}

