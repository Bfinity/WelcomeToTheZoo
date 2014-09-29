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

    public String listAllAnimalsInThisZoo() {
        String allAnimalsAndBabies = "";
        for (Pen aPen : zooPens) {
            allAnimalsAndBabies = allAnimalsAndBabies + " " + aPen.listAdultAndBabyAnimals();
        }

        return allAnimalsAndBabies;
    }

    public int findPenNumberOfAnimal(String animalName)
    {
        int penNumber = -1;
        for(Pen aPen : zooPens)
        {
            penNumber = aPen.findAnimalInPen(animalName);
        }
        return penNumber;
    }


    public void addAnimals(int penToAddIn, Animal aNewAnimal)
    {
        if(zooPens.get(penToAddIn).howManyAnimalsInPen() < 4){
        zooPens.get(penToAddIn).addAnimalsToPen(aNewAnimal);}
        else{
            System.out.println("This pen is full.");
        }
    }

    public void addAnimals(int penToAddIn, BabyAnimal aNewBabyAnimal)
    {
        if(zooPens.get(penToAddIn).howManyBabyAnimalsInPen() < 10)
        {
            if(zooPens.get(penToAddIn).isThereAMaleAndFemaleAdultInPen())
            {
                zooPens.get(penToAddIn).addAnimalsToPen(aNewBabyAnimal);
            }
            else
            {
                System.out.println("There is not a male and a female adult in this pen.");
            }

        }
        else{
            System.out.println("This pen is full.");
        }
    }

    public void removeAnimals(String animalNameToRemove)
    {
        int locationOfAnimal = findPenNumberOfAnimal(animalNameToRemove);
        zooPens.remove(locationOfAnimal);
    }



}
