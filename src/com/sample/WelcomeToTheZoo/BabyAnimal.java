package com.sample.WelcomeToTheZoo;

/**
 * Created by BFineRocks on 9/29/14.
 */
public class BabyAnimal extends Animal {

   private int ageInMonths;

    public BabyAnimal(String nameOfAnimal, String speciesOfAnimal, String genderOfAnimal, String dietOfAnimal, int ageInMonths)
    {
        super(nameOfAnimal, speciesOfAnimal, genderOfAnimal, dietOfAnimal);
        this.ageInMonths = ageInMonths;
    }

    public void setNameOfAnimal(String nameOfAnimal)
    {
        super.setNameOfAnimal(nameOfAnimal);
    }


    public String getNameOfAnimal() {
        return super.getNameOfAnimal();
    }

    public void setSpeciesOfAnimal(String speciesOfAnimal) {
        super.setSpeciesOfAnimal(speciesOfAnimal);
    }


    public void setGenderOfAnimal(String genderOfAnimal) {
        super.setGenderOfAnimal(genderOfAnimal);
    }


    public void setDietOfAnimal(String dietOfAnimal) {
        super.setDietOfAnimal(dietOfAnimal);
    }


    public String getSpeciesOfAnimal() {
        return super.getSpeciesOfAnimal();
    }

    public String getGenderOfAnimal() {
        return super.getGenderOfAnimal();
    }


    public String getDietOfAnimal() {
        return super.getDietOfAnimal();
    }

    public void setAgeInMonths(int ageInMonths)
    {
        this.ageInMonths = ageInMonths;
    }

    public int getAgeInMonths()
    {
        return ageInMonths;
    }

    public String babyAnimalInformation()
    {
        return "Name: " + getNameOfAnimal() +  ", Species: " + getSpeciesOfAnimal() + ", Gender: " + getGenderOfAnimal() + ", Diet: " + getDietOfAnimal() + ", Age In Months: " + getAgeInMonths();
    }
}
