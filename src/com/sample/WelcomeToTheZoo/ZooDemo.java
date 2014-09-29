package com.sample.WelcomeToTheZoo;

/**
 * Created by BFineRocks on 9/29/14.
 */
public class ZooDemo {

    private Zoo myFavoriteZoo;

    public ZooDemo()
    {
        myFavoriteZoo = new Zoo();
    }

    public void addNewPens(Pen aNewPen)
    {
        myFavoriteZoo.addNewPenToZoo(aNewPen);
    }

    public void removeAPen(int penNumerToRemove)
    {
        myFavoriteZoo.removeAPenFromTheZoo(penNumerToRemove);
    }

    public int findAPenByPenNumber (int penNumber)
    {
       return myFavoriteZoo.findAPenInTheZoo(penNumber);
    }

    public int findAPenByAnimal(Animal animal)
    {
        return myFavoriteZoo.findAnimalsInPens(animal);
    }

    public void addANewAnimal(int penLocationToPutAnimal, Animal aNewAnimal)
    {
        myFavoriteZoo.addAnimals(penLocationToPutAnimal, aNewAnimal);
    }

    public void addANewAnimal(int penLocationToPutAnimal, BabyAnimal aBabyAnimal)
    {
        myFavoriteZoo.addAnimals(penLocationToPutAnimal, aBabyAnimal);
    }

    public void removeAnAnimal(int penLocationOfAnimalRemoving, Animal animalToRemove)
    {
        myFavoriteZoo.removeAnimals(penLocationOfAnimalRemoving, animalToRemove);
    }

    public void removeAnAnimal(int penLocationOfAnimalRemoving, BabyAnimal aBabyToRemove)
    {
        myFavoriteZoo.removeAnimals(penLocationOfAnimalRemoving, aBabyToRemove);
    }

    public String listAllAnimalsInAllPens()
    {
        return myFavoriteZoo.listAllAnimalsInThisZoo();
    }

    public String listAnimalsInAPen(int penNumberSought)
    {
       int penToList =  myFavoriteZoo.findAPenInTheZoo(penNumberSought);
       String animalsInPen = myFavoriteZoo.getThisPen(penToList).listAllAnimalsInPen();
        String babyAnimalsInPen = myFavoriteZoo.getThisPen(penToList).listAllBabyAnimalsInPen();

        return animalsInPen + " " + babyAnimalsInPen;
    }


}
