package zoo;

import animals.Animal;
import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;
import cage.LionCage;
import cage.SnakeCage;
import cage.WolfCage;


public class Zoo {
    private WolfCage wolvesCage;
    private LionCage lionsCage;
    private SnakeCage snakesCage;

    public Zoo(LionCage lionsCage,WolfCage wolvesCage, SnakeCage snakesCage) {
        this.wolvesCage = wolvesCage;
        this.lionsCage = lionsCage;
        this.snakesCage = snakesCage;
    }

    public Lion takeOffLion(int lionMane){
        return this.lionsCage.getChosenAnimal(lionMane);
    }

    public Wolf takeOffWolf(int wolfAngry){
        return this.wolvesCage.getChosenAnimal(wolfAngry);
    }

    public Snake takeOffSnake(int snakeLength){
        return this.snakesCage.getChosenAnimal(snakeLength);
    }


    public void addLion(Lion lion){
        this.lionsCage.addAnimalToCage(lion);
    }

    public void addWolf(Wolf wolf){
        this.wolvesCage.addAnimalToCage(wolf);
    }

    public void addSnake(Snake snake){
        this.snakesCage.addAnimalToCage(snake);
    }


}
