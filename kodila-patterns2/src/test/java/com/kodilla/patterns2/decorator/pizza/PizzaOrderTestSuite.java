package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testBasicPizzaOrderGetSauce() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        Sauce theSauce = pizzaOrder.getSauce();
        //Then
        Assert.assertEquals(Sauce.TOMATO_SAUCE, theSauce);
    }

    @Test
    public void testBasicPizzaOrderGetIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        List<Ingredient> theIngredients = pizzaOrder.getIngredients();
        //Then
        Assert.assertEquals(1, theIngredients.size());
        Assert.assertEquals(Ingredient.CHEESE, theIngredients.get(0));
    }

    @Test
    public void testPizzaExtraCheeseGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaExtraCheeseDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    public void testPizzaExtraCheeseGetIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaExtraCheeseDecorator(pizzaOrder);
        //When
        List<Ingredient> theIngredients = pizzaOrder.getIngredients();
        //Then
        Assert.assertEquals(2, theIngredients.size());
        Assert.assertEquals(Ingredient.CHEESE, theIngredients.get(0));
        Assert.assertEquals(Ingredient.CHEESE, theIngredients.get(1));
    }

    @Test
    public void testPizzaWithExtraCheeseAndIngredientsGetIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new PizzaWithMushroomsDecorator(pizzaOrder);
        pizzaOrder = new PizzaWithOnionDecorator(pizzaOrder);
        pizzaOrder = new PizzaWithChiliPepersDecorator(pizzaOrder);
        //When
        List<Ingredient> theIngredients = pizzaOrder.getIngredients();
        //Then
        Assert.assertEquals(5, theIngredients.size());
        Assert.assertEquals(Ingredient.CHEESE, theIngredients.get(0));
        Assert.assertEquals(Ingredient.CHEESE, theIngredients.get(1));
        Assert.assertEquals(Ingredient.MUSHROOMS, theIngredients.get(2));
        Assert.assertEquals(Ingredient.ONION, theIngredients.get(3));
        Assert.assertEquals(Ingredient.CHILI_PEPPERS, theIngredients.get(4));
    }

    @Test
    public void testPizzaWithExtraCheeseAndIngredientsGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new PizzaWithMushroomsDecorator(pizzaOrder);
        pizzaOrder = new PizzaWithOnionDecorator(pizzaOrder);
        pizzaOrder = new PizzaWithChiliPepersDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(32), theCost);
    }
}
