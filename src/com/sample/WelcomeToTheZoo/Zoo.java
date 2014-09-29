package com.sample.WelcomeToTheZoo;

import java.util.ArrayList;

/**
 * Created by BFineRocks on 9/29/14.
 */
public class Zoo {
    private ArrayList<Pen> zooPens;

    public Zoo()
    {
        zooPens = new ArrayList<Pen>();
    }

    public void addNewPenToZoo(Pen aPen)
    {
        zooPens.add(aPen);
    }

    public int findAPenInTheZoo(int penNumberSought)
    {
        int penLocation = -1;
        for(int i = 0; i < zooPens.size(); i++)
        {
            int aPen = zooPens.get(i).getPenNumber();
            if(penNumberSought == aPen)
            {
                penLocation = i;
            }
        }
        return penLocation;
    }

    public Pen getThisPen(int penNumber)
    {
        int penFound = findAPenInTheZoo(penNumber);
        return zooPens.get(penFound);
    }

    public void removeAPenFromTheZoo(int penNumberToRemove)
    {
        int penLocation = findAPenInTheZoo(penNumberToRemove);
        zooPens.remove(zooPens.get(penLocation));
    }

    public String listAllAnimalsInThisZoo()
    {
        String allAnimalsAndBabies = "";
        for(Pen aPen: zooPens)
        {
            allAnimalsAndBabies = allAnimalsAndBabies + " " + aPen.listAllAnimalsInPen() + " " + aPen.listAllBabyAnimalsInPen();
        }

        return allAnimalsAndBabies;
    }

    public int findAnimalsInPens(Animal anAnimal)
    {
        int locationOfPenHoldingAnimal = -1;
        for(int i = 0; i < zooPens.size(); i ++){
        locationOfPenHoldingAnimal =  zooPens.get(i).findAnimalInPen(anAnimal);
        }
        return locationOfPenHoldingAnimal;
    }

    public int findAnimalsInPens(BabyAnimal aBabyAnimal)
    {
        int locationOfPenHoldingAnimal = -1;
        for(int i = 0; i < zooPens.size(); i ++){
            locationOfPenHoldingAnimal =  zooPens.get(i).findAnimalInPen(aBabyAnimal);
        }
        return locationOfPenHoldingAnimal;
    }

    public void addAnimals(int penToAddIn, Animal aNewAnimal)
    {
        zooPens.get(penToAddIn).addAnimalsToPen(aNewAnimal);
    }

    public void addAnimals(int penToAddIn, BabyAnimal aNewBabyAnimal)
    {
        zooPens.get(penToAddIn).addAnimalsToPen(aNewBabyAnimal);
    }

    public void removeAnimals(int penToRemoveFrom, Animal anAnimalToRemove)
    {
        zooPens.get(penToRemoveFrom).removeAnimalFromPen(anAnimalToRemove);
    }

    public void removeAnimals(int penToRemoveFrom, BabyAnimal aBabyAnimalToRemove)
    {
        zooPens.get(penToRemoveFrom).removeAnimalFromPen(aBabyAnimalToRemove);
    }

}
