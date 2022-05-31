package com.kodilla.good.patterns.challenges;

import java.util.Set;

public class EmailService implements InformationService {

    public void inform(User user, Set<Product> products) {

        System.out.println("A new order has been added!");
        System.out.println(user + " ordered: " + products);
    }
}