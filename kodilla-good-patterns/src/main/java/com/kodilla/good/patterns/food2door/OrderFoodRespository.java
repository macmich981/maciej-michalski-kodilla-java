package com.kodilla.good.patterns.food2door;

public class OrderFoodRespository {
    public boolean createOrder(String companyName, String product, double quantity) {
        System.out.println("Producent: " + companyName + ", Towar: " + product + ", Ilosc: " + quantity);
        return true;
    }
}
