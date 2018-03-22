package com.kodilla.stream.forumuser.world;


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class Continent {

        private final String name;
        private final Set<Country> listCountry = new HashSet<>();

        public Continent(String nameCountries) {
            this.name = nameCountries;
        }

        public String getName() {
            return name;
        }

    public Set<Country> getListCountry() {
        return listCountry;
    }

    public void addCountry(Country country) {
            listCountry.add(country);
        }
        @Override
        public String toString() {
            return "Continent{" +
                    "name='" + name + '\'' +
                    '}';
        }

    }

