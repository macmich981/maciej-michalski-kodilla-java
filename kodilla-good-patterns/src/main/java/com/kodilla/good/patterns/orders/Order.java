package com.kodilla.good.patterns.orders;

import java.time.LocalDate;
import java.util.Objects;

public final class Order {
    private final OrderRequest request;
    private final int id;
    private final LocalDate localDate;

    public Order(OrderRequest request, int id, LocalDate localDate) {
        this.request = request;
        this.id = id;
        this.localDate = localDate;
    }

    public OrderRequest getRequest() {
        return request;
    }

    public int getId() {
        return id;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id &&
                Objects.equals(request, order.request) &&
                Objects.equals(localDate, order.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(request, id, localDate);
    }

    @Override
    public String toString() {
        return "Order{" +
                "request=" + request +
                ", id=" + id +
                ", localDate=" + localDate +
                '}';
    }
}
