package terminal.executables;

import animals.Lion;
import terminal.command.Command;
import zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable {

    private Zoo zoo;
    private Lion lion;

    public CreateLionExecutable(Zoo zoo, Command command) {
        this.zoo = zoo;
        this.lion = new Lion(command);
    }

    @Override
    public void execute() {
        this.zoo.addLion(this.lion);
    }
}
