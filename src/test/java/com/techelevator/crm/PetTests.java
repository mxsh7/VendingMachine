package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PetTests {

    @Test
    public void Pet_test_vaccines() {

        //arrange
        Pet pet = new Pet();

        //act - methods

        List<String> petVaccinations = new ArrayList<String>(){};
        pet.setVaccination(petVaccinations);
        petVaccinations.add("Rabies");
        petVaccinations.add("Distemper");
        petVaccinations.add("Parvo");
        String resultList = pet.listVaccinations();

        //assert
        String expectedResults = "Rabies, Distemper, Parvo";

        Assert.assertEquals(expectedResults, resultList);
    }

}
