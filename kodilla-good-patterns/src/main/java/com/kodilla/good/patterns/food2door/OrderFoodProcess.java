package com.kodilla.good.patterns.food2door;

public class OrderFoodProcess {
    private OrderFoodRespository orderFoodRespository;

    public OrderFoodProcess(OrderFoodRespository orderFoodRespository) {
        this.orderFoodRespository = orderFoodRespository;
    }

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
