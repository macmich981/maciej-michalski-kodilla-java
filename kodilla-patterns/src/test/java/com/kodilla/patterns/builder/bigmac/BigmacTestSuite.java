package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMacBuilder() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
        .Bun(Bun.SEZAM)
        .Burgers(2)
        .Sauce(Sauce.STANDARD)
        .Ingredients(Ingredient.ONION)
        .Ingredients(Ingredient.CHEESE)
        .Ingredients(Ingredient.BACON)
        .build();
        //When
        //Then
        System.out.println(bigMac);
        Assert.assertEquals(Bun.SEZAM, bigMac.getBun());
        Assert.assertEquals(Sauce.STANDARD, bigMac.getSauce());
        Assert.assertEquals(2, bigMac.getBurgers());
        Assert.assertEquals(3, bigMac.getIngredients().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBigMacBuilderBadBun() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
        .Bun(Bun.valueOf("normal"))
        .Burgers(2)
        .Sauce(Sauce.STANDARD)
        .Ingredients(Ingredient.ONION)
        .Ingredients(Ingredient.CHEESE)
        .Ingredients(Ingredient.BACON)
        .build();
        //When
        //Then
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBigMacBuilderBadSauce() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
        .Bun(Bun.SEZAM)
        .Burgers(2)
        .Sauce(Sauce.valueOf("garlic"))
        .Ingredients(Ingredient.ONION)
        .Ingredients(Ingredient.CHEESE)
        .Ingredients(Ingredient.BACON)
        .build();
        //When
        //Then
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBigMacBuilderBadIngredient() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
        .Bun(Bun.SEZAM)
        .Burgers(2)
        .Sauce(Sauce.STANDARD)
        .Ingredients(Ingredient.ONION)
        .Ingredients(Ingredient.CHEESE)
        .Ingredients(Ingredient.BACON)
        .Ingredients(Ingredient.valueOf("old egg"))
        .build();
        //When
        //Then
    }
}
