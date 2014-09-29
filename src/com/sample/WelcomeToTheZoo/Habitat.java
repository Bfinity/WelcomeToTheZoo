package com.sample.WelcomeToTheZoo;

/**
 * Created by BFineRocks on 9/29/14.
 */
public class Habitat {

    private Animal anAnimal;
    private BabyAnimal aBabyAnimal;
    private HabitatTypes habitatTypes;

    public Habitat(Animal animal, HabitatTypes habitatTypes)
    {
        this.anAnimal = animal;
        this.habitatTypes = habitatTypes;
    }

    public Habitat(BabyAnimal aBabyAnimal, HabitatTypes habitatTypes)
    {
        this.aBabyAnimal = aBabyAnimal;
        this.habitatTypes = habitatTypes;
    }
}
