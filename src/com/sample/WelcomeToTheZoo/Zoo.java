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

    public ArrayList getPens()
    {
        return zooPens;
    }

    public void addNewPenToZoo(int penNumber)
    {
        Pen aNewPen = new Pen(penNumber);
        zooPens.add(aNewPen);
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

    public String printOutAllPenNumbersUsed()
    {
        String pensUsed = "";
        for(Pen aPen: zooPens)
        {
           pensUsed = pensUsed +" " +  String.valueOf(aPen.getPenNumber());
        }
        return pensUsed;
    }

    public Pen getThisPen(int penLocation)
    {
        return zooPens.get(penLocation);
    }

    public void removeAPenFromTheZoo(int penNumberToRemove)
    {
        int location = findAPenInTheZoo(penNumberToRemove);
        Pen penToRemove = getThisPen(location);
        zooPens.remove(penToRemove);
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
        int penLocation = -1;
        for(int i = 0; i < zooPens.size(); i++)
        {
           if(zooPens.get(i).findAnimalInPen(animalName) > -1)
           {
               penLocation = i;
           }
        }
        return penLocation;
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
                System.out.println("There is not a male and a female adult in this pen. A baby cannot be placed here.");
            }

        }
        else{
            System.out.println("This pen is full.");
        }
    }



    public void removeAnimals(String animalNameToRemove)
    {
        int locationOfAnimal = findPenNumberOfAnimal(animalNameToRemove);
        Animal animalToRemove = zooPens.get(locationOfAnimal).getAnimalFromPen(animalNameToRemove);
        zooPens.get(locationOfAnimal).removeAnimalFromPen(animalToRemove);
    }

    public void removeBabyAnimal(String animalNameToRemove)
    {
        int locationOfAnimal = findPenNumberOfAnimal(animalNameToRemove);
        BabyAnimal animalToRemove = zooPens.get(locationOfAnimal).getBabyAnimalFromPen(animalNameToRemove);
        zooPens.get(locationOfAnimal).removeAnimalFromPen(animalToRemove);

    }

    public int getNumberOfPensInZoo()
    {
        return zooPens.size();
    }

    public int getNumberOfAdultsInZoo()
    {
        int numAdults = 0;
        for(Pen aPen: zooPens)
        {
            numAdults = aPen.howManyAnimalsInPen();
        }
        return  numAdults;
    }

    public int getNumberOfBabiesInZoo()
    {
        int numBabies = 0;
        for(Pen aPen: zooPens)
        {
            numBabies = aPen.howManyBabyAnimalsInPen();
        }
        return  numBabies;
    }

    public int getTotalNumberOfAnimals()
    {
        int numAnimals = 0;
        for(Pen aPen: zooPens)
        {
            numAnimals = aPen.howManyAnimalsInPen() + aPen.howManyBabyAnimalsInPen();
        }
        return numAnimals;
    }



}
