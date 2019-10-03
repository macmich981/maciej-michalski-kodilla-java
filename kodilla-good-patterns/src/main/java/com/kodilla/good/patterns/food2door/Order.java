package com.kodilla.good.patterns.food2door;

public interface Order {
    String getProduct();
    double getQuantity();
    boolean process();
}
