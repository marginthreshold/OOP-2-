package cage;


import animals.Lion;
import animals.Snake;
import animals.SnakeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SnakeCage implements AnimalCage<Snake> {

    private int countSnakes;
    private int garbageVolume;
    private List<Snake> snakes;
    protected static final int MAX_GARBAGE = 30;

    public SnakeCage(List<Snake> snakes) {
        this.snakes = snakes;
        countSnakes = snakes.size();
        garbageVolume = this.countSnakes;
    }


    @Override
    public String toString() {
        return " " + snakes +
                " ";
    }

    @Override
    public void addAnimalToCage(Snake snake) {
        snakes.add((Snake) snake);
        countSnakes++;
        garbageVolume += 1;
    }

    @Override
    public void giveFoodToCage(int weightOfFood) {
        garbageVolume += weightOfFood;
    }

    @Override
    public void cleanCage() {
        if (garbageVolume >= MAX_GARBAGE) {
            garbageVolume = 0;
            System.out.println("Клетка почищена");
        } else {
            System.out.println("Пока еще чисто");
        }
    }

    public List<Snake> getSnakes() {
        snakes = this.snakes;
        return snakes;
    }

    @Override
    public Snake getAnimalFromCage() {
        if (this.snakes == null) {
            System.out.println("Клетка пуста");
            return null;
        } else {
            Random random = new Random();
            int randomSnakeToGet = (int) (Math.random() * (this.snakes.size()));
            Snake randomSnake = this.snakes.get(randomSnakeToGet);
            this.snakes.remove(randomSnake);
            System.out.println(randomSnake + "удален из клетки");
            return randomSnake;
        }
    }

    public void sortSnakes() {
        Collections.sort(snakes);
    }

    public void sortByBodyLength() {
        Collections.sort(snakes, new SnakeComparator());
    }

    @Override
    public Snake getChosenAnimal(int snakeLength) {
        Snake findLSnakeByBL;
        int tempBL = -1;
        for (int i = 0; i < this.snakes.size(); i++) {
            if (this.snakes.get(i).getBodyLength() == snakeLength) {
                tempBL = i;
                break;
            }
        }
        if (tempBL == -1) {
            System.out.println("Змеи такой длины нет в клетке");
            return null;
        } else {
            findLSnakeByBL = snakes.get(tempBL);
            snakes.remove(tempBL);
            System.out.println("Из клетки со змеями удалена змея с длиной тела"+" "+snakeLength+"\n");
            return findLSnakeByBL;
        }
    }

}
