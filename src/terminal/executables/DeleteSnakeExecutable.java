package terminal.executables;

import terminal.executables.CommandExecutable;
import zoo.Zoo;

public class DeleteSnakeExecutable implements CommandExecutable {

        private Zoo zoo;
        private int bodyLength;

        public DeleteSnakeExecutable(Zoo zoo,int bodyLength) {
            this.zoo = zoo;
            this.bodyLength = bodyLength;
        }



        @Override
        public void execute() {
            this.zoo.takeOffSnake(this.bodyLength);
        }
}
