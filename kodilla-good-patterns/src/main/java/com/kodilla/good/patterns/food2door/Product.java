package com.kodilla.good.patterns.food2door;

import java.util.Objects;

public final class Product {
    private final String productName;
    private final Contractor contractor;

    public Product(final String productName, final Contractor contractor) {
        this.productName = productName;
        this.contractor = contractor;
    }

    public String getProductName() {
        return productName;
    }

    public Contractors getContractorName() {
        return contractor.getContractorName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName) &&
                Objects.equals(contractor, product.contractor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, contractor);
    }
}

