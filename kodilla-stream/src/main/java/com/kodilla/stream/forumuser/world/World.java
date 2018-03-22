package com.kodilla.stream.forumuser.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class World {

    private String name;
    private final Set<Continent> listContinents = new HashSet<>();

    public World(String nameContinent) {
        this.name = nameContinent;
    }

    public void addContinent(Continent continent) {
        listContinents.add(continent);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPeopleQuantity() {
        return listContinents.stream()
                .flatMap(x-> x.getListCountry().stream())
                .map(w-> w.getNumberPeople())
                .reduce(BigDecimal.ZERO,(a,b)-> a.add(b));
    }

    @Override
    public String toString() {
        return "World{" +
                "name='" + name + '\'' +
                '}';
    }



}

