package terminal.executables;

import terminal.command.Command;
import zoo.Zoo;

public class DeleteWolfExecutable implements CommandExecutable {

        private Zoo zoo;
        private int wolfAngry;

        public DeleteWolfExecutable(Zoo zoo, Command command) {
            this.zoo = zoo;
            this.wolfAngry = command.getCommandParameters().get(2);
        }

        @Override
        public void execute() {
            this.zoo.takeOffWolf(this.wolfAngry);
        }
}
