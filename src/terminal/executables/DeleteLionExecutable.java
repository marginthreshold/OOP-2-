package terminal.executables;

import terminal.executables.CommandExecutable;
import zoo.Zoo;

public class DeleteLionExecutable implements CommandExecutable {

    private Zoo zoo;
    private int lionMane;

    public DeleteLionExecutable(Zoo zoo,int lionMane) {
        this.zoo = zoo;
        this.lionMane = lionMane;
    }



    @Override
    public void execute() {
       this.zoo.takeOffLion(this.lionMane);
    }
}
