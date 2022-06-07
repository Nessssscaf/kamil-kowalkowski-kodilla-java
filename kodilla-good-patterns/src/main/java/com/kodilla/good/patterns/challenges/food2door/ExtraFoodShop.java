package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements Producer {

    private Map<Product, Integer> listOfProducts;

    public ExtraFoodShop() {
        listOfProducts = createListOfProducts();
    }

    private Map<Product, Integer> createListOfProducts() {
        Map<Product, Integer> productList = new HashMap<>();

        productList.put(new Product("Eggs", "Very healthy"), 30);
        productList.put(new Product("Oatmeal", "A complete meal"), 50);
        productList.put(new Product("Goji berries", "Full of vitamins"), 35);
        productList.put(new Product("Groats", "For every occasion"), 20);
        productList.put(new Product("Nuts", "Healthy fats"), 15);

        return productList;
    }

    @Override
    public boolean process(Client client, Map<Product, Integer> productsOrder) {
        for (Map.Entry<Product, Integer> entry : productsOrder.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(listOfProducts.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Extra Food Shop: Out of stock. Sorry");
                return false;
            }
        }
        System.out.println("Extra Food Shop: We have what you need!");
        return true;
    }
}