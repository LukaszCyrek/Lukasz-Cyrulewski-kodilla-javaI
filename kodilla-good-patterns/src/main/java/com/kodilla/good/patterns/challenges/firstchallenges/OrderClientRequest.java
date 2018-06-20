package com.kodilla.good.patterns.challenges.firstchallenges;

import java.time.LocalDate;

public class OrderClientRequest {
    public OrderRequest retrieve() {

        User user = new User("Lukasz", "Cyrulewski");

        ProductType productType = new ProductType("piłka");

        LocalDate transactionDate = LocalDate.now();

        OrderRequest order = new OrderRequest(user, productType, transactionDate);
        return order;
    }
}
