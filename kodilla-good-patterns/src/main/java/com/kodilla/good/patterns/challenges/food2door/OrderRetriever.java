package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriever {

    public List<OrderRequest> retrieve() {
        List<OrderRequest> orderRequestList = new ArrayList<>();

        Client client = new Client("Jan Kowalski");
        Producer producer = new ExtraFoodShop();
        Map<Product, Integer> productsList = new HashMap<>();
        productsList.put(new Product("Oatmeal", "A complete meal"), 2);
        productsList.put(new Product("Goji berries", "Full of vitamins"), 6);

        orderRequestList.add(new OrderRequest(client, producer, productsList));

        Client client1 = new Client("Kasia Nowak");
        Producer producer1 = new GlutenFreeShop();
        Map<Product, Integer> productsList1 = new HashMap<>();
        productsList1.put(new Product("Coconut flour", "Healthy replacement"), 9);
        productsList1.put(new Product("Amaranth", "Satiated"), 20);

        orderRequestList.add(new OrderRequest(client1, producer1, productsList1));

        Client client2 = new Client("Darth Bzdzion");
        Producer producer2 = new HealthyShop();
        Map<Product, Integer> productsList2 = new HashMap<>();
        productsList2.put(new Product("Bananas", "Yellow or brown"), 10);
        productsList2.put(new Product("Oranges", "Sweet or sour"), 7);

        orderRequestList.add(new OrderRequest(client2, producer2, productsList2));

        return orderRequestList;
    }
}