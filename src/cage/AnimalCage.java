package cage;

import animals.Animal;

import java.util.ArrayList;

public interface AnimalCage {

    void addAnimalToCage(Animal animal);

    void giveFoodToCage(int weightOfFood);

    void cleanCage();

    Animal getAnimalFromCage();

}
