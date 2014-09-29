package com.sample.WelcomeToTheZoo;

/**
 * Created by BFineRocks on 9/29/14.
 */

import java.util.ArrayList;

public class Pen {

    private ArrayList<Animal> animalsInPen;
    private ArrayList<BabyAnimal> babyAnimalsInPen;
    private int penNumber;

    public Pen(int penNumber)
    {
        animalsInPen = new ArrayList<Animal>();
        babyAnimalsInPen = new ArrayList<BabyAnimal>();
        this.penNumber = penNumber;
    }

    public int getPenNumber()
    {
        return penNumber;
    }

    public void addAnimalsToPen(Animal anAnimal)
    {
        animalsInPen.add(anAnimal);
    }

    public int findAnimalInPen(Animal animalSought)
    {
        int locationOfAnimalInPen = 0;
        for(int i = 0; i < animalsInPen.size(); i++)
        {
            Animal anAnimal = animalsInPen.get(i);
            if(animalSought.equals(anAnimal))
            {
                locationOfAnimalInPen = i;
            }

        }
        return locationOfAnimalInPen;
    }

    public void removeAnimalFromPen(Animal animalToRemove)
    {
        int animalToGo =  findAnimalInPen(animalToRemove);
        animalsInPen.remove(animalToGo);
    }

    public void addAnimalsToPen(BabyAnimal aBabyAnimal)
    {
        babyAnimalsInPen.add(aBabyAnimal);
    }

    public int findAnimalInPen(BabyAnimal babyAnimalSought)
    {
        int locationOfBabyAnimalInPen = 0;
        for(int i = 0; i < babyAnimalsInPen.size(); i++)
        {
            BabyAnimal aBabyAnimal = babyAnimalsInPen.get(i);
            if(babyAnimalSought.equals(aBabyAnimal))
            {
                locationOfBabyAnimalInPen = i;
            }

        }
        return locationOfBabyAnimalInPen;
    }

    public void removeAnimalFromPen(BabyAnimal babyAnimalToRemove)
    {
        int animalToGo =  findAnimalInPen(babyAnimalToRemove);
        babyAnimalsInPen.remove(animalToGo);
    }

    public String listAllAnimalsInPen()
    {
        String allAnimalsInPen = "";
        for(Animal anAnimal: animalsInPen)
        {
            allAnimalsInPen = allAnimalsInPen + anAnimal.animalInformation() + " ; ";
        }

        return  allAnimalsInPen;
    }

    public String listAllBabyAnimalsInPen()
    {
        String allBabyAnimalsInPen = "";
        for(BabyAnimal aBabyAnimal: babyAnimalsInPen)
        {
            allBabyAnimalsInPen = allBabyAnimalsInPen + aBabyAnimal.babyAnimalInformation() + " ; ";
        }

        return  allBabyAnimalsInPen;
    }

    public String listAdultAndBabyAnimals()
    {
        return "Adults In The Pen: " + listAllAnimalsInPen() + " Babies In The Pen: " + listAllBabyAnimalsInPen();
    }


}
