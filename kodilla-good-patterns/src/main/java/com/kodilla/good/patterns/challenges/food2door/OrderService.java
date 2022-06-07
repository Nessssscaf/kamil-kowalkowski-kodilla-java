package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class OrderService {

    public void processAllOrders(List<OrderRequest> orderRequest) {

        orderRequest.stream()
                .map(n -> {
                    System.out.println("We're processing your order " + n.getClient().getName());
                    return n.getProducer().process(n.getClient(), n.getProductOrderRequest());
                })
                .forEach(t -> System.out.println("Order is finished" + "\n"));
    }
}