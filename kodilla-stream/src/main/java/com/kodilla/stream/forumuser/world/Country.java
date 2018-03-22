package com.kodilla.stream.forumuser.world;

import java.math.BigDecimal;

public final class Country {

    String name;
    BigDecimal numberPeople;

    public Country(String name, BigDecimal numberPeople) {
        this.name = name;
        this.numberPeople = numberPeople;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getNumberPeople() {
        return numberPeople;
    }

}
