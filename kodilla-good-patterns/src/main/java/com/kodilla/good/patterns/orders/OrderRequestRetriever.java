package com.kodilla.good.patterns.orders;

public class OrderRequestRetriever {
    private OrderRequest request;

    public OrderRequestRetriever() {
        User user = new User(1, "Jan", "Kowalski", "kowalski@mail.org", "123456789");
        Product product = new Product(1, "Laptop", 2500.00);
        request = new OrderRequest(user, product, 1);
    }

    public OrderRequest retrieve() {
        return request;
    }
}
