package terminal.executables;


import animals.Lion;
import animals.Wolf;
import terminal.command.Command;

import zoo.Zoo;

public class CreateWolfExecutable implements CommandExecutable {


        private Zoo zoo;
        private Wolf wolf;

        public CreateWolfExecutable(Zoo zoo, Command command) {
            this.zoo = zoo;
            this.wolf = new Wolf(command);
        }

        @Override
        public void execute() {
            this.zoo.addWolf(this.wolf);
        }

}
