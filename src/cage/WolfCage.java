package cage;

import animals.*;
import cage.AnimalCage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WolfCage implements AnimalCage<Wolf> {
    private int countWolves;
    private int garbageVolume;
    protected static final int MAX_GARBAGE = 50;

    private List<Wolf> wolves;

    public WolfCage(List<Wolf> wolves) {
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
    public void addAnimalToCage(Wolf wolf) {
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
        if (this.wolves == null) {
            System.out.println("Клетка пуста");
            return null;
        } else {
            Random random = new Random();
            int randomWolfToGet = (int) (Math.random() * (this.wolves.size()));
            Wolf randomWolf = this.wolves.get(randomWolfToGet);
            this.wolves.remove(randomWolf);
            System.out.println(randomWolf + "удален из клетки");
            return randomWolf;
        }

    }
    public void sortWolves(){
        Collections.sort(wolves);
    }

    public void sortByAgeAndWeight(){
        Collections.sort(wolves, new WolfComparator());
    }
    @Override
    public Wolf getChosenAnimal(int wolfAngry) {
        Wolf findLionByAngry;
        int tempAngry=-1;
        for (int i = 0; i < this.wolves.size(); i++) {
            if (this.wolves.get(i).getAngry() == wolfAngry) {
                tempAngry = i;
                break;
            }
        }
        if (tempAngry==-1) {
            System.out.println("Такого злого волка нет в клетке");
            return null;
        }  else {
            findLionByAngry=wolves.get(tempAngry);
            wolves.remove(tempAngry);
            System.out.println("Из клетки с волками удален волк с уровнем злости"+" "+wolfAngry+"\n");
            return findLionByAngry;
        }
    }
}
