package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String name;

   ArrayList<Pet> petArray = new ArrayList<>();
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */


    public PetOwner(String name, Pet... pets) {
        this.name=name;
        if(pets!=null) {
            for (int i =0;i<pets.length;i++) {
                pets[i].setOwner(this);
                petArray.add(pets[i]);
            }
        }

    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
    petArray.add(pet);
    pet.setOwner(this);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
    petArray.remove(pet);
    if(petArray.size() == 0){
        petArray.add(null);
    }

    }
    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return pet.getOwner() == this;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngetAge = 10;
        for (int i = 0; i < petArray.size(); i++) {
            if(petArray.get(i).getAge() < youngetAge){
                youngetAge = petArray.get(i).getAge();
            }
        }


        return youngetAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldestAge = 0;
        for (int i = 0; i < petArray.size(); i++) {
            if(petArray.get(i).getAge() > oldestAge){
                oldestAge = petArray.get(i).getAge();
            }
        }


        return oldestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float ans = 0;
        int petAgeSum = 0;
        int counter=0;
        for (int i = 0; i < petArray.size(); i++) {
            petAgeSum+= petArray.get(i).getAge();
        }
        for (int i = 0; i <petArray.size() ; i++) {
            counter++;
        }

        ans=petAgeSum/counter;
        return ans;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return petArray.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return petArray.toArray(new Pet[petArray.size()]);

    }
}
