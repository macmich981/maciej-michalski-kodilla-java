package com.kodilla.good.patterns.food2door;

import java.util.Objects;

public class Company implements Order {
    private final String product;
    private final double quantity;

    public Company(final String product, final double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String getProduct() {
        return product;
    }

    @Override
    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean process() {
        System.out.println("Zamowienie: " + product + ", " + quantity);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Double.compare(company.quantity, quantity) == 0 &&
                Objects.equals(product, company.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, quantity);
    }

    @Override
    public String toString() {
        return "Company{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
