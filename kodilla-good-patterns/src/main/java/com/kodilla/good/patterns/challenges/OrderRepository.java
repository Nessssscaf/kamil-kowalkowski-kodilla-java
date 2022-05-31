package com.kodilla.good.patterns.challenges;

import java.util.Set;

public interface OrderRepository {
    void createOrder(User user, Set<Product> products);
}
