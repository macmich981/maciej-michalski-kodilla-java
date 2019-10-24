package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMacBuilder() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
        .Bun("sezam")
        .Burgers(2)
        .Sauce("standard")
        .Ingredients("cebula")
        .Ingredients("ser")
        .Ingredients("bekon")
        .build();
        //When
        //Then
        System.out.println(bigMac);
        Assert.assertEquals("sezam", bigMac.getBun());
        Assert.assertEquals("standard", bigMac.getSauce());
        Assert.assertEquals(2, bigMac.getBurgers());
        Assert.assertEquals(3, bigMac.getIngredients().size());
    }

    @Test(expected = IllegalStateException.class)
    public void testBigMacBuilderBadBun() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
        .Bun("zwykla")
        .Burgers(2)
        .Sauce("standard")
        .Ingredients("cebula")
        .Ingredients("ser")
        .Ingredients("bekon")
        .build();
        //When
        //Then
    }

    @Test(expected = IllegalStateException.class)
    public void testBigMacBuilderBadSauce() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
        .Bun("sezam")
        .Burgers(2)
        .Sauce("czosnkowy")
        .Ingredients("cebula")
        .Ingredients("ser")
        .Ingredients("bekon")
        .build();
        //When
        //Then
    }

    @Test(expected = IllegalStateException.class)
    public void testBigMacBuilderBadIngredient() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
        .Bun("sezam")
        .Burgers(2)
        .Sauce("standard")
        .Ingredients("cebula")
        .Ingredients("ser")
        .Ingredients("bekon")
        .Ingredients("stare jajo")
        .build();
        //When
        //Then
    }
}
