package com.kodilla.good.patterns.challenges.orderService;

import java.util.Set;

public class ProductOrderService implements OrderService {

    public boolean order(final User user, Set<Product> products) {
        System.out.println("Customer: " + user.getName() + " " + user.getSurname() + " bought "
                + products);
        return true;
    }
}