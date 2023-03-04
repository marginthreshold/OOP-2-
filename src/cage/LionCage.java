package cage;

import animals.Animal;
import animals.Lion;
import animals.LionComparator;
import cage.AnimalCage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LionCage implements AnimalCage<Lion> {
    private int countLions;
    private int garbageVolume;
    private List<Lion> lions;
    protected static final int MAX_GARBAGE = 70;


    public LionCage(List<Lion> lions) {
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
    public void addAnimalToCage(Lion lion) {
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

    public List<Lion> getLions() {
        lions = this.lions;
        return lions;
    }

    @Override
    public Lion getAnimalFromCage() {
        if (this.lions == null) {
            System.out.println("Клетка пуста");
            return null;
        } else {
            Random random = new Random();
            int randomLionToGet = (int) (Math.random() * (this.lions.size()));
            Lion randomLion = this.lions.get(randomLionToGet);
            this.lions.remove(randomLion);
            System.out.println(randomLion + "удален из клетки");
            return randomLion;
        }
    }

    public void sortLions() {
        Collections.sort(lions);
    }

    public void sortByLionMane() {
        Collections.sort(lions, new LionComparator());
    }

    @Override
    public Lion getChosenAnimal(int lionMane) {
        Lion findLionByMane;
        int tempMane=-1;
            for (int i = 0; i < this.lions.size(); i++) {
                if (this.lions.get(i).getManeVolume() == lionMane) {
                    tempMane = i;
                    break;
                }
            }
        if (tempMane==-1) {
            System.out.println("Льва с такой гривой нет в клетке");
            return null;
        }  else {
            findLionByMane=lions.get(tempMane);
            lions.remove(tempMane);
            System.out.println("Из клетки со львами удален лев с гривой"+" "+lionMane+"\n");
            return findLionByMane;
        }
    }
}
