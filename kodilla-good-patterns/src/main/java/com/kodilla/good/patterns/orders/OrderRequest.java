package com.kodilla.good.patterns.orders;

import java.util.Objects;

public final class OrderRequest {
    private final User user;
    private final Product product;
    private final int quantity;
    private final double totalPrice;

    public OrderRequest(User user, Product product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = product.getPrice() * quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRequest that = (OrderRequest) o;
        return quantity == that.quantity &&
                Objects.equals(user, that.user) &&
                Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, product, quantity);
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "user=" + user +
                ", product=" + product +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
