package com.kodilla.good.patterns.challenges.orderService;

import java.util.Set;

public interface OrderRepository {
    void createOrder(User user, Set<Product> products);
}
