package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class PizzaWithOnionDecorator extends AbstractPizzaOrderDecorator {
    public PizzaWithOnionDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> theIngredients = super.getIngredients();
        theIngredients.add(Ingredient.ONION);
        return theIngredients;
    }
}
