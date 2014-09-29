package com.sample.WelcomeToTheZoo;

/**
 * Created by BFineRocks on 9/29/14.
 */
public class Animal {
    private String speciesOfAnimal;
    private String genderOfAnimal;
    private String dietOfAnimal;
    private String nameOfAnimal;

    public Animal(String nameOfAnimal, String speciesOfAnimal, String genderOfAnimal, String dietOfAnimal)
    {
        this.nameOfAnimal = nameOfAnimal;
        this.speciesOfAnimal = speciesOfAnimal;
        this.genderOfAnimal = genderOfAnimal;
        this.dietOfAnimal = dietOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal)
    {
        this.nameOfAnimal = nameOfAnimal;
    }

    public String getNameOfAnimal()
    {
        return nameOfAnimal;
    }

    public void setSpeciesOfAnimal(String speciesOfAnimal)
    {
        this.speciesOfAnimal = speciesOfAnimal;
    }

    public void setGenderOfAnimal(String genderOfAnimal)
    {
        this.genderOfAnimal = genderOfAnimal;
    }

    public void setDietOfAnimal(String dietOfAnimal)
    {
        this.dietOfAnimal = dietOfAnimal;
    }


    public String getSpeciesOfAnimal()
    {
        return  speciesOfAnimal;
    }

    public String getGenderOfAnimal()
    {
        return  genderOfAnimal;
    }

    public String getDietOfAnimal()
    {
        return dietOfAnimal;
    }

    public String animalInformation()
    {
        return "Name: " + getNameOfAnimal() +  ", Species: " +  getSpeciesOfAnimal() + ", Gender: " + getGenderOfAnimal() + ", Diet: " + getDietOfAnimal();
    }
}
