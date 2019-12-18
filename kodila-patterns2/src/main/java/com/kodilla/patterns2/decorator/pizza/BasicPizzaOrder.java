package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicPizzaOrder implements PizzaOrder {
    private final List<Ingredient> ingredients = new ArrayList<>(Collections.singletonList(Ingredient.CHEESE));
    private Sauce sauce;

    public BasicPizzaOrder() {
        sauce = Sauce.TOMATO_SAUCE;
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public Sauce getSauce() {
        return sauce;
    }

    @Override
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
