package com.sample.WelcomeToTheZoo;

/**
 * Created by BFineRocks on 9/29/14.
 */
public class Main {
    public static ZooDemo aNewZoo;


    public static void main(String[] args) {
        Animal momaBear = new Animal("Bear", "Female", "meat");
        Pen bearPens = new Pen(1);
        bearPens.addAnimalsToPen(momaBear);
        aNewZoo = new ZooDemo();
        aNewZoo.addNewPens(bearPens);
        BabyAnimal babyBear = new BabyAnimal("Bear", "male", "fish", 24);
        bearPens.addAnimalsToPen(babyBear);

        Animal popaBear = new Animal("Bear", "Male", "fruit");
        int penLocation =  aNewZoo.findAPenByAnimal(momaBear);
        aNewZoo.addANewAnimal(penLocation, popaBear);

       System.out.println(aNewZoo.listAllAnimalsInAllPens());


    }
}
