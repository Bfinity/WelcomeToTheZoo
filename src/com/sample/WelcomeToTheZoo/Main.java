package com.sample.WelcomeToTheZoo;

/**
 * Created by BFineRocks on 9/29/14.
 */
public class Main {
    public static ZooDemo aNewZoo;
    public static Animal animals;
    public static BabyAnimal baby;
    public static Pen pens;


    public static void main(String[] args) {
        animals = new Animal("Bear", "Female", "meat");
        pens = new Pen(1);
        pens.addAnimalsToPen(animals);
        aNewZoo = new ZooDemo();
        aNewZoo.addNewPens(pens);

        baby = new BabyAnimal("Bear", "male", "fish", 24);
        pens.addAnimalsToPen(baby);

       System.out.println(aNewZoo.listAllAnimalsInAllPens());


    }
}
