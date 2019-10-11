package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }
}
