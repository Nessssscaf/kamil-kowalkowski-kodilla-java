package com.kodilla.good.patterns.challenges.orderService;

import java.util.Set;

public class OrdersRepository implements OrderRepository {
    public void createOrder(User user, Set<Product> products) {
        System.out.println("New order ready to be issued : " + products);
    }
}
