package com.kodilla.good.patterns.food2door;

import java.util.List;
import java.util.stream.Collectors;

public class GlutenFreeShop implements Shop {
    public void process(User user, ShoppingList shoppingList) {

        List<Product> newList = shoppingList.getShoppingList().keySet().stream()
                .filter(key -> key.getContractorName().equals("GlutenFreeShop"))
                .collect(Collectors.toList());

        System.out.println("GlutenFreeShop realizuje zamówienie dla " + user.getUserSurname() + "dla towarów: ");
        newList.stream().map(product -> product.getProductName() + " ").forEach(System.out::println);
    }
}
