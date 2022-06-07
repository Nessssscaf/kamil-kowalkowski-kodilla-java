package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class OrderRequest {

    private Client client;
    private Producer producer;
    private Map<Product, Integer> productOrderRequest;

    public OrderRequest(Client client, Producer producer, Map<Product, Integer> productOrderRequest) {
        this.client = client;
        this.producer = producer;
        this.productOrderRequest = productOrderRequest;
    }

    public Client getClient() {
        return client;
    }

    public Producer getProducer() {
        return producer;
    }

    public Map<Product, Integer> getProductOrderRequest() {
        return productOrderRequest;
    }
}