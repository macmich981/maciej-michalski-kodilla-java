package com.kodilla.good.patterns.f2d;

import com.kodilla.good.patterns.food2door.Order;

public class Food2DoorRunner {
    public static void main(String[] args) {
        FoodOrderRetriver foodOrderRetriever = new FoodOrderRetriver();
        Order order = foodOrderRetriever.retrieve("Oranges");

        OrderFoodProcess orderFoodProcess = new OrderFoodProcess();
        orderFoodProcess.run(order);
    }
}
