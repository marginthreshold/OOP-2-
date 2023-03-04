package terminal.executables;

import animals.Lion;
import terminal.command.Command;
import zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable {

    private Zoo zoo;
    private Lion lion;

    public CreateLionExecutable(Zoo zoo, Command command) {
        this.zoo = zoo;
        this.lion = new Lion(command.getCommandParameters().get(3), command.getCommandParameters().get(4),
                command.getCommandParameters().get(5), command.getCommandParameters().get(2));
    }

    @Override
    public void execute() {
        this.zoo.addLion(this.lion);
    }
}
