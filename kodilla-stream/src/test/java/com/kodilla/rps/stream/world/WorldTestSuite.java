package com.kodilla.rps.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country countryPoland = new Country(new BigDecimal("1000"));
        Country countryGermany = new Country(new BigDecimal("2000"));
        Country countryRussia = new Country(new BigDecimal("3000"));
        Country countryUSA = new Country(new BigDecimal("10000"));
        Country countryCanada = new Country(new BigDecimal("20000"));
        Country countryEgypt = new Country(new BigDecimal("30000"));

        Continent continentEurope = new Continent();
        continentEurope.addCountry(countryPoland);
        continentEurope.addCountry(countryGermany);
        continentEurope.addCountry(countryRussia);
        Continent continentNorthAmerica = new Continent();
        continentNorthAmerica.addCountry(countryUSA);
        continentNorthAmerica.addCountry(countryCanada);
        Continent continentAfrica = new Continent();
        continentAfrica.addCountry(countryEgypt);

        World world = new World();
        world.addContinent(continentEurope);
        world.addContinent(continentNorthAmerica);
        world.addContinent(continentAfrica);
        //When
        BigDecimal totalQuantity = world.getPeopleQuantity();
        //Then
        Assert.assertEquals(new BigDecimal("66000"), totalQuantity);
    }
}
