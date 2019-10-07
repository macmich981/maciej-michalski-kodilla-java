package com.kodilla.good.patterns.food2door;

public class Food2DoorProcessor {
    private Shop orderService;

    public Food2DoorProcessor(Shop orderService) {
        this.orderService = orderService;
    }

    public void process(final ShoppingList userShoppingList) {

        orderService.process(userShoppingList.getUser(), userShoppingList);
    }
}
