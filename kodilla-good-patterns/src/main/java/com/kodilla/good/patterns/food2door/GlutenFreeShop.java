package com.kodilla.good.patterns.food2door;

import java.util.List;
import java.util.stream.Collectors;

public class GlutenFreeShop implements OrderService {
    public void process(ShoppingList shoppingList) {

        List<Product> newList = shoppingList.getShoppingList().keySet().stream()
        .filter(key -> key.getContractorName().equals(Contractors.GLUTEN_FREE_SHOP))
        .collect(Collectors.toList());

        System.out.println("GlutenFreeShop realizuje zamówienie dla " + shoppingList.getUser() + " dla towarów: ");
        newList.stream()
        .map(product -> product.getProductName() + " ")
        .forEach(System.out::println);
    }
}
