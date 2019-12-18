package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public interface PizzaOrder {
    BigDecimal getCost();
    Sauce getSauce();
    List<Ingredient> getIngredients();
}
