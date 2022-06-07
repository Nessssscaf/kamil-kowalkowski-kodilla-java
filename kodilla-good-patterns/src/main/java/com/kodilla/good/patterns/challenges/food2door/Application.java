package com.kodilla.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.processAllOrders(new OrderRetriever().retrieve());
    }
}