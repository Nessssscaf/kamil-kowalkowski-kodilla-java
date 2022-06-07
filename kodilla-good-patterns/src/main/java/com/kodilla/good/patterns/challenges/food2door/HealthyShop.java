package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HealthyShop implements Producer {

    private Map<Product, Integer> listOfProducts;

    public HealthyShop() {
        listOfProducts = createListOfProducts();
    }

    private Map<Product, Integer> createListOfProducts() {
        Map<Product, Integer> productList = new HashMap<>();

        productList.put(new Product("Apples", "Green or red"), 10);
        productList.put(new Product("Avocados", "Hass or from mexico"), 15);
        productList.put(new Product("Bananas", "Yellow or brown"), 12);
        productList.put(new Product("Oranges", "Sweet or sour"), 10);
        productList.put(new Product("Blueberries", "Perfect snack"), 10);

        return productList;
    }

    @Override
    public boolean process(Client client, Map<Product, Integer> productsOrder) {
        for (Map.Entry<Product, Integer> entry : productsOrder.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(listOfProducts.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("HealthyShop: Out of stock. Sorry");
                return false;
            }
        }
        System.out.println("HealthyShop: We have what you need!");
        return true;
    }
}