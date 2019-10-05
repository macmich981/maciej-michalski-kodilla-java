package com.kodilla.good.patterns.f2d;

import com.kodilla.good.patterns.food2door.Order;

public class OrderFoodProcess {
    private OrderFoodRespository orderFoodRespository = new OrderFoodRespository();

    public OrderDto run(Order order){
        boolean isOrder = order.process();
        if (isOrder) {
            orderFoodRespository.createOrder(order.getClass().getSimpleName(), order.getProduct(), order.getQuantity());
            return new OrderDto(order.getProduct(), order.getQuantity(), true);
        } else {
            return new OrderDto(order.getProduct(), order.getQuantity(), false);

        }
    }
}
