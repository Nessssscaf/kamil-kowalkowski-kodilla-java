package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GlutenFreeShop implements Producer {
    private Map<Product, Integer> listOfProducts;

    public GlutenFreeShop() {
        listOfProducts = createListOfProducts();
    }

    private Map<Product, Integer> createListOfProducts() {
        Map<Product, Integer> productList = new HashMap<>();

        productList.put(new Product("Rice", "White or brown"), 30);
        productList.put(new Product("Quinoa", "Perfect for everything"), 100);
        productList.put(new Product("Tapioca", "Delicious"), 25);
        productList.put(new Product("Coconut flour", "Healthy replacement"), 10);
        productList.put(new Product("Amaranth", "Satiated"), 15);

        return productList;
    }

    @Override
    public boolean process(Client client, Map<Product, Integer> productsOrder) {
        for (Map.Entry<Product, Integer> entry : productsOrder.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(listOfProducts.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("GlutenFreeShop: Out of stock. Sorry");
                return false;
            }
        }
        System.out.println("GlutenFreeShop: We have what you need!");
        return true;
    }
}