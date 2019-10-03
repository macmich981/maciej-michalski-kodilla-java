package com.kodilla.good.patterns.food2door;

public class Food2DoorRunner {
    public static void main(String[] args) {
        FoodOrderRetriver foodOrderRetriever = new FoodOrderRetriver();
        Order order = foodOrderRetriever.retrieve("Oranges");

        OrderFoodProcess orderFoodProcess = new OrderFoodProcess(new OrderFoodRespository());
        orderFoodProcess.run(order);
    }
}
