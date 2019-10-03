package com.kodilla.good.patterns.food2door;

import java.util.*;

public class FoodOrderRetriver {
    private static final Random RANDOM = new Random();

    public Order retrieve(String product) {
        int quantity = RANDOM.nextInt(20);

        if (quantity < 10) {
            return new ExtraFoodShop(product, quantity);
        } else if(quantity >= 10 && quantity < 15){
            return new HealthyShop(product, quantity);
        } else {
            return new GlutenFreeShop(product, quantity);
        }
    }
}
