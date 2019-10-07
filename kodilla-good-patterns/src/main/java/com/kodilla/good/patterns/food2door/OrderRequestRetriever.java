package com.kodilla.good.patterns.food2door;

import java.util.List;

public class OrderRequestRetriever {
    public ShoppingList retrieve(List<Product> productList) {

        User user = new User("Jan", "Kowalski", "ul. Kasztanowa, Wrocław");

        ShoppingList userCart = new ShoppingList(user);

        userCart.addToList(productList.get(0), 7);
        userCart.addToList(productList.get(1), 23);
        userCart.addToList(productList.get(2), 10);
        userCart.addToList(productList.get(6), 3);

        return userCart;
    }
}
