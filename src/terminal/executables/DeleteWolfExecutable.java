package terminal.executables;

import terminal.executables.CommandExecutable;
import zoo.Zoo;

public class DeleteWolfExecutable implements CommandExecutable {

        private Zoo zoo;
        private int wolfAngry;

        public DeleteWolfExecutable(Zoo zoo,int wolfAngry) {
            this.zoo = zoo;
            this.wolfAngry = wolfAngry;
        }



        @Override
        public void execute() {
            this.zoo.takeOffWolf(this.wolfAngry);
        }
}
