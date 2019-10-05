package com.kodilla.good.patterns.f2d;

import java.util.Objects;

public class OrderDto {
    private final String product;
    private final double quantity;
    private final boolean isOrder;

    public OrderDto(final String product, double quantity, final boolean isOrder) {
        this.product = product;
        this.quantity = quantity;
        this.isOrder = isOrder;
    }

    public String getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public boolean isOrder() {
        return isOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDto orderDto = (OrderDto) o;
        return Double.compare(orderDto.quantity, quantity) == 0 &&
                isOrder == orderDto.isOrder &&
                Objects.equals(product, orderDto.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, quantity, isOrder);
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                ", isOrder=" + isOrder +
                '}';
    }
}
