package com.kodilla.good.patterns.orders;

public final class OrderProcessResult {
    private final Order order;
    private final boolean isUserInformed;
    private final boolean isOrderStored;

    public OrderProcessResult(Order order, boolean isUserInformed, boolean isOrderStored) {
        this.order = order;
        this.isUserInformed = isUserInformed;
        this.isOrderStored = isOrderStored;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isUserInformed() {
        return isUserInformed;
    }

    public boolean isOrderStored() {
        return isOrderStored;
    }

    @Override
    public String toString() {
        return "OrderProcessResult{" +
                "order=" + order +
                ", isUserInformed=" + isUserInformed +
                ", isOrderStored=" + isOrderStored +
                '}';
    }
}
