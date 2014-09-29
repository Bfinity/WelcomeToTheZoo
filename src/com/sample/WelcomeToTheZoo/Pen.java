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

    public int findAnimalInPen(String animalNameSought)
    {
        int locationOfAnimalInPen = -1;
        for(int i = 0; i < animalsInPen.size(); i++)
        {
            String aniName = animalsInPen.get(i).getNameOfAnimal();
            if(animalNameSought.equalsIgnoreCase(aniName))
            {
                locationOfAnimalInPen = i;
            }
            String aniBName = babyAnimalsInPen.get(i).getNameOfAnimal();
            if(animalNameSought.equalsIgnoreCase(aniBName))
            {
                locationOfAnimalInPen = i;
            }

        }
        return locationOfAnimalInPen;
    }

    public Animal getAnimalFromPen(String animalNameSought)
    {
        int animalFound = findAnimalInPen(animalNameSought);
            return animalsInPen.get(animalFound);
    }

    public BabyAnimal getBabyFromPen(String babyAnimalNameSought)
    {
        int babyFound = findAnimalInPen(babyAnimalNameSought);
        return babyAnimalsInPen.get(babyFound);
    }

    public void removeAnimalFromPen(Animal animalToRemove)
    {
        animalsInPen.remove(animalToRemove);
    }

    public void addAnimalsToPen(BabyAnimal aBabyAnimal)
    {
        babyAnimalsInPen.add(aBabyAnimal);
    }


/*
    public int findAnimalInPen(String babyAnimalNameSought)
    {
        int locationOfBabyAnimalInPen = 0;
        for(int i = 0; i < babyAnimalsInPen.size(); i++)
        {
            String aBabyAnimalName = babyAnimalsInPen.get(i).getNameOfAnimal();
            if(babyAnimalNameSought.equals(aBabyAnimalName))
            {
                locationOfBabyAnimalInPen = i;
            }

        }
        return locationOfBabyAnimalInPen;
    }
*/

    public void removeAnimalFromPen(BabyAnimal babyAnimalToRemove)
    {
        babyAnimalsInPen.remove(babyAnimalToRemove);
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

    public int howManyAnimalsInPen()
    {
        return animalsInPen.size();
    }

    public int howManyBabyAnimalsInPen()
    {
        return babyAnimalsInPen.size();
    }

    public boolean isThereAMaleAndFemaleAdultInPen()
    {
        boolean bothSexes = false;
        int numFemales = 0;
        int numMales = 0;

        for(Animal animal: animalsInPen)
        {
            if (animal.getGenderOfAnimal().equalsIgnoreCase("female"))
            {
                numFemales++;
            }
            if (animal.getGenderOfAnimal().equalsIgnoreCase("male"))
            {
                numMales++;
            }
        }
        if(numFemales >= 1 && numMales >= 1)
        {
            bothSexes = true;
        }

        return bothSexes;
    }


}
