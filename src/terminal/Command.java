package terminal;


import animals.Animal;
import animals.Lion;
import animals.Snake;
import animals.Wolf;
import zoo.Zoo;

import java.util.List;


public class Command {
    private CommandExecutable animalExecutable;

    private int additionalParameter;

    private List<Integer> commandParameters;

    public Command(List<Integer> commandParameters) {
        this.commandParameters = commandParameters;
    }

    public List<Integer> getCommandParameters() {
        return commandParameters;
    }

    public CommandExecutable getAnimalExecutable() {
        return animalExecutable;
    }


    public void setAdditionalParameter() {
        this.additionalParameter = commandParameters.get(2);
    }

    public void chooseCommandExecutable(Zoo zoo) {
        int age= commandParameters.get(3);
        int weight= commandParameters.get(4);
        int countLimbs= commandParameters.get(5);
        switch (getCommandParameters().get(0) * 10 + getCommandParameters().get(1)) {
            case 11:
                this.animalExecutable = new CreateLionExecutable(zoo, new Lion(age,weight,countLimbs,this.additionalParameter));
                break;
            case 12:
                this.animalExecutable = new DeleteLionExecutable(zoo, this.additionalParameter);
                break;
            case 21:
                this.animalExecutable = new CreateWolfExecutable(zoo,new Wolf(age,weight,countLimbs,this.additionalParameter));
                break;
            case 22:
                this.animalExecutable = new DeleteWolfExecutable(zoo, this.additionalParameter);
                break;
            case 31:
                this.animalExecutable = new CreateSnakeExecutable(zoo, new Snake(age,weight,countLimbs,this.additionalParameter));
                break;
            case 32:
                this.animalExecutable = new DeleteSnakeExecutable(zoo, this.additionalParameter);
                break;
        }
    }


}

