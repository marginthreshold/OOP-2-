package animals;

import cage.AnimalCage;

import java.util.ArrayList;
import java.util.Random;

public class WolfCage implements AnimalCage {
    private int countWolves;
    private int garbageVolume;
    protected static final int MAX_GARBAGE = 50;

    private ArrayList<Wolf> wolves;

    public WolfCage(ArrayList<Wolf> wolves) {
        this.wolves = wolves;
        countWolves = wolves.size();
        garbageVolume = countWolves * 2;
    }

    @Override
    public String toString() {
        return " " + wolves +
                " ";
    }

    @Override
    public void addAnimalToCage(Animal wolf) {
        wolves.add((Wolf) wolf);
        countWolves++;
        garbageVolume += 2;

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

    @Override
    public Wolf getAnimalFromCage() {
        Random random = new Random();
        int randomWolfToGet = (int) (Math.random() * (this.wolves.size()));
        Wolf randomWolf = this.wolves.get(randomWolfToGet);
        this.wolves.remove(randomWolf);
        System.out.println(randomWolf + "удален из клетки");
        return randomWolf;
    }

}
