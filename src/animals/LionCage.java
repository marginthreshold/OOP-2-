package animals;

import cage.AnimalCage;

import java.util.ArrayList;
import java.util.Random;

public class LionCage implements AnimalCage {
    private int countLions;
    private int garbageVolume;
    private ArrayList<Lion> lions;
    protected static final int MAX_GARBAGE = 70;


    public LionCage(ArrayList<Lion> lions) {
        this.lions = lions;
        countLions = lions.size();
        garbageVolume = this.countLions * 3;
    }


    @Override
    public String toString() {
        return " " + lions +
                " ";
    }

    @Override
    public void addAnimalToCage(Animal lion) {
        lions.add((Lion) lion);
        countLions++;
        garbageVolume += 3;
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

    public ArrayList<Lion> getLions() {
        lions = this.lions;
        return lions;
    }

    @Override
    public Lion getAnimalFromCage() {
        Random random = new Random();
        int randomLionToGet = (int) (Math.random() * (this.lions.size()));
        Lion randomLion = this.lions.get(randomLionToGet);
        this.lions.remove(randomLion);
        System.out.println(randomLion + "удален из клетки");
        return randomLion;
    }
}
