package com.kodilla.good.patterns.challenges.orderService;

import java.util.Set;

public class OrderRequest {

    private User user;
    private Set<Product> products;

    public OrderRequest(User user, Set<Product> products) {
        this.user = user;
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public Set<Product> getProducts() {
        return products;
    }
}
