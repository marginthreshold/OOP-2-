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
            this.wolf = new Wolf(command.getCommandParameters().get(3), command.getCommandParameters().get(4),
                    command.getCommandParameters().get(5), command.getCommandParameters().get(2));;
        }

        @Override
        public void execute() {
            this.zoo.addWolf(this.wolf);
        }

}
