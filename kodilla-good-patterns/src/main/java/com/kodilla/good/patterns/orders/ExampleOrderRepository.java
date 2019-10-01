package com.kodilla.good.patterns.orders;

public class ExampleOrderRepository implements OrderRepository {
    @Override
    public boolean create(Order order) {
        // return database.addOrder(order);
        // dummy result
        return true;
    }
}
