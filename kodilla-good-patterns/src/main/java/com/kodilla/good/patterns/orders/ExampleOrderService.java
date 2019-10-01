package com.kodilla.good.patterns.orders;

import java.time.LocalDate;

public class ExampleOrderService implements OrderService {
    private static int lastId = 0;

    @Override
    public Order order(OrderRequest request) {
        return placeOrder(request);
    }

    private Order placeOrder(OrderRequest request) {
        return new Order(request, ++lastId, LocalDate.now());
    }
}
