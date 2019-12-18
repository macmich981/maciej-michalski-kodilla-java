package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class PizzaExtraCheeseDecorator extends AbstractPizzaOrderDecorator {
    public PizzaExtraCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> theIngredients = super.getIngredients();
        theIngredients.add(Ingredient.CHEESE);
        return theIngredients;
    }
}
