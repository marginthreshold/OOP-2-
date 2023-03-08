package terminal.executables;


import animals.Snake;

import terminal.command.Command;
import zoo.Zoo;

public class CreateSnakeExecutable implements CommandExecutable{


        private Zoo zoo;
        private Snake snake;

        public CreateSnakeExecutable(Zoo zoo, Command command) {
            this.zoo = zoo;
            this.snake = new Snake(command);
        }

        @Override
        public void execute() {
            this.zoo.addSnake(this.snake);
        }
}
