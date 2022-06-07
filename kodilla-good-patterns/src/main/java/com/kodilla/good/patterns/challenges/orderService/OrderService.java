package com.kodilla.good.patterns.challenges.orderService;

import java.util.Set;

public interface OrderService {
    boolean order(User user, Set<Product> products);
}
