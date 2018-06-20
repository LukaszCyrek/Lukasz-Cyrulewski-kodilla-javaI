package com.kodilla.good.patterns.challenges.firstchallenges;

import java.time.LocalDate;

public class ProductOrderService implements OrderService {
    public boolean order(User user, ProductType productType, LocalDate localDate) {
        ListOfProduct listOfProduct = new ListOfProduct();
        if(listOfProduct.createStorage().containsKey(productType.getType())) {
            System.out.println("Produkt " + productType.getType() + " został zamówiony " + localDate.toString()
                    + " przez " + user.getFirstName() + " " + user.getLastName());
            return true;
        } else {
            System.out.println("Produkt nie jest dostępny");
            return false;
        }

    }
}
