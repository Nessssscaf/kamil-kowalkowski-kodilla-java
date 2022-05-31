package com.kodilla.good.patterns.challenges;

public class Product {

    private String product;
    private int value;
    private int quantity;

    public Product(String product, int value, int quantity) {
        this.product = product;
        this.value = value;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public int getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return  " >> " + product + ", value: " + value + " zł, " + quantity + " pieces";
    }
}
