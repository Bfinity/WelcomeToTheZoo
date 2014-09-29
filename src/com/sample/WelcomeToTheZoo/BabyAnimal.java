package com.sample.WelcomeToTheZoo;

/**
 * Created by BFineRocks on 9/29/14.
 */
public class BabyAnimal extends Animal {

   private int ageInMonths;

    public BabyAnimal(String species, String gender, String diet, int ageInMonths)
    {
        super(species, gender, diet);
        this.ageInMonths = ageInMonths;
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
        return "Species: " + getSpeciesOfAnimal() + ", Gender: " + getGenderOfAnimal() + ", Diet: " + getDietOfAnimal() + ", Age In Months: " + getAgeInMonths();
    }
}
