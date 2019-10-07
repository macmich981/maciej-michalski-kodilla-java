package com.kodilla.good.patterns.food2door;

import java.util.List;

public class ProductListRetriever {
    public ProductList retrieve() {
        ContractorRetriever contractorRetriever = new ContractorRetriever();
        List<Contractor> contractorList = contractorRetriever.retrieve().getContractorList();

        Product product = new Product("Chleb", contractorList.get(0));
        Product product1 = new Product("Mąka", contractorList.get(1));
        Product product2 = new Product("Jaja", contractorList.get(2));
        Product product3 = new Product("Cukier", contractorList.get(0));
        Product product4 = new Product("Woda", contractorList.get(1));
        Product product5 = new Product("Marchewka", contractorList.get(2));
        Product product6 = new Product("Czekolada", contractorList.get(0));
        Product product7 = new Product("Masło", contractorList.get(1));
        Product product8 = new Product("Ziemniaki", contractorList.get(2));
        Product product9 = new Product("Sok", contractorList.get(0));

        ProductList productList = new ProductList();
        productList.addProduct(product);
        productList.addProduct(product1);
        productList.addProduct(product2);
        productList.addProduct(product3);
        productList.addProduct(product4);
        productList.addProduct(product5);
        productList.addProduct(product6);
        productList.addProduct(product7);
        productList.addProduct(product8);
        productList.addProduct(product9);

        return productList;
    }
}
