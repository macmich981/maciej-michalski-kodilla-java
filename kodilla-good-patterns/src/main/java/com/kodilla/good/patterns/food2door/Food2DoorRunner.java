package com.kodilla.good.patterns.food2door;

public class Food2DoorRunner {
    public static void main(String argsp[]) {
        ProductListRetriever productListRetriever = new ProductListRetriever();
        ProductList productList = productListRetriever.retrieve();

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        ShoppingList shoppingList = orderRequestRetriever.retrieve(productList.getProductList());

        Food2DoorProcessor extraFoodShopOrders = new Food2DoorProcessor(new ExtraFoodShop());
        extraFoodShopOrders.process(shoppingList);

        Food2DoorProcessor healthyShopOrders = new Food2DoorProcessor(new HealthyShop());
        healthyShopOrders.process(shoppingList);

        Food2DoorProcessor glutenFreeShopOrders = new Food2DoorProcessor(new GlutenFreeShop());
        glutenFreeShopOrders.process(shoppingList);
    }
}
