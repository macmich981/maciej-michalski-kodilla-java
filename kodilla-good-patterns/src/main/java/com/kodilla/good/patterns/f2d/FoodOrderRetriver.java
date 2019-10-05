package com.kodilla.good.patterns.f2d;

import com.kodilla.good.patterns.food2door.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.HealthyShop;
import com.kodilla.good.patterns.food2door.Order;

import java.util.Random;

public class FoodOrderRetriver {
    private static final Random RANDOM = new Random();

    public Order retrieve(String product) {
        int quantity = RANDOM.nextInt(20);

        if (quantity < 10) {
            return new ExtraFoodShop(product, quantity);
        } else if(quantity > 10 && quantity < 15){
            return new HealthyShop(product, quantity);
        } else {
            return new GlutenFreeShop(product, quantity);
        }
    }
}
