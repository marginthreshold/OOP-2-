package factory;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import terminal.*;


import zoo.Zoo;


public class CommandExecutableFactory {


    public CommandExecutable createExecutable(Zoo zoo, Command command) {

        return command.getAnimalExecutable();
    }

    public void chooseCommandExecutable(Zoo zoo,Command command) {
        int age = command.getCommandParameters().get(3);
        int weight = command.getCommandParameters().get(4);
        int countLimbs = command.getCommandParameters().get(5);
        int additionalParameter = command.getCommandParameters().get(2);
        switch (command.getCommandParameters().get(0) * 10 + command.getCommandParameters().get(1)) {
            case 11:
                command.setAnimalExecutable(new CreateLionExecutable(zoo, new Lion(age, weight, countLimbs, additionalParameter)));
                break;
            case 12:
                command.setAnimalExecutable(new DeleteLionExecutable(zoo, additionalParameter));
                break;
            case 21:
                command.setAnimalExecutable(new CreateWolfExecutable(zoo, new Wolf(age, weight, countLimbs, additionalParameter)));
                break;
            case 22:
                command.setAnimalExecutable(new DeleteWolfExecutable(zoo, additionalParameter));
                break;
            case 31:
                command.setAnimalExecutable(new CreateSnakeExecutable(zoo, new Snake(age, weight, countLimbs, additionalParameter)));
                break;
            case 32:
                command.setAnimalExecutable(new DeleteSnakeExecutable(zoo, additionalParameter));
                break;
        }
    }

}
