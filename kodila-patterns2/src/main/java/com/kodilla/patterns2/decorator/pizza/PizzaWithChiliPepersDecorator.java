package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class PizzaWithChiliPepersDecorator extends AbstractPizzaOrderDecorator {
    public PizzaWithChiliPepersDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> theIngredients = super.getIngredients();
        theIngredients.add(Ingredient.CHILI_PEPPERS);
        return theIngredients;
    }
}
