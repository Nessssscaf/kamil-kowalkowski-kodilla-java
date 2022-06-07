package com.kodilla.good.patterns.challenges.orderService;

import java.util.Set;

public interface InformationService {
    void inform(User user, Set<Product> products);
}
