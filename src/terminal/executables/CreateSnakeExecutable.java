package terminal.executables;


import animals.Snake;

import terminal.command.Command;
import zoo.Zoo;

public class CreateSnakeExecutable implements CommandExecutable{


        private Zoo zoo;
        private Snake snake;

        public CreateSnakeExecutable(Zoo zoo, Command command) {
            this.zoo = zoo;
            this.snake = new Snake(command.getCommandParameters().get(3), command.getCommandParameters().get(4),
                    command.getCommandParameters().get(5), command.getCommandParameters().get(2));
        }

        @Override
        public void execute() {
            this.zoo.addSnake(this.snake);
        }
}
