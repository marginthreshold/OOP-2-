package terminal.executables;


import animals.Wolf;
import terminal.executables.CommandExecutable;
import zoo.Zoo;

public class CreateWolfExecutable implements CommandExecutable {


        private Zoo zoo;
        private Wolf wolf;

        public CreateWolfExecutable(Zoo zoo,Wolf wolf) {
            this.zoo = zoo;
            this.wolf = wolf;
        }

        @Override
        public void execute() {
            this.zoo.addWolf(this.wolf);
        }

}
