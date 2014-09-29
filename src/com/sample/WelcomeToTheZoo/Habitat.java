package com.sample.WelcomeToTheZoo;

/**
 * Created by BFineRocks on 9/29/14.
 */
public class Habitat {

    private Animal anAnimal;
    private BabyAnimal aBabyAnimal;
    private String animalHabitat;

    public Habitat(Animal animal, String animalHabitat)
    {
        this.anAnimal = animal;
        this.animalHabitat = animalHabitat;
    }

    public Habitat(BabyAnimal aBabyAnimal, String animalHabitat)
    {
        this.aBabyAnimal = aBabyAnimal;
        this.animalHabitat = animalHabitat;
    }
}
