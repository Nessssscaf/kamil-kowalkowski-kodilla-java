package com.kodilla.good.patterns.challenges.orderService;

import java.util.HashSet;
import java.util.Set;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski", "kowalski@gmail.com");
        Set<Product> products = new HashSet<>();
        products.add(new Product("Kaszanka", 54, 4));
        products.add(new Product("Walkman", 199, 1));
        products.add(new Product("Szampon", 14, 2));
        products.add(new Product("Gwoździe", 7, 30));

        return new OrderRequest(user, products);
    }
}