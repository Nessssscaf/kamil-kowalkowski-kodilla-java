package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public interface Producer {
    boolean process(Client client, Map<Product, Integer> productOrders);
}