package com.sample.WelcomeToTheZoo;

/**
 * Created by BFineRocks on 9/29/14.
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class ZooKeeper {

    Scanner zooKeeperInput = new Scanner(System.in);
    Zoo myAwesomeZoo = new Zoo();
    Pen animalPens;
    Animal anAnimal;
    BabyAnimal aBabyAnimal;
    Habitat animalHabitats;
    String welcome = "Welcome to the Zoo Keeper. Please enter you ID number and password.";
    String options = "Please select an option. 1: Add Something/Someone New. 2: Search The Zoo. 3: Get Zoo Information " +
            "4: Remove Something/Someone";
    String addDirections = "You chose the Add option. What are we adding today? 1: Build a New Pen. 2: Add a new adult animal. " +
            "3: Add a new baby animal ";
    String searchDirections = "You chose the Search option. What are you searching for today? 1: A pen 2: An Adult or Baby Animal ";
    String informationDirections = "You chose Get Zoo Information. What information do you need? 1: Number of Pens in the Zoo " +
            "2: Number of Adult Animals 3: Number of Baby Animals 4: Total Number of All Animals 5: List of All Animal's Information";
    String removeDirections = "You chose the Remove option. What do you need to remove today? 1: A Pen 2: An Adult Animal 3: A Baby Animal";
    String penAddGreeting ="New Pen? Got it!";
    String penAccess = "Please enter the Pen Number.";
    String addAnimalGreeting = "Okay! Let's add a new animal!";
    String addAnimalName = "Please enter the animal's name";
    String addANewAnimalSpecies = "Please enter the animal's species:";
    String addANewAnimalGender = "Please enter the animal's gender:";
    String addANewAnimalDiet = "Please enter the animal's diet:";
    String addANewAnimalAge = "Please enter the baby animal's age in months:";
    String placeAnimalIntoPen = "Please enter the Pen Number where this animal has been placed:";
    String findAPenInTheZoo = "Please enter the Pen Number you are looking for:";
    String findAnimalInZoo = "Please enter the name of the animal you are looking for:";
    String thereAre = "There are ";
    String numberOfPens = " number of Pens in the Zoo.";
    String numberOfAdults = " number of Adult Animals in the Zoo.";
    String numberOfBabies = " number of Baby Animals in the Zoo.";
    String numberOfAnimalsTotal = " number of Animals in Total in the Zoo.";
    String printOutInformation = "The following is detailed information about all the animals in the zoo:";
    String defaultStatement = "That option is not available.";
    String animalName = "";
    String animalSpecies = "";
    String animalGender = "";
    String animalDiet = "";



    public String welcome()
    {
        return welcome;
    }

    public void zooOptions()
    {
       System.out.println(options);
        switch(choice)
        {
            case 1:
                addOptions();
                break;

            case 2:
                searchOption();
                break;

            case 3:
                zooInformationOption();
                break;

            case 4:
                removeOption();
                break;

            default:
                System.out.println(defaultStatement);
                zooOptions();
        }
    }

    public void addOptions()
    {
        System.out.println(addDirections);
        switch(choice)
        {
            case 1:
                System.out.println(penAddGreeting);
                System.out.println(penAccess);
                myAwesomeZoo.addNewPenToZoo(zooKeeperInput.nextInt());

            case 2:
                addAnAnimalMethod();
                break;

            case 3:
                addABabyAnimalMethod();;
                break;


            default:
                System.out.println(defaultStatement);
                addOptions();
        }
    }

    public void searchOption()
    {
        System.out.println(searchDirections);
        switch (choice)
        {
            case 1:

            case 2:

            default:
                System.out.println(defaultStatement);
                searchOption();
        }
    }

    public void zooInformationOption()
    {
        System.out.println(informationDirections);
        switch (choice)
        {
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:

            default:
                System.out.println(defaultStatement);
                zooInformationOption();
        }
    }

    public void removeOption()
    {
        System.out.println(removeDirections);
        switch (choice)
        {
            case 1:

            case 2:

            case 3:

            default:
                System.out.println(defaultStatement);
                removeOption();

        }
    }

    public int checkForValidChoice(int choiceOptions)
    {
        int validInt = -1;
        try{
            if(zooKeeperInput.hasNextInt()) {
                validInt = zooKeeperInput.nextInt();
                if (validInt < choiceOptions && validInt > 0) {
                    return validInt;
                } else {
                    System.out.println(defaultStatement);
                }
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println(defaultStatement);
        }

        return validInt;

    }

    public void addAnAnimalMethod()
    {
        System.out.println(addAnimalGreeting);
        System.out.println(addAnimalName);
        animalName = zooKeeperInput.nextLine();
        System.out.println(addANewAnimalSpecies);
        animalSpecies = zooKeeperInput.nextLine();
        System.out.println(addANewAnimalGender);
        animalGender = zooKeeperInput.nextLine();
        System.out.println(addANewAnimalDiet);
        animalDiet = zooKeeperInput.nextLine();
        anAnimal = new Animal(animalName, animalSpecies, animalGender, animalDiet);
        System.out.println(placeAnimalIntoPen);
        myAwesomeZoo.addAnimals(zooKeeperInput.nextInt(), anAnimal);

    }

    public void addABabyAnimalMethod()
    {
        System.out.println(addAnimalGreeting);
        System.out.println(addAnimalName);
        animalName = zooKeeperInput.nextLine();
        System.out.println(addANewAnimalSpecies);
        animalSpecies = zooKeeperInput.nextLine();
        System.out.println(addANewAnimalGender);
        animalGender = zooKeeperInput.nextLine();
        System.out.println(addANewAnimalDiet);
        animalDiet = zooKeeperInput.nextLine();
        System.out.println(addANewAnimalAge);
        int animalAge = zooKeeperInput.nextInt();
        aBabyAnimal = new BabyAnimal(animalName, animalSpecies, animalGender, animalDiet, animalAge);
        System.out.println(placeAnimalIntoPen);
        myAwesomeZoo.addAnimals(zooKeeperInput.nextInt(), anAnimal);
    }

    public void searchPenMethod()
    {
        System.out.println(findAPenInTheZoo);
        myAwesomeZoo.findAPenInTheZoo(zooKeeperInput.nextInt())
    }

    public Animal searchAnimalMethod()
    {
        System.out.println(findAnimalInZoo);
        animalName = zooKeeperInput.nextLine();
        int location = myAwesomeZoo.findPenNumberOfAnimal(animalName);
        myAwesomeZoo.getThisPen(location).getAnimalFromPen(animalName).animalInformation();
    }






}
