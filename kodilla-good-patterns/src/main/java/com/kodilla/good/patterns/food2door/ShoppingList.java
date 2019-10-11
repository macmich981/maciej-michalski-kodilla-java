package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList {
    private User user;
    private Map<Product, Integer> shoppingList = new HashMap<>();

    public ShoppingList(User user) {
        this.user = user;
    }

    public void addToList(Product product, Integer quantity) {
        shoppingList.put(product, quantity);
    }

    public User getUser() {
        return user;
    }

    public Map<Product, Integer> getShoppingList() {
        return shoppingList;
    }
}
