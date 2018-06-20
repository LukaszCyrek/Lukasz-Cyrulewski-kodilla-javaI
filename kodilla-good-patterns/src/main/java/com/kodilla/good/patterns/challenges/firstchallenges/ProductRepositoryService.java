package com.kodilla.good.patterns.challenges.firstchallenges;

import java.time.LocalDate;

public class ProductRepositoryService implements OrderRepository{
    @Override
    public boolean createOrder(User user, ProductType productType, LocalDate localDate) {
        return true;
    }
}
